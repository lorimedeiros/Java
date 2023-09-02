import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String[] vect = sc.nextLine().split(" ");        // esse split determina que o divisor será a string espaço (entre os parâmentros)
    int position = Integer.parseInt(sc.nextLine);    // captura um inteiro
    System.out.println(vect[position]);              // printa o item na posição position do vetor
    
    sc.close()
    
  }
}
