package br.ufpb.dcx.aps.atividades.atv04;

import java.util.HashMap;

public class Curso {
    private String nome;
    private HashMap <String, Aluno> alunosMatriculados = new HashMap<>();
    private HashMap <String, Disciplina> disciplinas = new HashMap<>();

    public Curso(){
        this.nome = "";
    }
    public Curso(String nome) {
        this.nome = nome;
    }

    public void matricular (Aluno a){
        if (a == null) throw new IllegalArgumentException("aluno inválido:null");
        if (alunosMatriculados.containsValue(a)) throw new RuntimeException("aluno já matriculado:" + a.getMatricula());
        alunosMatriculados.put(a.getMatricula(), a);
    }

    public Disciplina criarDisciplina(String codigo, String nome){
        Disciplina d = new Disciplina(codigo, nome, this);
        disciplinas.put(d.getCodigo(), d);
        return d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap getAlunosMatriculados(){
        return alunosMatriculados;
    }

    public Aluno getAlunoMatriculado(String matricula){
        return alunosMatriculados.get(matricula);
    }

    public Disciplina getDisciplina(String chave){
        if (disciplinas.containsKey(chave)){
            return disciplinas.get(chave);
        } else throw new RuntimeException("Não existe disciplina com código:" + chave);
    }

    @Override
    public String toString() {
        return nome;
    }
}
