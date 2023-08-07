//recebe 10 números do usuario e informa a quantidade de números pares e ímpares informados

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {

        int numImp = 0;
        int numPar = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){

            int num = Integer.parseInt(sc.nextLine());

            if (num % 2 == 0) {
                numPar++;
            } else {
                numImp++;
            }

        }

        System.out.println("Foram informados " + numPar + " números pares");
        System.out.println("Foram informados " + numImp + " números ímpares");

        sc.close();

    }
}
