package br.ufpb.dcx.aps.atividade.Back;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Transacao {

    Calendar c = Calendar.getInstance();
    DateFormat fmt = DateFormat.getDateInstance(DateFormat.SHORT);

    private String tipo;
    private BigDecimal valor;
    private String data;

    public Transacao(String tipo, BigDecimal valor){

        this.tipo = tipo;
        this.valor = valor;
        Date d = c.getTime();
        data = fmt.format(d);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return Objects.equals(tipo, transacao.tipo) && Objects.equals(valor, transacao.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, valor);
    }

    @Override
    public String toString() {
        return "Transacao:\n" +
                "tipo: " + tipo +
                ", valor: " + valor +
                ", data: " + data;
    }
}
