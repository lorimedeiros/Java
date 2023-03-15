import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Declaração das variáveis para comparação
    int mai = 0;
    int men = 999;

    // recebimento dos números
    System.out.println("Digite um número abaixo: ");
    int num1 = sc.nextInt();

    System.out.println("Digite um número abaixo: ");
    int num2 = sc.nextInt();

    System.out.println("Digite um número abaixo: ");
    int num3 = sc.nextInt();

    // Comparativos para obter maior número
    if ((num1 > num2) || (num1 > num3)) {
      mai = num1;
    } 
    if ((num2 > num1) || (num2 > num3)) {
      mai = num2;
    }
    if ((num3 > num1) || (num3 > num2)) {
      mai = num3;
    }

    // Comparativos para obter menor número
    if ((num1 < num2) || (num1 < num3)) {
      men = num1;
    } 
    if ((num2 < num1) || (num2 < num3)) {
      men = num2;
    } 
    if ((num3 < num1) || (num3 < num2)) {
      men = num3;
    }

    // Calculo da média
    int med = ((num1 + num2 + num3) / 3);

    // Prints
    if ((num1 == num2) && (num1 == num3) && (num2 == num3)){
      System.out.println("Todos os números são iguais");
    } else {
      System.out.println("O maior número é: " + mai);
      System.out.println("O menor número é: " + men);
      System.out.println("A média é: " + med);
    }

    sc.close();
  }
}
