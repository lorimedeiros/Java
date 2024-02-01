package br.ufpb.dcx.aps.atividades.atv04;

import java.util.HashMap;

public class Disciplina {
    private String codigo;
    private String nome;
    private Curso curso;
    private HashMap <Integer, Turma> turmas = new HashMap<>();

    public Disciplina(String codigo, String nome, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso(){
        return curso;
    }

    public Turma criarTurma(Integer codigo){
        Turma t = new Turma(codigo, this);
        turmas.put(t.getCodigo(), t);
        return t;
    }

    public Turma criarTurma(){
        Turma t = new Turma(turmas.size() + 1, this);
        if (turmas.isEmpty()) {
            turmas.put(1, t);
        } else {
            turmas.put(t.getCodigo() + 1, t);
        }
        return t;
    }

    public Turma getTurma(Integer codigo){
        if (codigo <= 0) throw new IllegalArgumentException("código inválido:" + codigo);
        if (turmas.get(codigo) == null) throw new RuntimeException("Não existe turma com código:" + codigo);
        return turmas.get(codigo);
    }

    public HashMap getTurmas(){
        return turmas;
    }
}
