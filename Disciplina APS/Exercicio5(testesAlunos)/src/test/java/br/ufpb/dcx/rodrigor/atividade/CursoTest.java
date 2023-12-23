package br.ufpb.dcx.rodrigor.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {


    private Curso curso;
    @BeforeEach
    void setUp() {

        curso = new Curso("SILCC");
    }

    @Test
    void testNome(){
        assertEquals("SILCC",curso.getNome());
        assertThrows(IllegalArgumentException.class, () -> curso.setNome(null),
                "O nome do curso não pode ser null");
    }


    @Test
    void cadastrarAluno() throws Exception {
        assertTrue(curso.getAlunos().isEmpty());
        Aluno aluno1 = new Aluno("123","Joao");
        curso.cadastrarAluno(aluno1);
        assertEquals(aluno1,curso.getAluno(aluno1.getMatricula()));
        assertThrows(Exception.class, () -> curso.cadastrarAluno(aluno1),
                "Não é possível cadastrar o mesmo aluno mais de uma vez no Curso");
        assertThrows(Exception.class, () -> curso.cadastrarAluno(new Aluno("123","Joao dois")),
                "Não é possível cadastrar dois alunos com a mesma matrícula");

        assertTrue(curso.isAlunoCadastrado(aluno1));

    }

    @Test
    void testCriarDisciplina() throws Exception {
        assertTrue(curso.getDisciplinas().isEmpty(),
                "Um curso novo não tem disciplinas cadastradas.");

        Disciplina aps = curso.criarDisciplina("aps","Análise e Projeto de Software");
        assertEquals("aps",aps.getCodigo());
        assertEquals("Análise e Projeto de Software",aps.getNome());

        assertThrows(Exception.class, () -> curso.criarDisciplina("aps","Análise"),
                "Não podem existir duas disciplinas com o mesmo código");

        assertThrows(Exception.class, ()-> curso.criarDisciplina("","Disciplina"),
                "O código da disciplina não pode ser vazio");

    }

}