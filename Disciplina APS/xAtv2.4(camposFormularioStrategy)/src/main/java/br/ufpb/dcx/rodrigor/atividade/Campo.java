package br.ufpb.dcx.rodrigor.atividade;

public class Campo {

    private String id, label;
    private ValidadorCampo validador;

    public Campo(String id, String label, ValidadorCampo validador) {
        this.id = id;
        this.label = label;
        this.validador = validador;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ValidadorCampo getValidador(){
        return this.validador;
    }


}
