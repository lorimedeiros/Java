package Back;

import java.time.LocalDate;

public class Tosa extends ServicoBase {

    private char tamanho;

    public Tosa(LocalDate data, Integer codigo, String descricao, char tamanho){
        super(data, codigo, descricao);
        this.tamanho = tamanho;
    }

    public char getTamanho(){
        return tamanho;
    }

    @Override
    public Double getPreco(){
        if (tamanho == 'P' || tamanho == 'p'){
            return 22.0;
        } else if (tamanho == 'M' || tamanho == 'm'){
            return 30.0;
        } else if (tamanho == 'G' || tamanho == 'g'){
            return 40.0;
        }
        return null;
    }

    @Override
    public String toString(){
        return "Código de serviço: " + getCodigo() + "\nServiço: " + getDescricao() + "\nData: " + getData() + "\nValor pago: " + getPreco();
    }

}
