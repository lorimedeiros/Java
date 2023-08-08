//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números deseja digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        int[] vect = new int[n];
        int qtPares = 0;

        for (int i = 0; i < n; i++){

            System.out.printf("Digite um número: ");
            int numero = Integer.parseInt(sc.nextLine());
            vect[i] = numero;

        }

        System.out.println("Números pares: ");
        for (int i = 0; i < n; i++){

            if (vect[i] % 2 == 0){

                System.out.printf("%d ", vect[i]);
                qtPares += 1;

            }

        }

        System.out.println();
        System.out.printf("Quantidade de pares: %d", qtPares);

        sc.close();

    }
}
