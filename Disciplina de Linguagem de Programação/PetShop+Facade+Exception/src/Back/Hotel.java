package Back;

import java.time.LocalDate;

public class Hotel extends ServicoBase {

    private char tamanho;
    private Integer horas;

    public Hotel(LocalDate data, Integer codigo, String descricao, char tamanho, Integer horas){
        super(data, codigo, descricao);
        if (tamanho != 'P' && tamanho != 'p' && tamanho != 'M' && tamanho != 'm' && tamanho != 'G' && tamanho != 'g'){
            throw new IllegalArgumentException("Informação inválida");
        }
        if (horas <= 0) {
            throw new IllegalArgumentException("Informação inválida");
        }
        this.tamanho = tamanho;
        this.horas = horas;
    }

    public char getTamanho(){
        return tamanho;
    }

    public Integer getHoras(){
        return horas;
    }

    @Override
    public Double getPreco(){
        if (tamanho == 'P' || tamanho == 'p'){
            return horas * 12.0;
        } else if (tamanho == 'M' || tamanho == 'm'){
            return horas * 18.0;
        } else if (tamanho == 'G' || tamanho == 'g'){
            return horas * 25.0;
        }
        return null;
    }

    @Override
    public String toString(){
        return "Código de serviço: " + getCodigo() + "\nServiço: " + getDescricao() + "\nData: " + getData() + "\nValor pago: " + getPreco();
    }

}
