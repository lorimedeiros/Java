package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Produto {

    private String codigo;
    private String nome;
    private BigDecimal preco;


    public Produto(String codigo) {
        this(codigo,"");
    }

    public Produto(String codigo, String nome) {
        this(codigo,nome,BigDecimal.valueOf(0));
    }

    public Produto(String codigo, String nome, BigDecimal preco) {
        if (codigo == null) throw new IllegalArgumentException("O código do produto não pode ser null");
        if (codigo == "") throw new IllegalArgumentException("O código do produto não pode ser vazio");
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) throw new IllegalArgumentException("O nome do produto não pode ser null");
        if (isNomeValidoNumeral(nome)) throw new IllegalArgumentException("O nome do produto não pode conter apenas números");
        if (isNomeBranco(nome)) throw new IllegalArgumentException("O nome do produto não pode conter apenas espaços vazios");
        this.nome = nome;
    }

    public static boolean isNomeValidoNumeral(String nome) {
        return nome.matches("\\d+"); // Verifica se nome contém APENAS números
    }

    public static boolean isNomeBranco(String nome) {
        return nome.matches("\\s*"); // Verifica se nome contém APENAS espaços vazios
    }

    public BigDecimal getPreco() {
        return preco;
    }


    public void setPreco(String preco){
        if (preco == null) throw new IllegalArgumentException("O valor do produto não pode se null");
        BigDecimal precoFinal = new BigDecimal(Double.parseDouble(preco));
        int comparacao = precoFinal.compareTo(BigDecimal.ZERO);

        if (comparacao < 0) throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        this.setPreco(new BigDecimal(preco));
    }

    public void setPreco(BigDecimal preco) {
        if (preco == null) throw new IllegalArgumentException("O valor do produto não pode se null");
        int comparacao = preco.compareTo(BigDecimal.ZERO);

        if (comparacao < 0) throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
