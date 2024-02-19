package br.ufpb.dcx.aps.atividades.banco;

import java.util.Objects;

public class Correntista {
    private String cpf;
    private String nome;
    private Conta conta;

    public Correntista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public static boolean cpfValido(String cpf){
        if (cpf.length() > 0){
            char primeiro = cpf.charAt(0);
            int somaIguais = 0;
            for (int i = 1; i < cpf.length(); i++) {
                if (cpf.charAt(i) == primeiro) {
                    somaIguais += 1;
                }
            }
            if (somaIguais > 9){
                return false;
            }
        }
        if (cpf.length() < 10 || cpf.length() > 14){
            return false;
        } else if (cpf.isEmpty() || cpf == null){
            return false;
        }
        return true;
    }

    public static String removeSeparadores(String cpf){
        String strSemPontosTracos = cpf.replaceAll("[-.]", "");
        return strSemPontosTracos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correntista that = (Correntista) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Correntista{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
