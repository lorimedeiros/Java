//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos terá o vetor? ");
        int n = Integer.parseInt(sc.nextLine());

        int[] vect = new int[n];
        double somaPares = 0;
        int qtPares = 0;

        for (int i = 0; i < n; i++){

            System.out.printf("Digite um número: ");
            int numero = Integer.parseInt(sc.nextLine());
            vect[i] = numero;

            if (numero % 2 == 0){

                somaPares += numero;
                qtPares += 1;

            }

        }

        double media = somaPares / qtPares;

        if (somaPares != 0){

            System.out.printf("Média dos pares: %.1f", media);

        } else {

            System.out.println("Nenhum número par");

        }

        sc.close();

    }
}
