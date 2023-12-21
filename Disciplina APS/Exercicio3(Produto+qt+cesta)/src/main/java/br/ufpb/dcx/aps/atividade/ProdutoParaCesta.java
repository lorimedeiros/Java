package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;

public class ProdutoParaCesta {

    private Produto produto;
    private Integer quantidade;

    public ProdutoParaCesta(Produto produto, Integer quantidade) {
        if (quantidade < 0) throw new IllegalArgumentException("Quantidade de produto não pode ser negativa");
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void acrescentaQt(Integer qt){
        quantidade += qt;
    }

    public BigDecimal valorTotalProduto(){
        return produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
    }

    @Override
    public String toString() {
        return "ProdutoParaCesta:\n" +
                "produto:\n{" + produto.toString() + "}\n" +
                "quantidade: " + quantidade;
    }
}
