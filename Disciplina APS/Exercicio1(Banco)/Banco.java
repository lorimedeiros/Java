package br.ufpb.dcx.aps.atividade;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private long codigo;
    private ArrayList <Conta_Corrente> contas = new ArrayList<>();
    private ArrayList <Correntista> correntistas = new ArrayList<>();
    private long qtContas;

    public Banco() {
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

}
