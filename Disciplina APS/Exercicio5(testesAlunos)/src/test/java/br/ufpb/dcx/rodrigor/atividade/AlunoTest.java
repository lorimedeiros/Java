package br.ufpb.dcx.rodrigor.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno aluno;
    @BeforeEach
    void setUp() {
        aluno = new Aluno();
    }

    @Test
    void testMatricula() {
        assertNull(aluno.getMatricula());
        aluno.setMatricula("877733");
        assertEquals("877733",aluno.getMatricula());

        // Não deve ser possível atribuir matrícula "null"
        assertThrows(IllegalArgumentException.class, () -> aluno.setMatricula(null));

        Exception e = assertThrows(IllegalArgumentException.class, () -> aluno.setMatricula("ddjsd"));
        assertEquals("Matricula Invalida! Matricula deve ser numerica! matricula='ddjsd'",e.getMessage());

    }

    @Test
    void testNome() {
        assertEquals("",aluno.getNome(),"O nome deve ser inicializado com String vazio");
        aluno.setNome("Joao");
        assertEquals("Joao",aluno.getNome());
        assertThrows(IllegalArgumentException.class, () -> aluno.setNome(null),"Não deve ser possível atribuir o valor `null` ao nome da classe Aluno");
    }

    @Test
    void testEquals(){
        assertEquals(new Aluno("123","Joao"), new Aluno("123","Joao dois"),
                "Dois alunos são iguais se suas matriculas são iguais, mesmo com nomes diferentes");
    }

}