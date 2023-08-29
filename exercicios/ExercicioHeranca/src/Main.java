import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList <Funcionario> fc = new ArrayList<>();

        System.out.println("Informe quantos funcionários deseja cadastrar:");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++){

            System.out.println("Informações do " + (i + 1) + "º funcionário");

            System.out.print("Terceirizado (s/n)? ");
            char c = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nm = sc.nextLine();
            System.out.print("Horas: ");
            int hr = Integer.parseInt(sc.nextLine());
            System.out.print("Valor por horas: ");
            double vph = Double.parseDouble(sc.nextLine());

            if (c == 's') {

                System.out.print("Gastos adicionais: ");
                double ga = Double.parseDouble(sc.nextLine());

                FuncionarioTerceirizado func = new FuncionarioTerceirizado(nm, hr, vph, ga);

                fc.add(func);

            } else {

                Funcionario func = new Funcionario(nm, hr, vph);

                fc.add(func);

            }

        }

        System.out.println();
        System.out.println("Pagamentos:");

        for (Funcionario f : fc){

            System.out.println(f.getNome() + " - R$" + f.pagamento());

        }

        sc.close();

    }
}