package br.ufpb.dcx.rodrigor.atividade;

import java.util.List;

public interface GravadorAluno {

    void salvar (Aluno aluno);
    List <Aluno> recuperarAlunos();

}
