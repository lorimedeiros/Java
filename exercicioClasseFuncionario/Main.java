import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario fc = new Funcionario();

        System.out.printf("Nome: ");
        fc.nome = sc.nextLine();
        System.out.printf("Salario Bruto: ");
        fc.salarioBruto = Double.parseDouble(sc.nextLine());
        System.out.printf("Impostos: ");
        fc.imposto = Double.parseDouble(sc.nextLine());

        System.out.println("Funcionário: " + fc.nome + ", $ " + fc.salarioLiquido());
        System.out.printf("De quanto será a taxa acrescentada ao salário? ");
        double tx = sc.nextDouble();
        fc.aumentoSalario(tx);
        System.out.println("Dados Atualizados: " + fc.nome + ", $ " + fc.salarioBruto);

        sc.close();

    }
}
