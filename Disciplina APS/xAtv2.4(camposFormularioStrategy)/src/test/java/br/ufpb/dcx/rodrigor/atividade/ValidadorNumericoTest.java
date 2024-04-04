package br.ufpb.dcx.rodrigor.atividade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidadorNumericoTest {

    @Test
    public void testValidadorNumericoComValorDentroDoIntervalo() {
        ValidadorNumerico validador = new ValidadorNumerico(1, 10);
        Resultado resultado = validador.validar("5");
        assertTrue(resultado.ok(), "A validação deve ser bem-sucedida para um valor dentro do intervalo.");
    }

    @Test
    public void testValidadorNumericoComValorAbaixoDoMinimo() {
        ValidadorNumerico validador = new ValidadorNumerico(1, 10);
        Resultado resultado = validador.validar("0");
        assertFalse(resultado.ok(), "A validação deve falhar para um valor abaixo do mínimo.");
        assertEquals("Valor menor que o mínimo suportado:1", resultado.getMsgErro());
    }

    @Test
    public void testValidadorNumericoComValorAcimaDoMaximo() {
        ValidadorNumerico validador = new ValidadorNumerico(1, 10);
        Resultado resultado = validador.validar("11");
        assertFalse(resultado.ok(), "A validação deve falhar para um valor acima do máximo.");
        assertEquals("Valor maior que o máximo suportado:10", resultado.getMsgErro());
    }

    @Test
    public void testValidadorNumericoComValorNulo() {
        ValidadorNumerico validador = new ValidadorNumerico();
        assertThrows(IllegalArgumentException.class, () -> validador.validar(null), "A validação deve lançar uma exceção para valor nulo.");
    }

    @Test
    public void testValidadorNumericoSemLimitesDefinidos() {
        ValidadorNumerico validador = new ValidadorNumerico(ValidadorNumerico.INDEFINIDO, ValidadorNumerico.INDEFINIDO);
        Resultado resultado = validador.validar("0");
        assertTrue(resultado.ok(), "A validação deve ser bem-sucedida para qualquer valor quando os limites não estão definidos.");
    }
}
