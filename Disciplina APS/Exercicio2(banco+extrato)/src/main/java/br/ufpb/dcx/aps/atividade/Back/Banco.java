package br.ufpb.dcx.aps.atividade.Back;

import java.util.ArrayList;
import java.util.Objects;

public class Banco {

    private String nome;
    private long codigo;
    private ArrayList <Conta_Corrente> contas = new ArrayList<>();
    private ArrayList <Correntista> correntistas = new ArrayList<>();
    private long qtContas;

    public Banco(String nome, long codigo) {
        this.nome = nome;
        this.codigo = codigo;
        qtContas = 0;
    }

    public void addCorrentista(Correntista c){
        correntistas.add(c);
    }

    public void addConta(Conta_Corrente c){
        contas.add(c);
        qtContas += 1;
    }

    public long getNumero(){
        return (qtContas + 1);
    }

    public String getNome(){
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return codigo == banco.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Banco:\n" +
                "nome: " + nome  +
                ", codigo: " + codigo;
    }
}
