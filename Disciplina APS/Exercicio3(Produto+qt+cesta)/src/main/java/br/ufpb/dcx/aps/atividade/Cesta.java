package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cesta {

    ArrayList <ProdutoParaCesta> produtos = new ArrayList<>();

    public void adicionaProduto(ProdutoParaCesta pc){
        if (pc.getQuantidade() == 0) throw new IllegalArgumentException("Quantidade de produtos não pode ser nula");
        produtos.add(pc);
    }

    public BigDecimal valorTotalCesta(){
        BigDecimal total = new BigDecimal(0.0);

        for (ProdutoParaCesta pc : produtos) {
            total = total.add(pc.valorTotalProduto());
        }

        return total;
    }

    @Override
    public String toString() {
        String str = "";

        for (ProdutoParaCesta pc : produtos) {
            str += pc.toString() + "\n";
        }

        return str;
    }
}
