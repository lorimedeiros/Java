import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ColecaoAlunos ca = new ColecaoAlunos();
        Facade fc = new Facade();
        Scanner sc = new Scanner(System.in);
        boolean parada = false;

        do {

            System.out.println("Menu:\n" +
                    "1. Adicionar aluno\n" +
                    "2. Deletar aluno\n" +
                    "3. Recuperar aluno por e-mail\n" +
                    "4. Recuperar todos os alunos que já pagaram uma determinada quantidade de créditos\n" +
                    "5. Recuperar um aluno pela matrícula e adicionar 2, 4 ou 6 créditos a este aluno\n" +
                    "6. Ver lista de alunos\n" +
                    "7. Sair");

            int escolha = Integer.parseInt(sc.nextLine());

            if (escolha < 1 || escolha > 7){

                System.out.println("Opção Inexistente");
                System.out.println();

            } else if (escolha == 1){

                fc.adicionarAluno(ca);

            } else if (escolha == 2){

                fc.removeAluno(ca);

            } else if (escolha == 3){

                fc.recuperaAlunoPorEmail(ca);

            } else if (escolha == 4){

                fc.recuperarAlunosQuePossuamCreditos(ca);

            } else if (escolha == 5){

                fc.recuperaAlunoPelaMatriculaEAdicionaCreditos(ca);

            } else if (escolha == 6){

                ca.retornaTodosAlunos();

            } else if (escolha == 7){

                parada = true;

            }

        } while(!parada);

    }
}