import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Facade fc = new Facade();

        boolean parada = false;


        do{

            System.out.println(menu());
            int escolha = Integer.parseInt(sc.nextLine());

            if (escolha < 1 || escolha > 7){
                System.out.println("Opção inválida");
            }

            if (escolha == 1){

                System.out.println("Insira o nome do aluno:");
                String nome = sc.nextLine();

                System.out.println("Insira o e-mail do aluno:");
                String email = sc.nextLine();

                fc.adicionaAluno(nome, email);

            } else if (escolha == 2){

                System.out.println("Insira a matrícula do aluno que deseja remover:");
                Integer matricula = Integer.parseInt(sc.nextLine());

                fc.removeAluno(matricula);

            } else if (escolha == 3){

                System.out.println("Insira o e-mail do aluno que deseja pesquisar:");
                String email = sc.nextLine();

                fc.pesquisaPorEmail(email);

            } else if (escolha == 4){

                System.out.println("Insira a matrícula do aluno que deseja acrescentar pontos:");
                Integer matricula = Integer.parseInt(sc.nextLine());

                System.out.println("Insira a quantidade de pontos que deseja acrescentar:");
                Integer qtCreditos = Integer.parseInt(sc.nextLine());

                fc.pesquisaPorMatriculaAddPontos(matricula, qtCreditos);

            } else if (escolha == 5){

                System.out.println("Insira a quantidade de créditos da busca:");
                int creditos = Integer.parseInt(sc.nextLine());

                fc.retornaAlunosQtCreditos(creditos);

            } else if (escolha == 6){

                fc.exibirListaComTodosAlunos();

            } else if (escolha == 7){
                parada = true;
            }

        } while(!parada);

        sc.close();

    }

    public static String menu(){
        return "1. Adicionar aluno\n" +
                "2. Remover aluno pela matricula\n" +
                "3. Pesquisar aluno por email\n" +
                "4. Pesquisar aluno por matrícula e adicionar créditos\n" +
                "5. Retornar alunos com determinada quantidade de créditos\n" +
                "6. Exibir lista de alunos\n" +
                "7. Sair";
    }

}