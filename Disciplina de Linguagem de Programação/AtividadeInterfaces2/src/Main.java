import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RepositorioDeFiguras2D rp = new RepositorioDeFiguras2D();
        boolean parada = false;

        do{

            try {
                System.out.println("Menu:" +
                        "\n1. Adicionar figura" +
                        "\n2. Remover figura" +
                        "\n3. Área por posição" +
                        "\n4. Perímetro por posição" +
                        "\n5. Descrição por posição" +
                        "\n6. Ordena" +
                        "\n7. Mostra tudo" +
                        "\n8. Sair");

                int esc = Integer.parseInt(sc.nextLine());

                if (esc < 1 || esc > 8) {
                    System.out.println("Opção inválida");
                }

                if (esc == 1){
                    System.out.println("Quadrado ou Círculo(q/c)?");
                    char c = sc.next().charAt(0);
                    sc.nextLine();

                    if(c == 'q'){

                        System.out.println("Insira o valor do lado: ");
                        Double l = Double.parseDouble(sc.nextLine());
                        Quadrado quad = new Quadrado(l);
                        rp.adiciona(quad);

                    } else if (c == 'c'){

                        System.out.println("Insira o valor do raio: ");
                        Double r = Double.parseDouble(sc.nextLine());
                        Circulo circ = new Circulo(r);
                        rp.adiciona(circ);

                    } else {
                        System.out.println("Opção inválida");
                    }

                } else if (esc == 2){

                    System.out.println("Insira a posição da figura na lista: ");
                    Integer p = Integer.parseInt(sc.nextLine());
                    rp.remove(p);

                } else if (esc == 3){

                    System.out.println("Insira a posição da figura na lista: ");
                    Integer p = Integer.parseInt(sc.nextLine());
                    System.out.println(rp.areaDaFiguraNaPosicao(p));

                } else if (esc == 4){

                    System.out.println("Insira a posição da figura na lista: ");
                    Integer p = Integer.parseInt(sc.nextLine());
                    System.out.println(rp.perimetroDaFiguraNaPosicao(p));

                } else if (esc == 5){

                    System.out.println("Insira a posição da figura na lista: ");
                    Integer p = Integer.parseInt(sc.nextLine());
                    System.out.println(rp.descricaoDaFiguraNaPosicao(p));

                } else if (esc == 6){

                    rp.ordenaPorArea();

                } else if (esc == 7){

                    rp.retornaTodos();

                } else if (esc == 8){

                    parada = true;

                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        } while (!parada);

        sc.close();

    }
}