/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
Criar uma classe Conversor para ser responsável pelos cálculos.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual o atual preço do dolar? ");
        double precoSC = Double.parseDouble(sc.nextLine());

        System.out.printf("Quantos dolars deseja comprar? ");
        double compradosSC = Double.parseDouble(sc.nextLine());

        System.out.printf("Total a ser pago em reais = %.2f%n" , Conversor.valorDaCompra(precoSC, compradosSC));

        sc.close();

    }
}
