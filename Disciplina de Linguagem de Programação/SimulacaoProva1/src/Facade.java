import java.util.Scanner;

public class Facade {

    public void adicionarAluno(ColecaoAlunos ca){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Insira a matrícula do aluno:");
        String matricula = sc.nextLine();

        System.out.println("Insira o e-mail do aluno:");
        String email = sc.nextLine();

        Aluno al = new Aluno(nome, matricula, email);

        ca.adicionaAluno(al);

    }

    public void removeAluno(ColecaoAlunos ca){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a matrícula do aluno que deseja remover:");
        String mat = sc.nextLine();

        ca.removeAluno(mat);

    }

    public void recuperaAlunoPorEmail(ColecaoAlunos ca){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o e-mail do aluno:");
        String email = sc.nextLine();

        System.out.println("Resultado da pesquisa:");
        ca.pesquisaAlunoPorEmail(email);

    }

    public void recuperarAlunosQuePossuamCreditos(ColecaoAlunos ca){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de créditos da pesquisa:");
        int qt = Integer.parseInt(sc.nextLine());

        ca.retornaAlunosQueTemCreditos(qt);

    }

    public void recuperaAlunoPelaMatriculaEAdicionaCreditos(ColecaoAlunos ca){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a matricula do aluno que deseja adicionar créditos:");
        String mt = sc.nextLine();

        ca.pesquisaAlunoPorMatriculaEAdicionaPontos(mt);

    }

}
