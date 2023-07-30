/*
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta,
o nome do titular da conta, e o valor de depósito inicial depositado ao abrir a conta,
deposito inicial é opcional, pode ser 0.

Uma vez tendo a conta aberta, o numero da mesma não pode mudar, já o nome do títular, sim.
Nomes podem ser mudados.

O saldo da conta não pode ser alterado livremente, é preciso um mecanismo para proteger  o mesmo.
Saldo só aumenta com depósitos e só diminui com saques. Para cada saque, cobrar taxa R$5,00.
O saldo pode ficar negativo, se insuficiente para realizar saque e/ou pagar taxa.

Fazer um programa que abra uma conta, dando a opção de realizar ou não deposito inicial.
Em seguida, realizar um depósito e um saque.
Sempre mostrar os dados da conta após cada operação.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.printf("Informe o titular da conta: ");
        String nome = sc.nextLine();

        Conta ct = new Conta();
        ct.Conta(numero, nome, 0);

        System.out.printf("Deseja realizar um depósito inicial (s/n)? ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")){
            System.out.printf("Digite o valor do depósito inicial: ");
            double valorDepInicial = Double.parseDouble(sc.nextLine());
            ct.deposita(valorDepInicial);
        }

        System.out.println();
        System.out.println("Informação da conta:");
        System.out.println(ct.toString());

        System.out.println();
        System.out.printf("Digite o valor do depósito: ");
        double deposito = Double.parseDouble(sc.nextLine());
        ct.deposita(deposito);

        System.out.println("Informação da conta atualizada:");
        System.out.println(ct.toString());

        System.out.println();
        System.out.printf("Digite o valor do saque: ");
        double saque = Double.parseDouble(sc.nextLine());
        ct.saca(saque);

        System.out.println("Informação da conta atualizada:");
        System.out.println(ct.toString());

        sc.close();

    }
}
