package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.HashMap;

public class Turma {
    private Integer codigo;
    private Disciplina disciplina;
    private Professor professor;
    private HashMap<String, Aluno> alunos = new HashMap();

    public Turma(Integer codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor p){
        this.professor = p;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void addAluno(Aluno a){
        if (!this.disciplina.getCurso().getAlunosMatriculados().containsValue(a)) throw new RuntimeException("Aluno não está matriculado no curso:" + this.disciplina.getCurso());
        alunos.put(a.getMatricula(), a);
    }
}