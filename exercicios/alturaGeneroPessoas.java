//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão registradas? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] pessoas = new String[n];

        double maior = 0, menor = 5, soma = 0, media = 0;
        int qtHomens = 0, qtMulheres = 0;

        for (int i = 0; i < n; i++){

            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = Double.parseDouble(sc.nextLine());
            System.out.printf("Genero da %da pessoa: ", i + 1);
            String genero = sc.nextLine().toUpperCase();

            if (altura > maior){

                maior = altura;

            }

            if (altura < menor){

                menor = altura;

            }

            if (genero.equalsIgnoreCase("F")){

                soma += altura;
                qtMulheres += 1;

            }

            if (genero.equalsIgnoreCase("M")){

                qtHomens += 1;

            }

        }

        media = soma / qtMulheres;

        System.out.printf("Menor altura: %.2f\n", menor);
        System.out.printf("Maior altura: %.2f\n", maior);
        System.out.printf("Média da altura das mulheres: %.2f\n", media);
        System.out.printf("Número de homens: %d", qtHomens);

        sc.close();

    }
}
