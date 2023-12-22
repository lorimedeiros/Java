package br.ufpb.dcx.aps.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.nio.channels.FileLockInterruptionException;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoComprasTest {

    CarrinhoCompras carrinho;

    @BeforeEach
    void setup(){
        carrinho = new CarrinhoCompras();
    }

    @Test
    void addProduto() {
        //casos esperados
        assertEquals(0,carrinho.getQuantidadeItens());

        Produto produto = new Produto("123");
        carrinho.addProduto(produto);
        assertEquals(1,carrinho.getQuantidadeItens(),"espera-se apenas 1 item");
        assertEquals(produto,carrinho.getItem("123").getProduto());
        assertEquals(1,carrinho.getItem("123").getQuantidade(),"Espera-se que haja apenas 1 produto com código '123'");


        carrinho.addProduto(new Produto("456"));
        assertEquals(2,carrinho.getQuantidadeItens(),"Esperam-se dois itens no carrinho: `123` e `456`");
        assertEquals(1,carrinho.getItem("456").getQuantidade(),"Espera-se que haja apenas 1 produto com código '456'");

        carrinho.addProduto(new Produto("456"));
        assertEquals(2,carrinho.getQuantidadeItens());
        assertEquals(2,carrinho.getItem("456").getQuantidade(),"Agora espera-se que haja quantidade 2 do produto `456`");
        carrinho.addProduto(new Produto("456"));
        assertEquals(3,carrinho.getItem("456").getQuantidade(),"Agora espera-se que haja quantidade 3 do produto `456`");


        //casos inesperados
        assertThrows(IllegalArgumentException.class, () -> carrinho.addProduto(null), "Argumento inválido: null");
        assertThrows(IllegalArgumentException.class, () -> carrinho.addProduto(null,1), "Argumento inválido: produto = null");
        Produto prod = new Produto("234234");
        assertThrows(IllegalArgumentException.class, () -> carrinho.addProduto(prod,-1), "Argumento inválido: quantidade = -1");

    }

    @Test
    void testQuantidade() throws Exception {
        //casos esperados

        carrinho.addProduto(new Produto("123"));
        assertEquals(1,carrinho.getItem("123").getQuantidade());

        carrinho.setQuantidade("123",5);
        assertEquals(5,carrinho.getItem("123").getQuantidade());

        //casos inesperados

        assertThrows(IllegalArgumentException.class, () -> carrinho.setQuantidade("123",-1),"Quantidade inválida: -1");
        assertThrows(IllegalArgumentException.class, () -> carrinho.setQuantidade(null,-1),"Código de produto inválido: null");
        Exception e = assertThrows(Exception.class, () -> carrinho.setQuantidade("555",2), "Não deve ser possível definir uma quantidade para um produto que não está no carrinho");
        assertEquals("Produto inexistente! código:'555'",e.getMessage());

    }

    @Test
    void testExist(){
        assertFalse(carrinho.existe("444"));

        carrinho.addProduto(new Produto("444"));
        assertTrue(carrinho.existe("444"));
    }

    @Test
    void removerProduto() {

        carrinho.addProduto(new Produto("444"));
        assertTrue(carrinho.existe("444"));
        assertEquals(1,carrinho.getQuantidadeItens());

        carrinho.removerProduto("444");
        assertFalse(carrinho.existe("444"));
        assertEquals(0,carrinho.getQuantidadeItens());

    }

    @Test
    void testTotal() throws Exception {
        assertEquals(big(0.0),carrinho.getTotal());

        carrinho.addProduto(new Produto("111","Produto 1",big(100.0)));
        assertEquals(big(100.0),carrinho.getTotal());
        carrinho.addProduto(new Produto("222","Produto 2",big(50.0)));
        assertEquals(big(150.0),carrinho.getTotal());
        carrinho.setQuantidade("222",2);
        assertEquals(big(200.0),carrinho.getTotal());
        carrinho.removerProduto("111");
        assertEquals(big(100.0),carrinho.getTotal());

    }

    BigDecimal big(double valor){
        return new BigDecimal(valor);
    }
}