package br.ufpb.dcx.rodrigor.atividade;

import java.util.Objects;

public class Quarto {
    private String codigo;
    private String categoria;
    private Double valorDiaria;

    public Quarto(String codigo, String categoria, Double valorDiaria) {
        if ((codigo == null) || (codigo == "")) throw new IllegalArgumentException("Código inválido");
        if ((categoria == null) || (categoria == "")) throw new IllegalArgumentException("Categoria inválida");
        if ((valorDiaria == null) || (valorDiaria <= 0)) throw new IllegalArgumentException("Valor inválido");

        this.codigo = codigo;
        this.categoria = categoria;
        this.valorDiaria = valorDiaria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quarto quarto = (Quarto) o;
        return Objects.equals(codigo, quarto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valorDiaria=" + valorDiaria +
                '}';
    }

}
