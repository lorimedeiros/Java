package entities;

import exceptions.ExcecaoDeDominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroDoQuarto;
    private Date entrada;
    private Date saida;

    //apenas determinando o formato da data
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(){}

    public Reserva(Integer numeroDoQuarto, Date entrada, Date saida) throws ExcecaoDeDominio{
        if (entrada.after(saida)){
            throw new ExcecaoDeDominio("Erro em realizar a reserva. Data de saída deve ser depois da entrada.");
        }
        this.numeroDoQuarto = numeroDoQuarto;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public long duracao(){
        long diferenca = saida.getTime() - entrada.getTime(); //pega a diferença entre as datas, porem em milissegundos
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS); //converte esses milissegundos para dias
    }

    public void atualizaDatas(Date entrada, Date saida) throws ExcecaoDeDominio{
        //é necessário propagar a exceção(com o throws), já que o programa principal já irá tratar(com o try-catch)

        Date agora = new Date();
        if (entrada.before(agora) || saida.before(agora)){
            throw new ExcecaoDeDominio("Erro em realizar a reserva. Data de entrada e saída devem ser futuras às anteriores.");
        }
        if (entrada.after(saida)){
            throw new ExcecaoDeDominio("Erro em realizar a reserva. Data de saída deve ser depois da entrada.");
        }
        // esse "IllegalArgumentException" é uma exceção caso o input não seja aceito por n motivos(os ifs)

        this.entrada = entrada;
        this.saida = saida;

    }

    //é importante botar o override no toString pois o método é herdado da classe Object
    @Override
    public String toString(){
        return "Reserva:\n" +
                "Quarto " + getNumeroDoQuarto() + "\n" +
                "Check-in " + sdf.format(getEntrada()) + "\n" +
                "Check-out " + sdf.format(getSaida()) + "\n" +
                duracao() + " noites";
    }
}
