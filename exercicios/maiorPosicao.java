//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero). 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números deseja digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        double[] vect = new double[n];
        double maiorValor = 0;
        int posicaoMaiorValor = 0;
        int i;

        for (i = 0; i < n; i++){

            System.out.printf("Digite um número: ");
            double numero = Double.parseDouble(sc.nextLine());
            vect[i] = numero;

            if (numero > maiorValor){

                maiorValor = numero;
                posicaoMaiorValor = i;

            }

        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaiorValor);

        sc.close();

    }
}
