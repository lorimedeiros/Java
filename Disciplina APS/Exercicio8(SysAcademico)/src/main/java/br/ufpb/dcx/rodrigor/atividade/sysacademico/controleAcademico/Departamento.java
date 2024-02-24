package br.ufpb.dcx.rodrigor.atividade.sysacademico.controleAcademico;

import java.util.*;

public class Departamento {

    private String nome;
    private Map<String,Disciplina> disciplinas;

    public Departamento(String nome) {
        if ((nome == null) || (nome == "")) throw new IllegalArgumentException("Nome inválido");
        this.nome = nome;
        disciplinas = new LinkedHashMap<>();
    }

    public Disciplina cadastrarDisciplina(Disciplina novaDisciplina) throws DepartamentoException {
        if(disciplinas.containsKey(novaDisciplina.getCodigo())) {
            throw new DepartamentoException("Já existe uma disciplina com o código: " + novaDisciplina.getCodigo());
        }
        disciplinas.put(novaDisciplina.getCodigo(),novaDisciplina);
        return novaDisciplina;
    }

    public void removerDisciplina(String codigo){
        if ((codigo == null) || (codigo == "")) throw new IllegalArgumentException("Código inválido");
        disciplinas.remove(codigo);
    }

    public String getNome() {
        return this.nome;
    }

    public Disciplina getDisciplina(String codigo) {
        return this.disciplinas.get(codigo);
    }

    public Collection<Disciplina> getDisciplinas() {
        return this.disciplinas.values();
    }

    public Set<String> getCodigos(){
        return this.disciplinas.keySet();
    }

}
