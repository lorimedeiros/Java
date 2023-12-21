package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    private String codigo;
    private String nome;
    private BigDecimal preco;

    public Produto(String codigo, String nome, BigDecimal preco) {
        int comparacao = preco.compareTo(BigDecimal.ZERO);
        if (comparacao <= 0) throw new IllegalArgumentException("Preço informado inválido");

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        int comparacao = preco.compareTo(BigDecimal.ZERO);
        if (comparacao <= 0) throw new IllegalArgumentException("Preço informado inválido");

        this.preco = preco;
    }

    /*
    outra forma de fazer o setPreco:
    public void setPreco(String preco){
        this.setPreco(new BigDecimal(preco)); //recebendo String e transformando em BD
    }
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Produto:\n" +
                "codigo: " + codigo +
                "\nnome: " + nome +
                "\npreco: " + preco;
    }
}
