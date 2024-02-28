package br.ufpb.dcx.rodrigor.atividade;

import java.util.Objects;

public class Hospede {
    private String cpf;
    private String nome;

    public Hospede(String cpf, String nome) {
        if ((cpf == null) || (cpf == "")) throw new IllegalArgumentException("CPF inválido");
        if ((nome == null) || (nome == "")) throw new IllegalArgumentException("Nome inválido");

        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospede hospede = (Hospede) o;
        return Objects.equals(cpf, hospede.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

}
