import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Pessoa> lista = new ArrayList<>();

        System.out.print("Informe a quantidade de pagantes: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Informações do " + (i + 1) + "º pagante:");

            System.out.print("Pessoa Física ou Jurídica (f/j)? ");
            char c = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nm = sc.nextLine();

            System.out.print("Renda anual: ");
            double ra = Double.parseDouble(sc.nextLine());

            if (c == 'f'){

                System.out.print("Gastos com saúde: ");
                double gs = Double.parseDouble(sc.nextLine());

                PessoaFisica pf = new PessoaFisica(nm, ra, gs);
                lista.add(pf);

            } else if (c == 'j'){

                System.out.print("Número de funcionários: ");
                int nf = Integer.parseInt(sc.nextLine());

                PessoaJuridica pj = new PessoaJuridica(nm, ra, nf);
                lista.add(pj);

            }

        }

        double soma = 0;
        String s = "";

        for (Pessoa p : lista) {

            s += p.toString() + "\n";
            soma += p.impostoDeRenda();

        }

        System.out.println("Pagantes:\n" + s);
        System.out.print("Taxas totais: R$ " + soma);

        sc.close();

    }
}