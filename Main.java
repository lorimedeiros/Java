import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudante es = new Estudante();

        es.nome = sc.nextLine();
        es.nota1 = Double.parseDouble(sc.nextLine());
        es.nota2 = Double.parseDouble(sc.nextLine());
        es.nota3 = Double.parseDouble(sc.nextLine());

        System.out.println("Nota final = " + es.somaDasNotas());
        System.out.println(es.resultado());

        sc.close();

    }
}