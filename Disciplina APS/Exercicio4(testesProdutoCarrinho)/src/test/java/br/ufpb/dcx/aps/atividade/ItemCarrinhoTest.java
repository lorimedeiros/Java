package br.ufpb.dcx.aps.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ItemCarrinhoTest {


    ItemCarrinho item;
    Produto produto;
    @BeforeEach
    void setup(){
        produto = new Produto("123","Sapato");
        produto.setPreco(big("0.0"));
        item = new ItemCarrinho(produto);
    }


    @Test
    void getProduto() {
        // casos esperados
        assertEquals(produto, item.getProduto());
        assertEquals(new Produto("123"),item.getProduto());

        //casos não esperados
        assertThrows(IllegalArgumentException.class, () -> new ItemCarrinho(null),"Produto inválido: null");
    }

    @Test
    void getQuantidade() {
        //casos esperados
        assertEquals(1,item.getQuantidade());
        item = new ItemCarrinho(produto,40);
        assertEquals(40,item.getQuantidade());

        //casos não esperados:
        assertThrows(IllegalArgumentException.class, () -> new ItemCarrinho(produto,0),"Quantidade inválida: 0");
        assertThrows(IllegalArgumentException.class, () -> new ItemCarrinho(produto,-1),"Quantidade inválida: -1");
    }

    @Test
    void getTotal() {
        //casos esperados
        assertEquals(big("0.0"),item.getTotal());

        item = new ItemCarrinho(produto,1);
        item.getProduto().setPreco("40.0");
        assertEquals(big("40.0"), item.getTotal());
        item.setQuantidade(5);
        assertEquals(big("200.0"), item.getTotal());


    }
//usado só pra reduzir digitação no teste:
    BigDecimal big(String valor){
        return new BigDecimal(valor);
    }

    @Test
    void incrementar() {
        //casos esperados:
        assertEquals(1,item.getQuantidade());
        item.incrementar(5);
        assertEquals(6,item.getQuantidade());
        item.incrementar(0);
        assertEquals(6,item.getQuantidade());

        //casos inesperados:
        assertThrows(IllegalArgumentException.class, ()-> item.incrementar(-1), "Valor inválido: -1");
    }

    @Test
    void setQuantidade() {
        //casos esperados:
        item.setQuantidade(30);
        assertEquals(30,item.getQuantidade());

        //casos inesperados
        assertThrows(IllegalArgumentException.class,() -> item.setQuantidade(-1), "Valor inválido: -1");
    }
}