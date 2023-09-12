import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        RepositorioDeVoadores lista = new RepositorioDeVoadores();

        for (int i = 0; i < 10; i++) {

            int tipoAleatorio = rd.nextInt(3);

            if (tipoAleatorio == 0){
                lista.adicionaVoador(new GalinhaVoadora());
            } else if (tipoAleatorio == 1){
                lista.adicionaVoador(new Drone("drone " + i));
            } else if (tipoAleatorio == 2){
                lista.adicionaVoador(new UrubuDoPix());
            }

        }

        lista.fazTodosVoarem();
        lista.fazTodosPlanarem();
        lista.fazTodosPousarem();

        sc.close();

    }
}