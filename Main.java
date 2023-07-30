import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product pd = new Product();

        System.out.println("Enter product data:");
        pd.name = sc.nextLine();
        pd.price = Double.parseDouble(sc.nextLine());
        pd.quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Product data: " + pd.name + ", $ " + pd.price + ", " + pd.quantity + " units, Total: $ " + pd.TotalValueInStock());
        System.out.println("Enter the number of products to be added in stock:");
        pd.AddProducts(Integer.parseInt(sc.nextLine()));
        System.out.println("Updated data: " + pd.name + ", $ " + pd.price + ", " + pd.quantity + " units, Total: $ " + pd.TotalValueInStock());
        System.out.println("Enter the number of products to be removed from stock:");
        pd.RemoveProducts(Integer.parseInt(sc.nextLine()));
        System.out.println("Updated data: " + pd.name + ", $ " + pd.price + ", " + pd.quantity + " units, Total: $ " + pd.TotalValueInStock());

        sc.close();

    }
}