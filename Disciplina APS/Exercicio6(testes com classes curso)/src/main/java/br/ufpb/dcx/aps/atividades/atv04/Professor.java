package br.ufpb.dcx.aps.atividades.atv04;

public class Professor {
    private String siape;
    private String nome;

    public Professor(String siape, String nome) {
        if (siape == null) throw new IllegalArgumentException("siape invalido:null");
        if (siape == "") throw new IllegalArgumentException("siape invalido:");
        this.siape = siape;
        this.nome = nome;
    }
    public Professor(String siape) {
        if (siape == null) throw new IllegalArgumentException("siape invalido:null");
        if (siape == "") throw new IllegalArgumentException("siape invalido:");
        this.siape = siape;
        this.nome = "";
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
