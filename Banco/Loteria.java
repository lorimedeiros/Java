import banco.entidades.Conta;
import banco.entidades.Pessoa;
import java.util.Random;
public class Loteria {
    public static void main(String[] args) {

        Random r = new Random();

        int premioMaximo = 1000000;
        int quantoGanhou = loteria(premioMaximo);

        System.out.println("Clarice ganhou R$" + quantoGanhou);

        Pessoa Clarice = new Pessoa("Clarice", "111222333-44");

        Conta contaClarice = new Conta(Clarice) {
            @Override
            public long getNúmero() {
                return super.getNúmero();


            }
        };
        contaClarice.depositar(1000);
        contaClarice.depositar(quantoGanhou);

        System.out.println("Novo saldo: R$" + contaClarice.getSaldo());


    }
    private static int loteria(int premioMaximo) {


        Random rand = new Random();


        return rand.nextInt(premioMaximo);
    }


}
