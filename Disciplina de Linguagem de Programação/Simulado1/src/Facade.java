public class Facade {

    Aluno al = new Aluno();
    ColecaoAlunos ca = new ColecaoAlunos();

    public void adicionaAluno(String nome, String email){
        ca.adicionaAluno(nome, email);
    }

    public void removeAluno(Integer matricula){
        ca.removeAluno(matricula);
    }

    public void pesquisaPorEmail(String email){
        ca.pesquisaAlunoPorEmail(email);
    }

    public void pesquisaPorMatriculaAddPontos(Integer matricula, Integer qtPontos){
        ca.pesquisaAlunoPorMatriculaEAdicionaPontos(matricula, qtPontos);
    }

    public void retornaAlunosQtCreditos(Integer qtCreditos){
        ca.retornaAlunosQueTemCreditos(qtCreditos);
    }

    public void exibirListaComTodosAlunos(){
        ca.retornaTodosAlunos();
    }

}