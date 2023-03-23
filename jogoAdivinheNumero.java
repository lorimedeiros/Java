import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  Random ran = new Random();
  
  int num = ran.nextInt(100);

  int pontuacao = 100;
    
  boolean parada = true;
  
  while (parada) {
   
    System.out.println("Informe seu palpite:");
    int palpite = Integer.parseInt(sc.nextLine());
    
    if(palpite == num){
      System.out.println("Você acertou!");
      System.out.println("Pontuação: " + pontuacao);
      parada = false;
      
    } else if(palpite > num) {
      System.out.println("O número sorteado é menor");
      System.out.println();
      pontuacao -=2;
      
    } else if(palpite < num) {
      System.out.println("O número sorteado é maior");
      System.out.println();
      pontuacao -=2;
      
      
    }
  }

  sc.close();
      
  }
}
