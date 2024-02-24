package br.ufpb.dcx.rodrigor.atividade.sysacademico.controleAcademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private Curso curso;
    private String codigo;
    private String nome;
    private List<Turma> turmas;

    public Disciplina(String codigo, String nome, Curso curso){
        if ((codigo == null) || (codigo == "")) throw new IllegalArgumentException("Código inválido");
        if ((nome == null) || (nome == "")) throw new IllegalArgumentException("Nome inválido");
        if (curso == null) throw new IllegalArgumentException("Curso inválido");
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.turmas = new ArrayList<>();
    }

    public Turma criarTurma(){
        Turma novaTurma = new Turma(this,turmas.size() + 1);
        this.turmas.add(novaTurma);
        return novaTurma;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        StringBuffer disciplinaStr = new StringBuffer(this.codigo+" - "+this.nome);
        if(!this.turmas.isEmpty()){
            disciplinaStr.append(" - turma(s): ");
            for(Turma turma: turmas)
                disciplinaStr.append(turma.getNumeroTurma()+" ");
        }
        return disciplinaStr.toString() ;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public List<Turma> getTurmas() {
        return this.turmas;
    }

    public Turma getTurma(int turma) {
        return this.turmas.get(turma-1);
    }

    public Curso getCurso(){
        return curso;
    }
}
