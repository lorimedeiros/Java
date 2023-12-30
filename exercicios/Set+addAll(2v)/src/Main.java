//mistério da ópera: Set simplesmente não repete elementos, ou seja, pra contar números diferentes é só jogar tudo num canto só :O
//(a gênia aqui não sabia disso, por isso tem 2 versões desse trem
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> x = new TreeSet<>();

        System.out.println("Informe quantos estudantes farão o curso A: ");
        Integer alunosA = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < alunosA; i++) {
            x.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Informe quantos estudantes farão o curso B: ");
        Integer alunosB = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < alunosB; i++) {
            x.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Informe quantos estudantes farão o curso C: ");
        Integer alunosC = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < alunosC; i++) {
            x.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Total de estudantes: " + x.size());

        sc.close();

    }
}
