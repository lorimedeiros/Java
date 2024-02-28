package br.ufpb.dcx.rodrigor.atividade;

import java.util.HashMap;

public class App {
    public static void main(String[] argsadd) throws Exception {

        Hotel h = new Hotel();
        iniciaHotel(h);

    }

    public static void iniciaHotel(Hotel h) throws Exception {
        h.registraQuartos(new Quarto("01", "simples", 100.0));
        h.registraQuartos(new Quarto("02", "simples", 100.0));
        h.registraQuartos(new Quarto("03", "simples", 100.0));
        h.registraQuartos(new Quarto("04", "simples", 100.0));
        h.registraQuartos(new Quarto("05", "simples", 100.0));
        h.registraQuartos(new Quarto("06", "simples", 100.0));
        h.registraQuartos(new Quarto("07", "simples", 100.0));
        h.registraQuartos(new Quarto("08", "luxo", 250.0));
        h.registraQuartos(new Quarto("09", "luxo", 250.0));
        h.registraQuartos(new Quarto("10", "luxo", 250.0));
    }
}
