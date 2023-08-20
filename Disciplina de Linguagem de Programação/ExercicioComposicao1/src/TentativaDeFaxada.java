import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TentativaDeFaxada {
    public static void main(String[] args) throws ParseException {

        Funcionario fc = new Funcionario();
        ContratoPorHora ch = new ContratoPorHora();
        Departamento dp = new Departamento();
        Scanner sc = new Scanner(System.in);

        formInformacoesDoFuncionario(sc, fc, dp);
        formContratosDoFuncionario(sc, ch, fc);
        pegaRenda(sc, fc, ch);

    }

    public static void formInformacoesDoFuncionario(Scanner sc, Funcionario fc, Departamento dp){

        System.out.printf("Insira o nome do departamento: ");
        String dpt = sc.nextLine();
        dp = new Departamento(dpt);

        fc = new Funcionario(null, null, null, dp);

        System.out.println("Insira informações do funcionário:");
        System.out.printf("Nome: ");
        String nm = sc.nextLine();
        fc.setNome(nm);

        System.out.printf("Nível: ");
        NivelFuncionario nv = NivelFuncionario.valueOf(sc.nextLine());
        fc.setNivel(nv);

        System.out.printf("Salário base: ");
        Double sb = Double.parseDouble(sc.nextLine());
        fc.setSalarioBase(sb);

    }

    public static void formContratosDoFuncionario(Scanner sc, ContratoPorHora ch, Funcionario fc) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Quantos contratos possui esse funcionario? ");
        int nct = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < nct; i++){

            System.out.printf("Insira as informações do contrato %d\n", i + 1);
            System.out.printf("Data (DD/MM/AAAA): ");
            Date date = sdf.parse(sc.next());

            System.out.printf("Valor por hora: ");
            Double valor = sc.nextDouble();

            System.out.printf("Duração: ");
            int h = sc.nextInt();

            ch = new ContratoPorHora(date, valor, h);
            fc.adicionarContrato(ch);

        }



    }

    public static void pegaRenda(Scanner sc, Funcionario fc, ContratoPorHora ch) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");

        System.out.printf("Insira mês e ano para calcular rendimento: ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        fc.toString();
        System.out.printf("Rendimentos de %s: %.2f", mesAno, fc.rendimento(ano, mes));

    }

}