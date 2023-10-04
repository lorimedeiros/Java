package Back;

import java.time.LocalDate;
import java.util.ArrayList;

public class InventarioDeServicos {

    ArrayList <Servico> hist = new ArrayList<>();

    public void addBanho(char pelo, char tamanho){

        Banho b = new Banho(LocalDate.now(), hist.size() + 1, "Banho", pelo, tamanho);
        hist.add(b);

    }

    public void addTosa(char tamanho){

        Tosa t = new Tosa(LocalDate.now(), hist.size() + 1, "Tosa", tamanho);
        hist.add(t);

    }

    public void addHotel(char tamanho, Integer horas){

        Hotel h = new Hotel(LocalDate.now(), hist.size() + 1, "Hotel", tamanho, horas);
        hist.add(h);

    }

    public String retornaBanho(){
        String str = "";

        for (int i = 0; i < hist.size(); i++){

            Servico test = hist.get(i);
            if (test instanceof Banho){
                str += test.toString() + "\n";
            }

        }

        return str;
    }

    public String retornaTosa(){
        String str = "";

        for (int i = 0; i < hist.size(); i++){

            Servico test = hist.get(i);
            if (test instanceof Tosa){
                str += test.toString() + "\n";
            }

        }

        return str;
    }

    public String retornaHotel(){
        String str = "";

        for (int i = 0; i < hist.size(); i++){

            Servico test = hist.get(i);
            if (test instanceof Hotel){
                str += test.toString() + "\n";
            }

        }

        return str;
    }

    public String retornaTudoDetalhado(){
        String str = "";

        for (int i = 0; i < hist.size(); i++){

            Servico test = hist.get(i);
            str += test.toString() + "\n";

        }

        return str;
    }

    public String retornaTudoResumo(){

        int qtdeBanho = 0;
        int qtdeTosa = 0;
        int qtdeHotel = 0;
        int totalServicos = hist.size();
        double totalArrecadado = 0.0;

        for (int i = 0; i < hist.size(); i++) {

            Servico test = hist.get(i);
            if (test instanceof Tosa){

                qtdeTosa += 1;
                totalArrecadado += test.getPreco();

            } else if (test instanceof Banho) {

                qtdeBanho += 1;
                totalArrecadado += test.getPreco();

            } else if (test instanceof Hotel) {

                qtdeHotel += 1;
                totalArrecadado += test.getPreco();

            }

        }

        return "Banhos: " + qtdeBanho + "\nTosas: " + qtdeTosa + "\nHotéis: " + qtdeHotel + "\nTotal de serviços realizados: " + totalServicos + "\nTotal arrecadado: " + totalArrecadado;

    }

}
