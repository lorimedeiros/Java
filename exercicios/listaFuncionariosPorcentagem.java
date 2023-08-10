import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos funcionários serão registrados? ");
        int n = Integer.parseInt(sc.nextLine());

        ArrayList <Integer> ids = new ArrayList<>();
        ArrayList <String> nomes = new ArrayList<>();
        ArrayList <Double> salarios = new ArrayList<>();

        for (int i = 0; i < n; i++){

            System.out.printf("Funcionário #%d:\n", i +1);

            System.out.printf("Id: ");
            int id = Integer.parseInt(sc.nextLine());
            ids.add(id);

            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);

            System.out.printf("Salário: ");
            double salario = Double.parseDouble(sc.nextLine());
            salarios.add(salario);

        }

        System.out.printf("Informe o Id do funcionário que receberá aumento: ");
        int idSortudo = Integer.parseInt(sc.nextLine());

        if (ids.contains(idSortudo)){

            int indexSortudo = ids.indexOf(idSortudo);
            double salarioAcrescentar = salarios.get(indexSortudo);

            System.out.printf("Informe a porcentagem: ");
            double porcent = Double.parseDouble(sc.nextLine());

            double salarioFinal = salarioAcrescentar + (salarioAcrescentar * (porcent / 100));

            salarios.add(indexSortudo, salarioFinal);
            salarios.remove(salarioAcrescentar);

        } else {

            System.out.println("Id inexistente");

        }

        System.out.println("Lista de funcionários:");
        for(int i = 0; i < n; i++){

            System.out.println(ids.get(i) + ", " + nomes.get(i) + ", " + salarios.get(i));

        }

        sc.close();

    }
}
