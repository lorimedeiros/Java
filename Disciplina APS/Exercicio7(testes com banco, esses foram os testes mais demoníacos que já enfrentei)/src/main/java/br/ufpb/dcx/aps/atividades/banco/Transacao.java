package br.ufpb.dcx.aps.atividades.banco;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Transacao {
    Locale brasil = new Locale("pt", "BR");
    private int id;
    private double valor;
    private Calendar data = Calendar.getInstance();
    private String tipo;

    public Transacao(int id, double valor) {
        this.id = id;
        this.valor = valor;
        data.setTime(new Date());
    }

    public double getValor(){
        return valor;
    }

    public int getId(){
        return id;
    }

    public Date getDataTransacao(){
        return data.getTime();
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(brasil);
        String valorFormatado = nf.format(valor);
        valorFormatado = valorFormatado.replace("\u00a0", " "); // Substitui NBSP por espaço
        String str = "";
        if (tipo.equals("CRÉDITO")){

            str += "CRÉDITO\t" + valorFormatado;
        } else if (tipo.equals("DÉBITO")){
            str += "DÉBITO\t" + valorFormatado;
        }
        return str;
    }
}
