public class Aluno {

    private String nome;
    private String matricula;
    private String email;
    private Integer creditos;

    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        creditos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Aluno: " + getNome() + "\nMatricula: " + getMatricula() + "\nE-mail: " + getEmail() + "\nCréditos do Aluno: " + getCreditos();
    }

}
