import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo rt = new Retangulo();

        System.out.println("Informe a largura e a altura do retangulo:");
        rt.largura = Double.parseDouble(sc.nextLine());
        rt.altura = Double.parseDouble(sc.nextLine());

        System.out.println("AREA = " + rt.area());
        System.out.println("PERÍMETRO = " + rt.perimetro());
        System.out.println("DIAGONAL = " + rt.diagonal());

        sc.close();

    }
}
