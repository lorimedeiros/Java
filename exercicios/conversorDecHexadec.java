import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int decimal = sc.nextInt();

        String hexadecimal = "";
        while (decimal > 0) {
            int resto = decimal % 16;
            if (resto < 10) {
                hexadecimal = resto + hexadecimal;
            } else {
                hexadecimal = (char) (resto - 10 + 'A') + hexadecimal;
            }
            decimal /= 16;
        }
        System.out.println("O número em hexadecimal é: " + hexadecimal);
    }
}
