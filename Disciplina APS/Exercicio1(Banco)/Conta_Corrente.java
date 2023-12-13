package br.ufpb.dcx.aps.atividade;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Conta_Corrente {

    private long numero;
    private BigDecimal saldo;
    private ArrayList <Correntista> correntistas = new ArrayList<>();

    public Conta_Corrente(Correntista c, Banco b) {
        correntistas.add(c);
        saldo = new BigDecimal(0);
        numero = b.getNumero();
    }

    public void addCorrentista(Correntista c){
        correntistas.add(c);
    }

    public void creditar(BigDecimal valor){
        int comparacao = valor.compareTo(BigDecimal.ZERO);

        if (comparacao <= 0){
            throw new IllegalArgumentException();
        } else {
            saldo.add(valor);
        }

    }

    public void debitar(BigDecimal valor){

        int comparacao = valor.compareTo(BigDecimal.ZERO);

        if (comparacao <= 0){ //testa se valor <= 0
            throw new IllegalArgumentException();
        } else if (valor.compareTo(saldo) == 1) { //testa se valor de saque > saldo (resultado da comparação 1, se fosse o inverso, resultado -1)
            throw new IllegalArgumentException();
        } else {
            saldo.subtract(valor);
        }

    }

    public BigDecimal getSaldo(){
        return saldo;
    }

}
