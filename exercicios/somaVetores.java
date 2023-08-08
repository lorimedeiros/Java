//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos valores terá cada vetor? ");
        int n = Integer.parseInt(sc.nextLine());

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];


        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++){

            int numero = Integer.parseInt(sc.nextLine());
            vectA[i] = numero;

        }


        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++){

            int numero = Integer.parseInt(sc.nextLine());
            vectB[i] = numero;

        }


        System.out.println("Vetor resultante:");
        for (int i = 0; i < n; i++){

            int numero = vectA[i] + vectB[i];
            vectC[i] = numero;
            System.out.println(vectC[i]);

        }

        sc.close();

    }
}
