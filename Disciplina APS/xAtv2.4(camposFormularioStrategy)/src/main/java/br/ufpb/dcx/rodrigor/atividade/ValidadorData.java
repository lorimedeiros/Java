package br.ufpb.dcx.rodrigor.atividade;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidadorData implements ValidadorCampo {

    private String padraoData;

    public ValidadorData(String padraoData){
        this.padraoData = padraoData;
    }

    @Override
    public Resultado validar(String valor) {
        SimpleDateFormat formatter = new SimpleDateFormat(padraoData);
        formatter.setLenient(false); //essa belezura aqui me garante que coisas do tipo "30/02" aconteçam
        try {
            formatter.parse(valor);
            return new Resultado();
        } catch (ParseException e) {
            return new Resultado(false, "Data inválida");
        }
    }
}

