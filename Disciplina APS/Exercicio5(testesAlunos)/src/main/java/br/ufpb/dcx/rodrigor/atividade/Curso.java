package br.ufpb.dcx.rodrigor.atividade;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        if (nome == null) throw new IllegalArgumentException("O nome do curso não pode ser null");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) throw new IllegalArgumentException("O nome do curso não pode ser null");
        this.nome = nome;
    }

    public String getAlunos(){
        String str = "";
        for (Aluno a : alunos) {
            str += a.toString() + "\n";
        }
        return str;
    }

    public Aluno getAluno(String matricula){
        for (Aluno a: alunos) {
            if (a.getMatricula() == matricula){
                return a;
            }
        }
        return null;
    }

    public void cadastrarAluno(Aluno a) throws Exception {
        if (alunos.contains(a)) throw new Exception("Não é possível cadastrar o mesmo aluno mais de uma vez no Curso");
        if (isAlunoCadastrado(a)) throw new Exception("Não é possível cadastrar dois alunos com a mesma matrícula");
        alunos.add(a);
    }

    public boolean isAlunoCadastrado(Aluno a){
        for (Aluno aVerificar : alunos) {
            if (aVerificar.equals(a)){
                return true;
            }
        }
        return false;
    }

    public String getDisciplinas() {
        String str = "";
        for (Disciplina d : disciplinas) {
            str += d.toString() + "\n";
        }
        return str;
    }

    public boolean verificaExistenciaCodigo(String codigo){
        for (Disciplina d : disciplinas) {
            if (d.getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }

    public Disciplina criarDisciplina(String codigo, String nome){
        if(codigo == "") throw new IllegalArgumentException("O código da disciplina não pode ser vazio");
        if(verificaExistenciaCodigo(codigo)) throw new IllegalArgumentException("Não podem existir duas disciplinas com o mesmo código");
        Disciplina d = new Disciplina(codigo, nome);
        disciplinas.add(d);
        return d;
    }

}
