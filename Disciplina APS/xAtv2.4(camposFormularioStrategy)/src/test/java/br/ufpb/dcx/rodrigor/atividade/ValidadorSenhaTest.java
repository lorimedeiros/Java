package br.ufpb.dcx.rodrigor.atividade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    public void senhaValidaTest() {
        ValidadorSenha validador = new ValidadorSenha(8, 16);
        Resultado resultado = validador.validar("Senha123");
        assertTrue(resultado.ok(), "A validação deve ser bem-sucedida para uma senha válida.");
    }

    @Test
    public void senhaCurtaTest() {
        ValidadorSenha validador = new ValidadorSenha(8, 16);
        Resultado resultado = validador.validar("Sen1");
        assertFalse(resultado.ok(), "A validação deve falhar para uma senha curta.");
        assertEquals("Valor menor que o mínimo suportado:8", resultado.getMsgErro());
    }

    @Test
    public void senhaLongaTest() {
        ValidadorSenha validador = new ValidadorSenha(8, 16);
        Resultado resultado = validador.validar("SenhaMuitoLooooonga123");
        assertFalse(resultado.ok(), "A validação deve falhar para uma senha longa.");
        assertEquals("Valor maior que o máximo suportado:16", resultado.getMsgErro());
    }

    @Test
    public void senhaSemNumeroTest() {
        ValidadorSenha validador = new ValidadorSenha(8, 16);
        Resultado resultado = validador.validar("SenhaSemNumero");
        assertFalse(resultado.ok(), "A validação deve falhar para uma senha sem número.");
        assertEquals("A senha deve ter pelo menos uma letra minuscula, uma maiuscula e um número!", resultado.getMsgErro());
    }

    @Test
    public void senhaSemMaiusculaTest() {
        ValidadorSenha validador = new ValidadorSenha(8, 16);
        Resultado resultado = validador.validar("senha123");
        assertFalse(resultado.ok(), "A validação deve falhar para uma senha sem letra maiúscula.");
        assertEquals("A senha deve ter pelo menos uma letra minuscula, uma maiuscula e um número!", resultado.getMsgErro());
    }

    @Test
    public void senhaSemMinusculaTest() {
        ValidadorSenha validador = new ValidadorSenha(8, 16);
        Resultado resultado = validador.validar("SENHA123");
        assertFalse(resultado.ok(), "A validação deve falhar para uma senha sem letra minúscula.");
        assertEquals("A senha deve ter pelo menos uma letra minuscula, uma maiuscula e um número!", resultado.getMsgErro());
    }

    @Test
    public void senhaNulaTest() {
        ValidadorSenha validador = new ValidadorSenha();
        assertThrows(IllegalArgumentException.class, () -> validador.validar(null), "A validação deve lançar uma exceção para senha nula.");
    }
}
