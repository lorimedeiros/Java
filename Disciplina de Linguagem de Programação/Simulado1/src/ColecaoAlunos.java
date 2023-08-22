import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoAlunos {

    Scanner sc = new Scanner(System.in);

    private ArrayList <Aluno> alunos = new ArrayList<>();

    public Aluno buscar(Integer matricula){

        return alunos.get(matricula - 1);

    }

    public void adicionaAluno(String nome, String email){

        Aluno al = new Aluno(nome, alunos.size() + 1, email);
        alunos.add(al);

    }

    public void removeAluno(Integer matricula){

        Aluno al = buscar(matricula);
        alunos.remove(al);

    }

    public String pesquisaAlunoPorEmail(String email){

        for (int i = 0; i < alunos.size(); i ++){

            Aluno al = alunos.get(i);

            if (al.getEmail().equalsIgnoreCase(email)){
                System.out.println("Aluno encontrado:");
                System.out.println(al.toString());
            }

        }

        return null;

    }

    public String pesquisaAlunoPorMatriculaEAdicionaPontos(Integer matricula, Integer qtCreditos){

        for (int i = 0; i < alunos.size(); i++){

            Aluno al = alunos.get(i);

            if (al.getMatricula() == matricula){

                if (qtCreditos == 2){
                    al.aumenta2creditos();
                    return "Operação bem sucedida";
                } else if (qtCreditos == 4){
                    al.aumenta4creditos();
                    return "Operação bem sucedida";
                } else if (qtCreditos == 6){
                    al.aumenta6creditos();
                    return "Operação bem sucedida";
                }

            }

        }

        return "Matrícula ou quantidade de créditos inválida";

    }

    public void retornaAlunosQueTemCreditos(Integer creditos){

        for (int i = 0; i < alunos.size(); i++){

            Aluno al = alunos.get(i);

            if (al.getCreditos() >= creditos){
                System.out.println(al.toString());
            }

        }

    }

    public void retornaTodosAlunos(){
        for (Aluno a : alunos) {
            System.out.println(a.toString());
        }
    }

}
