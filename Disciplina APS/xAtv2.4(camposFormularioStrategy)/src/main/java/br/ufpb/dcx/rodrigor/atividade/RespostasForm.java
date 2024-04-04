package br.ufpb.dcx.rodrigor.atividade;

import java.util.LinkedHashMap;
import java.util.Map;

public class RespostasForm {

    private Map<Campo,String> respostas = new LinkedHashMap<>();
    private Formulario formulario;


    public RespostasForm(Formulario formulario){
        this.formulario = formulario;
    }

    public Formulario getFormulario(){
        return this.formulario;
    }

    public void setResposta(Campo campo, String valor){
        if(!formulario.contemCampo(campo)) throw new IllegalArgumentException("Não existe o campo "+campo);
        this.respostas.put(campo,valor);
    }

    public void setResposta(String campoID, String valor) throws CampoInvalidoException {
        this.setResposta(this.formulario.getCampo(campoID),valor);
    }


}
