package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarrinhoCompras {

    private Map<String,ItemCarrinho> itens = new LinkedHashMap<>();


    public void addProduto(Produto produto, int quantidade){
        if (produto == null) throw new IllegalArgumentException("Argumento inválido: produto = null");
        if (quantidade < 0) throw new IllegalArgumentException("Argumento inválido: quantidade = " + quantidade);
        this.itens.put(produto.getCodigo(), new ItemCarrinho(produto, quantidade));
    }

    public void addProduto(Produto produto){
        if (produto == null) throw new IllegalArgumentException("Argumento inválido: null");

        if (this.existe(produto.getCodigo())){
            ItemCarrinho ic = getItem(produto.getCodigo());
            ic.incrementar(1);
        } else {
            this.addProduto(produto, 1);
        }
    }

    public void setQuantidade(String codProduto, int quant) throws Exception {
        if (codProduto == null) throw new IllegalArgumentException("Código de produto inválido: null");
        if (quant < 0) throw new IllegalArgumentException("Quantidade inválida: " + quant);
        if (!existe(codProduto)) throw new Exception("Produto inexistente! código:'" + codProduto +"'");
        this.itens.get(codProduto).setQuantidade(quant);
    }

    public Produto removerProduto(String codProduto){
        Produto produto = new Produto(codProduto);
        this.itens.remove(produto.getCodigo());
        return produto;
    }

    public int getQuantidadeItens(){
        return this.itens.size();
    }

    public BigDecimal getTotal(){
        BigDecimal total = BigDecimal.valueOf(0);
        for(ItemCarrinho item: itens.values()){
            total = total.add(item.getTotal());
        }
        return total;
    }


    public ItemCarrinho getItem(String codProduto) {
        return itens.get(codProduto);
    }

    public boolean existe(String codProduto) {
        return this.itens.containsKey(codProduto);
    }
}
