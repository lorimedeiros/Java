//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos terá o vetor? ");
        int n = Integer.parseInt(sc.nextLine());

        double[] vect = new double[n];
        double media, soma = 0;
        String elemnetosAbaixoDaMedia = "";

        for (int i = 0; i < n; i++){

            System.out.printf("Digite um número: ");
            double numero = Double.parseDouble(sc.nextLine());

            soma += numero;
            vect[i] = numero;

        }

        media = soma / n;

        for (int i = 0; i < n; i++){

            if(vect[i] < media){

                elemnetosAbaixoDaMedia += vect[i] + "\n";

            }

        }

        System.out.printf("Media do vetor: %.3f\n", media);
        System.out.println("Elementos abaixo da média:");
        System.out.println(elemnetosAbaixoDaMedia);

        sc.close();

    }
}
