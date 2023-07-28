//informa ímpares em ordem crescente, de 1 até o número informado pelo usuário

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o número:");
       int parada = Integer.parseInt(sc.nextLine());

       for (int i = 0; parada >= i; i++) {
           if (i % 2 != 0) {
               System.out.println(i);
           }
       }

       sc.close();

   }
}
