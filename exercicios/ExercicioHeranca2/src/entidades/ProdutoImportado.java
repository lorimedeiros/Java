package entidades;
import entidades.Produto;
public class ProdutoImportado extends Produto {

    private Double taxaDeImportacao;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaDeImportacao){
        super(nome, preco);
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public Double getTaxaDeImportacao(){
        return taxaDeImportacao;
    }

    public Double precoTotal(){
        return super.getPreco() + taxaDeImportacao;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTaxa de importação: " + getTaxaDeImportacao() + "\nPreço total: " + precoTotal();
    }

}
