package br.ufpb.dcx.rodrigor.atividade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void testSiape() {
        Professor professor = new Professor("123","João");
        assertEquals("123",professor.getSiape());

        assertThrows(IllegalArgumentException.class, () -> new Professor(null,"João"), "O siape não pode ser null");
        assertThrows(IllegalArgumentException.class, () -> new Professor("","João"), "O siape não pode ser vazio");
        assertThrows(IllegalArgumentException.class, () -> new Professor("abc","João"), "O siape deve ser um número");
    }

    @Test
    void testNome() {
        Professor professor = new Professor("123","João");
        assertEquals("João",professor.getNome());

        assertThrows(IllegalArgumentException.class, () -> professor.setNome(null), "O nome não pode ser null");
        assertThrows(IllegalArgumentException.class, () -> professor.setNome(""), "O nome não pode ser vazio");
    }

    @Test
    void testEquals(){
        Professor prof1 = new Professor("123","Joao A");
        Professor prof2 = new Professor("123", "Joao B");

        assertEquals(prof1,prof2,"Dois professores são iguais quando têm o mesmo siape, mesmo que tenham nomes diferentes.");
    }
}