package entidades;
import entidades.Produto;

import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date dataDeFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao){
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao(){
        return dataDeFabricacao;
    }

    @Override
    public String toString(){
        return super.toString() + "\nData de fabricação: " + getDataDeFabricacao();
    }

}
