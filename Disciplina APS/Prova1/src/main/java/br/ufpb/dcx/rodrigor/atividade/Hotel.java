package br.ufpb.dcx.rodrigor.atividade;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    private HashMap <String, Quarto> quartosDisponiveis = new HashMap<>();
    private HashMap <Quarto, Hospede> quartosReservados = new HashMap<>();
    private List<Reserva> historicoReservas = new ArrayList<>();

    public void reservar(Hospede h, Quarto q) throws Exception {
        if (quartosDisponiveis.containsValue(q)){
            historicoReservas.add(new Reserva(q, Date.from(Instant.now())));
            quartosReservados.put(q, h);
            quartosDisponiveis.remove(q.getCodigo());
        } else {
            throw new Exception("Quarto não disponível ou já reservado");
        }
    }

    public void registrarSaida(Quarto q) throws Exception {
        if (quartosReservados.containsValue(q)){
            quartosDisponiveis.put(q.getCodigo(), q);
            quartosReservados.remove(q);
        } else {
            throw new Exception("Quarto não reservado");
        }
    }

    public void registraQuartos(Quarto q) throws Exception {
        if (q == null) throw new IllegalArgumentException("Quarto não pode ser null");
        if (quartosDisponiveis.size() == 10) throw new Exception("limite de quartos atingido");
        quartosDisponiveis.put(q.getCodigo(), q);
    }

    public HashMap listarQuartosDisponiveis(){
        return quartosDisponiveis;
    }

    public HashMap listarReservados(){
        return quartosReservados;
    }

}
