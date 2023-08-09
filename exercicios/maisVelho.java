//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas vai informar? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] vectNomes = new String[n];
        int[] vectIdades = new int[n];
        int maiorIdade = 0;
        String maisVelho = "";

        for (int i = 0; i < n; i++){

            System.out.printf("Dados da %da pessoa:\n", i +1);
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            vectNomes[i] = nome;
            vectIdades[i] = idade;

            if (maiorIdade < idade){

                maiorIdade = idade;
                maisVelho = nome;

            }

        }

        System.out.printf("Pessoa mais velha: %s", maisVelho);

        sc.close();

    }
}
