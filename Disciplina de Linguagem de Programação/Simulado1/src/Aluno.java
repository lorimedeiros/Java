public class Aluno {

    private String nome;
    private Integer matricula;
    private String email;
    private Integer creditos;

    public Aluno(){}

    public Aluno(String nome, Integer matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        creditos = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void aumenta2creditos(){
        creditos += 2;
    }

    public void aumenta4creditos(){
        creditos += 4;
    }

    public void aumenta6creditos(){
        creditos += 6;
    }

    public String toString(){
        return "Nome do aluno: " + getNome() + "\nMatricula: " + getMatricula() + "\nE-mail: " + getEmail() + "\nCréditos do Aluno: " + getCreditos();
    }

}
