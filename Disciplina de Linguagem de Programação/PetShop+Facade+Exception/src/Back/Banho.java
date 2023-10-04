package Back;

import java.time.LocalDate;

public class Banho extends ServicoBase {

    private char tamanho;
    private char pelo;

    public Banho(LocalDate data, Integer codigo, String descricao, char pelo, char tamanho){
        super(data, codigo, descricao);
        if (pelo != 'P' && pelo != 'p' && pelo != 'M' && pelo != 'm' && pelo != 'L' && pelo != 'l'){
            throw new IllegalArgumentException("Informação inválida");
        }
        if (tamanho != 'P' && tamanho != 'p' && tamanho != 'M' && tamanho != 'm' && tamanho != 'G' && tamanho != 'g'){
            throw new IllegalArgumentException("Informação inválida");
        }
        this.pelo = pelo;
        this.tamanho = tamanho;
    }

    public char getTamanho(){
        return tamanho;
    }

    public char getPelo(){
        return pelo;
    }

    public Double acrescimo(){
        if (pelo == 'P' || pelo == 'p'){
            return 0.0;
        } else if (pelo == 'M' || pelo == 'm'){
            return 10.0;
        } else if (pelo == 'L' || pelo == 'l'){
            return 20.0;
        }
        return null;
    }

    @Override
    public Double getPreco(){
        if (tamanho == 'P' || tamanho == 'p'){
            return 20.0 + acrescimo();
        } else if (tamanho == 'M' || tamanho == 'm'){
            return 30.0 + acrescimo();
        } else if (tamanho == 'G' || tamanho == 'g'){
            return 40.0 + acrescimo();
        }
        return null;
    }

    @Override
    public String toString(){
        return "Código de serviço: " + getCodigo() + "\nServiço: " + getDescricao() + "\nData: " + getData() + "\nValor pago: " + getPreco();
    }

}
