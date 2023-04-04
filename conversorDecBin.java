import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int decimal = sc.nextInt();

        String binario = "";
        while (decimal > 0) {
            binario = (decimal % 2) + binario;
            decimal /= 2;
        }

        System.out.println("O número em binário é: " + binario);
    }
}
