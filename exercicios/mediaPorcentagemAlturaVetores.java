//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão digitadas? ");
        int n = Integer.parseInt(sc.nextLine());

        String[] vectNomes = new String[n];
        int[] vectIdades = new int[n];
        double[] vectAlturas = new double[n];
        String nomesMenores = "";

        double somaAlturas = 0, mediaAlturas, porcentagem;
        int menores = 0;

        for (int i = 0; i < n; i++){

            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            vectNomes[i] = nome;

            System.out.printf("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());
            vectIdades[i] = idade;

            System.out.printf("Altura: ");
            double altura = Double.parseDouble(sc.nextLine());
            somaAlturas += altura;
            vectAlturas[i] = altura;

            if(idade < 16){

                menores += 1;
                nomesMenores += nome + "\n";
                
            }

        }

        mediaAlturas = somaAlturas / n;
        porcentagem = (menores * 100) / n;

        System.out.printf("Altura média: %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f", porcentagem);
        System.out.println("%");
        System.out.println(nomesMenores);

        sc.close();

    }
}
