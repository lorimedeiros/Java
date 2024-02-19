package br.ufpb.dcx.aps.atividades.banco;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] argsadd) throws BancoException {

        System.out.println("Alo Mundo");

        //talvez mudar como é lida a data
        Calendar d = Calendar.getInstance();
        Date date = new Date();

        d.setTime(date);

        System.out.println(d);
        System.out.println(date.toString());

    }
}
