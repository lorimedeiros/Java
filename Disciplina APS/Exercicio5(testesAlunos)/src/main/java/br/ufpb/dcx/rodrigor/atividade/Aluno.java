package br.ufpb.dcx.rodrigor.atividade;

import java.util.Objects;

public class Aluno {

    private String matricula;
    private String nome;

    public Aluno(){
        nome = "";
    }
    public Aluno(String matricula, String nome) {
        if (nome == "" || nome == null) throw new IllegalArgumentException();
        if (matricula == null) throw new IllegalArgumentException();
        try{
            Integer.valueOf(matricula); //transformando mátricula em numérico. Se der pau, sabemos que não é
        } catch (Exception e){
            throw new IllegalArgumentException("Matricula Invalida! Matricula deve ser numerica!");
        }
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null) throw new IllegalArgumentException();
        try{
            Integer.valueOf(matricula); //transformando mátricula em numérico. Se der pau, sabemos que não é
        } catch (Exception e){
            throw new IllegalArgumentException("Matricula Invalida! Matricula deve ser numerica! matricula='" + matricula + "'");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null ) throw new IllegalArgumentException("Não deve ser possível atribuir o valor `null` ao nome da classe Aluno");
        if (nome == "") throw  new IllegalArgumentException("O nome deve ser inicializado com String vazio");
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Aluno:\n" +
                "matricula: " + matricula + "\n" +
                "nome: " + nome;
    }
}
