import banco.entidades.Conta;
import banco.entidades.Pessoa;

import java.util.Random;
public class Loteria {
    public static void main(String[] args) {

        Pessoa lori = new Pessoa("Lori","074.038.134-21");
        Conta contaLori = new Conta(lori) {
            @Override
            public long getNúmero() {
                return super.getNúmero();
            }
        };

        Double saldoDerrota = 0.0;
        boolean k = win(true || false);
        if (k == false){
            Double ganho = 0.0;
            contaLori.depositar(ganho);
        } else {
            Double ganho = loteria(1000000.0);
            contaLori.depositar(ganho);
        }

        System.out.println(contaLori.getSaldo());

    }

    public static boolean win(boolean venceu) {

        Random win = new Random();
        boolean ganhou = true;
        return win.nextBoolean();


    }
    public static double loteria(double valorMaximoDoPremio) {

        Random rand = new Random();
        return rand.nextDouble(1000000);

    }}
