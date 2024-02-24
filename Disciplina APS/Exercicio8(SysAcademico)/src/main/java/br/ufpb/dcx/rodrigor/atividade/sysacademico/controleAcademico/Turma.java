package br.ufpb.dcx.rodrigor.atividade.sysacademico.controleAcademico;

import java.util.LinkedList;
import java.util.List;

public class Turma {

    private int numeroTurma;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Disciplina disciplina, int numeroTurma) {
        if (disciplina == null) throw new IllegalArgumentException("Disciplina inválida");
        if (numeroTurma <= 0) throw new IllegalArgumentException("Número de turma inválido");
        this.disciplina = disciplina;
        this.numeroTurma = numeroTurma;
        alunos = new LinkedList<>();
    }

    public int getNumeroTurma(){
        return this.numeroTurma;
    }

    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    public String toString(){
        return this.disciplina.getNome()+": Turma "+this.numeroTurma;
    }

    public void matricularAluno(Aluno novoAluno) throws Exception {
        if (novoAluno == null) throw new IllegalArgumentException("Aluno inválido");
        if (alunos.contains(novoAluno)) throw new Exception("Aluno já matriculado");
        if (disciplina.getCurso().getAluno(novoAluno.getMatricula()) == null) throw new Exception("Aluno não matriculado no curso");
        this.alunos.add(novoAluno);
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }
}
