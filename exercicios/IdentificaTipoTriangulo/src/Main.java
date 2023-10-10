import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if ((a + b + c) == 180) {
            if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else  {
            System.out.println("Error");
        }

        sc.close();

    }
}