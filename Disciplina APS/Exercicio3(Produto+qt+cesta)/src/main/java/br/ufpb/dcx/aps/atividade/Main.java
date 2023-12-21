package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto("001", "tv", new BigDecimal(2000));
        ProdutoParaCesta pc = new ProdutoParaCesta(p, 2);
        System.out.println(pc.valorTotalProduto());
        System.out.println();
        //deu certo, amém

        ProdutoParaCesta pc2 = new ProdutoParaCesta(new Produto("002", "hq", new BigDecimal(40)), 5);

        Cesta c = new Cesta();
        c.adicionaProduto(pc);
        c.adicionaProduto(pc2);
        System.out.println(c.valorTotalCesta());
        System.out.println();
        System.out.println(c.toString());

    }
}
