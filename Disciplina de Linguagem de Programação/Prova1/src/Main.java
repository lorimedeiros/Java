import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocadoraDeAutomoveisFachada fc = new LocadoraDeAutomoveisFachada();
        Scanner sc = new Scanner(System.in);
        boolean parada = false;

        do{

            System.out.println("Bem vindo a locadora. Digite:\n" +
                    "1 - para adicionar um novo automovel;\n" +
                    "2 - para alugar um automovel;\n" +
                    "3 - para devolver um automovel\n" +
                    "4 - para buscar automoveis por modelo\n" +
                    "5.- para buscar todos automoveis disponíveis para aluguel\n" +
                    "Qualquer outro valor para sair.");

            int escolha = Integer.parseInt(sc.nextLine());

            if (escolha < 1 || escolha > 5){
                parada = true;
            } else if (escolha == 1){

                System.out.println("Insira o modelo do automovel:");
                String mod = sc.nextLine();

                System.out.println("Insira o ano do automovel:");
                int ano = Integer.parseInt(sc.nextLine());

                System.out.println(fc.adicionaAutomovel(mod, ano));

            } else if (escolha == 2){

                System.out.println("Insira o ID do automovel que deseja alugar:");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println(fc.alugaCarro(id));

            } else if (escolha == 3){

                System.out.println("Insira o ID do automovel devolvido:");
                int id = Integer.parseInt(sc.nextLine());

                System.out.println(fc.devolveCarro(id));

            } else if (escolha == 4){

                System.out.println("Insira o modelo do automovel para busca:");
                String mod = sc.nextLine();

                System.out.println(fc.buscaPorModelo(mod));

            } else if (escolha == 5){

                System.out.println(fc.buscaPorNaoAlugados());

            }

        } while (!parada);

    }
}