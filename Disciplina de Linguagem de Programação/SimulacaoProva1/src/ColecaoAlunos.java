import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoAlunos {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Aluno> alunos = new ArrayList<>();


    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removeAluno(String matricula){

        for (Aluno a : alunos){
            if(a.getMatricula() == matricula){
                alunos.remove(a);
            } else {
                System.out.println("Aluno não encontrado");
            }
        }

    }

    public String pesquisaAlunoPorEmail(String email){

        for(Aluno a : alunos){
            if (a.getEmail() == email){
                return a.toString();
            } else {
                System.out.println("Aluno não encontrado");
            }
        }

        return null;

    }

    public String pesquisaAlunoPorMatriculaEAdicionaPontos(String matricula){
        for(Aluno a : alunos){
            if(a.getMatricula() == matricula){
                System.out.println("Quantos créditos deseja adicionar?");
                System.out.println("1. 2 Créditos\n" +
                                    "2. 4 Créditos\n" +
                                    "3. 6 Créditos");
                int resposta = Integer.parseInt(sc.nextLine());
                if (resposta == 1){
                    a.aumenta2creditos();
                } else if (resposta == 2){
                    a.aumenta4creditos();
                } else if (resposta == 3) {
                    a.aumenta6creditos();
                } else {
                    System.out.println("Opção indisponível");
                }
            } else {
                System.out.println("Aluno não encontrado");
            }
        }

        return null;

    }

    public void retornaAlunosQueTemCreditos(Integer creditos){

        for(Aluno a : alunos){
            if (a.getCreditos() >= creditos){
                System.out.println(a.toString());
                System.out.println();
            }
        }

    }

    public void retornaTodosAlunos(){
        for (Aluno a : alunos) {
            System.out.println(a.toString());
        }
    }

}
