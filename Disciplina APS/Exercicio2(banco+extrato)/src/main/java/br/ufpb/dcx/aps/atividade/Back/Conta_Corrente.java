package br.ufpb.dcx.aps.atividade.Back;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Conta_Corrente {

    private long numero;
    private BigDecimal saldo;
    private ArrayList <Correntista> correntistas = new ArrayList<>();
    private Banco banco;
    private Extrato extrato;

    public Conta_Corrente(Correntista c, Banco banco) {
        correntistas.add(c);
        saldo = new BigDecimal(0);
        this.banco = banco;
        numero = banco.getNumero();
        banco.addCorrentista(c);
        extrato = new Extrato(c.getNome());
    }

    public void addCorrentista(Correntista c){
        correntistas.add(c);
    }

    public void creditar(BigDecimal valor){
        int comparacao = valor.compareTo(BigDecimal.ZERO);

        if (comparacao <= 0){
            throw new IllegalArgumentException("Valor inválido");
        } else {
            saldo = saldo.add(valor);
            extrato.addTransacao(new Transacao("Depósito", valor));
        }

    }

    public void debitar(BigDecimal valor){

        int comparacao = valor.compareTo(BigDecimal.ZERO);

        if (comparacao <= 0){ //testa se valor <= 0
            throw new IllegalArgumentException("Valor inválido");
        } else if (valor.compareTo(saldo) == 1) { //testa se valor de saque > saldo (resultado da comparação 1, se fosse o inverso, resultado -1)
            throw new IllegalArgumentException("Valor maior que seu saldo atual");
        } else {
            saldo = saldo.subtract(valor);
            extrato.addTransacao(new Transacao("Saque", valor));
        }

    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta_Corrente that = (Conta_Corrente) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Conta Corrente:\n" +
                "numero: " + numero +
                ", saldo: " + saldo +
                ", banco: " + banco.getNome();
    }

    public String mostrarExtrato(){
        return extrato.toString();
    }
}
