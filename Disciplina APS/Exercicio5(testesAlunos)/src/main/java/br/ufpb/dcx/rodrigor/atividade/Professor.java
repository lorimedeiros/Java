package br.ufpb.dcx.rodrigor.atividade;

import java.util.Objects;

public class Professor {

    private String siape;
    private String nome;

    public Professor(String siape, String nome) {
        if (siape == null) throw new IllegalArgumentException("O siape não pode ser null");
        if (siape == "") throw new IllegalArgumentException("O siape não pode ser vazio");
        if (!isSiapeValida(siape)) throw new IllegalArgumentException("O siape deve ser um número");
        this.siape = siape;
        this.nome = nome;
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
        if (nome == null) throw new IllegalArgumentException("O nome não pode ser null");
        if (nome == "") throw new IllegalArgumentException("O nome não pode ser vazio");
        this.nome = nome;
    }

    public static boolean isSiapeValida(String siape) {
        return siape.matches("\\d+");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(siape, professor.siape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siape);
    }
}
