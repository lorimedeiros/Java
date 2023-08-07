import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números deseja digitar? ");
        int n = Integer.parseInt(sc.nextLine());
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.printf("Digite um número: ");
            int adc = Integer.parseInt(sc.nextLine());
            vect[i] = adc;

        }

        System.out.println("Números negativos:");
        for (int i = 0; i < vect.length; i++) {

            if(vect[i] < 0){
                System.out.println(vect[i]);
            }

        }

        sc.close();

    }
}