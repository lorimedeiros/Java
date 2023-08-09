//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis). 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos alunos serão registrados? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] vectNomes = new String[n];
        double[] vectNota1 = new double[n];
        double[] vectNota2 = new double[n];

        String aprovados = "";

        for (int i = 0; i < n; i++){

            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i +1);
            String nome = sc.nextLine();
            double nota1 = Double.parseDouble(sc.nextLine());
            double nota2 = Double.parseDouble(sc.nextLine());

            vectNomes[i] = nome;
            vectNota1[i] = nota1;
            vectNota2[i] = nota2;

            if ((nota1 + nota2) / 2 >= 6.0){

                aprovados += nome + "\n";

            }

        }

        System.out.println("Alunos aprovados:");
        System.out.println(aprovados);

        sc.close();

    }
}
