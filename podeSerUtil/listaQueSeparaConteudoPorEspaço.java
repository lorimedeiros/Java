import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String[] vect = sc.nextLine().split(" ");
    int position = Integer.parseInt(sc.nextLine);
    System.out.println(vect[position]);
    
    sc.close()
    
  }
}
