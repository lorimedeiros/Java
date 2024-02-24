package br.ufpb.dcx.rodrigor.atividade.sysacademico.controleAcademico;

public class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String matricula, String nome){
        if ((matricula == null) || (matricula == "")) throw new IllegalArgumentException("Matrícula inválida");
        if ((nome == null) || (nome == "")) throw new IllegalArgumentException("Nome inválido");
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString(){
        return this.matricula+"\t"+ this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

}
