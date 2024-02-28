package br.ufpb.dcx.rodrigor.atividade;

import java.util.Date;

public class Reserva {
    private Quarto quarto;
    private Date dataReserva;

    public Reserva(Quarto quarto, Date dataReserva) {
        if (quarto == null) throw new IllegalArgumentException("Quarto não pode ser null");
        if (dataReserva == null) throw new IllegalArgumentException("Data não pode ser null");

        this.quarto = quarto;
        this.dataReserva = dataReserva;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

}
