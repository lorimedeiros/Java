package br.ufpb.dcx.aps.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto produto;

    @BeforeEach
    void setup(){
        produto = new Produto("123","Sapato");
    }

    @Test
    void testCodigo() {
        //casos esperados
        assertEquals("123",produto.getCodigo());

        //casos não esperados
        assertThrows(IllegalArgumentException.class, () -> new Produto(null),"O código do produto não pode ser null");
        assertThrows(IllegalArgumentException.class, () -> new Produto(""),"O código do produto não pode ser vazio");

    }

    @Test
    void testNome() {
        //casos esperados
        assertEquals("Sapato",produto.getNome());

        Produto pteste = new Produto("321");
        assertEquals("",pteste.getNome());

        //casos não esperados

        assertThrows(IllegalArgumentException.class,() -> produto.setNome(null), "O nome do produto não pode ser null");
        assertThrows(IllegalArgumentException.class,() -> produto.setNome("29308"), "O nome do produto não pode conter apenas números");
        assertThrows(IllegalArgumentException.class,() -> produto.setNome("         "),"O nome do produto não pode conter apenas espaços vazios");
    }

    @Test
    void testPreco() {
        //casos esperados
        assertEquals(big(0.0), produto.getPreco(),"O valor inicial do produto deve ser 0.0!");
        produto.setPreco("40.0");
        assertEquals(big("40.0"),produto.getPreco());

        //casos não esperados

        assertThrows(IllegalArgumentException.class,() -> produto.setPreco(big(-1)), "O valor do produto não pode ser negativo");
        assertThrows(IllegalArgumentException.class,() -> produto.setPreco((String) null), "O valor do produto não pode se null");
        assertThrows(IllegalArgumentException.class,() -> produto.setPreco(big(null)), "O valor do produto não pode se null");
    }

    // Método para ajudar nos testes. Reduzir o código para criar BigDecimals :-P
    private BigDecimal big(double valor){
        return new BigDecimal(valor);
    }

    // Método para ajudar nos testes. Reduzir o código para criar BigDecimals :-P
    private BigDecimal big(String valor){
        if(valor == null) return null;
        return new BigDecimal(valor);
    }

    @Test
    void testEquals() {

        Produto p1 = new Produto("123","Sapato A");
        Produto p2 = new Produto("123","Sapato B");
        assertEquals(p1,p2, "Dois produtos são iguais se tiverem códigos iguais, independente dos seus nomes e preços");
    }

    @Test
    void testHashCode() {
        Produto p1 = new Produto("123","Sapato A");
        Produto p2 = new Produto("123","Sapato B");
        assertEquals(p1.hashCode(),p2.hashCode(), "Os hashcodes de dois produtos com o mesmo código devem ser iguais");
    }
}