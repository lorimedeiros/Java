package br.ufpb.dcx.rodrigor.atividade;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Formulario {

    private Map<String,Campo> campos = new LinkedHashMap<>();



    public void addCampo(Campo campo) throws CampoInvalidoException {
        if(campo == null) throw new IllegalArgumentException("campo = null!!!!!");
        if(campo.getId().isBlank()) throw new IllegalArgumentException("campo.getId() é inválido:"+campo.getId());
        if(campos.containsKey(campo.getId())) throw new CampoInvalidoException("Já existe um campo com o id"+campo.getId());
        this.campos.put(campo.getId(),campo);
    }


    public Campo getCampo(String id) throws CampoInvalidoException {
        if(!campos.containsKey(id)) throw new CampoInvalidoException("Não existe um campo com id: "+id);
        return campos.get(id);
    }

    public Collection<Campo> getCampos() {
        return campos.values();
    }

    public boolean contemCampo(Campo campo) {
        if(campo == null) throw new IllegalArgumentException("campo é null!!!!!");
        return campos.containsKey(campo.getId());
    }
}
