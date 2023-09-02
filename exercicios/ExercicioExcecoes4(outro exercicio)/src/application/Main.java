package application;

import entities.Conta;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Insira as informações da conta");

            System.out.print("Número: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.print("Titular: ");
            String nm = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double sd = Double.parseDouble(sc.nextLine());
            System.out.print("Limite de saque: ");
            Double ls = Double.parseDouble(sc.nextLine());

            Conta ct = new Conta(n, nm, sd, ls);

            System.out.print("Insira valor do saque: ");
            Double saque = Double.parseDouble(sc.nextLine());

            System.out.println();
            System.out.println(ct.saque(saque));

        } catch (IllegalArgumentException e){

            System.out.println(e.getMessage());

        }

        sc.close();

    }
}