import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números deseja digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        Double[] vect = new Double[n];
        double soma = 0, media;

        for (int i = 0; i < vect.length; i++){


            System.out.printf("Digite um número: ");
            double adc = Double.parseDouble(sc.nextLine());
            soma += adc;
            vect[i] = adc;

        }

        System.out.printf("VALORES =");
        for (int i = 0; i < vect.length; i++){

            System.out.printf(" %.1f ", vect[i]);

        }

        media = soma / (vect.length);

        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f", media);

        sc.close();

    }
}
