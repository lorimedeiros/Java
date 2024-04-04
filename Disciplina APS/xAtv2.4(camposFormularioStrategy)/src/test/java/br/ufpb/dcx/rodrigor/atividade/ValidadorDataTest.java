package br.ufpb.dcx.rodrigor.atividade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorDataTest {
    @Test
    public void testValidarDataValida() {
        ValidadorData validador = new ValidadorData("dd/MM/yyyy");
        Resultado resultado = validador.validar("31/12/2020");
        assertTrue(resultado.ok(), "A validação deve passar para uma data válida.");
    }

    @Test
    public void testValidarDataInvalida() {
        ValidadorData validador = new ValidadorData("dd/MM/yyyy");
        Resultado resultado = validador.validar("31/02/2020"); // Data inválida, fevereiro não tem 31 dias.
        assertFalse(resultado.ok(), "A validação deve falhar para uma data inválida.");
    }

    @Test
    public void testValidarFormatoInvalido() {
        ValidadorData validador = new ValidadorData("dd/MM/yyyy");
        Resultado resultado = validador.validar("2020-12-31"); // Formato inválido.
        assertFalse(resultado.ok(), "A validação deve falhar para um formato de data inválido.");
    }
}

