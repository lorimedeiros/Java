package br.ufpb.dcx.rodrigor.atividade;

public interface ValidadorCampo {

    Resultado validar(String valor) throws CampoInvalidoException;
}
