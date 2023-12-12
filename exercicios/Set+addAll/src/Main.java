import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();
        Set<Integer> C = new TreeSet<>();

        System.out.println("Informe quantos estudantes farão o curso A: ");
        Integer alunosA = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < alunosA; i++) {
            A.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Informe quantos estudantes farão o curso B: ");
        Integer alunosB = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < alunosB; i++) {
            B.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Informe quantos estudantes farão o curso C: ");
        Integer alunosC = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < alunosC; i++) {
            C.add(Integer.parseInt(sc.nextLine()));
        }

        Set<Integer> end = new TreeSet<>();
        end.addAll(A);
        end.addAll(B);
        end.addAll(C);

        System.out.println("Total de estudantes: " + end.size());

        sc.close();

    }
}