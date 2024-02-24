package br.ufpb.dcx.rodrigor.atividade.sysacademico.controleAcademico;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Curso {

    private String nome;
    private String codigo;
    private Map<String,Aluno> alunosMatriculados;

    public Curso(String codigo, String nome){
        if ((nome == null) || (nome == "")) throw new IllegalArgumentException("Nome inválido");
        if ((codigo == null) || (codigo == "")) throw new IllegalArgumentException("Código inválido");
        this.nome = nome;
        this.codigo = codigo;
        this.alunosMatriculados = new LinkedHashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void cadastrarAluno(Aluno aluno){
        if(alunosMatriculados.containsKey(aluno.getMatricula())) throw new IllegalArgumentException("Aluno já matriculado no curso");
        this.alunosMatriculados.put(aluno.getMatricula(),aluno);
    }

    public Aluno getAluno(String matricula){
        return this.alunosMatriculados.get(matricula);
    }

}
