import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Funcionario fc;
        Departamento dp;
        ContratoPorHora ch;



        //Construção do funcionário
        System.out.printf("Insira o nome do departamento: ");
        String dpt = sc.nextLine();
        dp = new Departamento(dpt);

        System.out.println("Insira informações do funcionário:");
        System.out.printf("Nome: ");
        String nm = sc.nextLine();

        System.out.printf("Nível: ");
        NivelFuncionario nv = NivelFuncionario.valueOf(sc.nextLine());

        System.out.printf("Salário base: ");
        Double sb = Double.parseDouble(sc.nextLine());

        fc = new Funcionario(nm, nv, sb, dp);



        //Construção do(s) contrato(s)
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Quantos contratos possui esse funcionario? ");
        int nct = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < nct; i++) {

            System.out.printf("Insira as informações do contrato %d\n", i + 1);
            System.out.printf("Data (DD/MM/AAAA): ");
            Date date = sdf1.parse(sc.next());

            System.out.printf("Valor por hora: ");
            Double valor = sc.nextDouble();

            System.out.printf("Duração: ");
            int h = sc.nextInt();

            ch = new ContratoPorHora(date, valor, h);
            fc.adicionarContrato(ch);
        }



        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM");

        System.out.printf("Insira mês e ano para calcular rendimento: ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println(fc.toString());
        System.out.printf("Rendimentos de %s: %.2f", mesAno, fc.rendimento(ano, mes));

        sc.close();

    }
}
