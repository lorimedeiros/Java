package br.ufpb.dcx.aps.atividade.Back;

import java.util.ArrayList;

public class Extrato{

    private String proprietario;
    private ArrayList<Transacao> transacoes = new ArrayList<>();

    public Extrato(String proprietario){
        this.proprietario = proprietario;
    }

    public void addTransacao(Transacao t){
        transacoes.add(t);
    }

    @Override
    public String toString(){
        String str = "";

        for (int i = 0; i < transacoes.size(); i++) {
            Transacao t = transacoes.get(i);
            str += t.toString() + "\n";
        }

        return str;
    }

}
