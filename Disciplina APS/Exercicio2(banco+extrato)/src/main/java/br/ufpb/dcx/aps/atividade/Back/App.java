package br.ufpb.dcx.aps.atividade.Back;

import java.math.BigDecimal;

public class App {
    public static void main(String[] argsadd){

        Banco b = new Banco("tuBank", 205);
        System.out.println(b);

        Correntista corr = new Correntista("Joao", "000", "15/65");
        System.out.println(corr);

        Conta_Corrente conta = new Conta_Corrente(corr, b);
        System.out.println(conta);

        try{

            conta.creditar(new BigDecimal(500));
            System.out.println(conta.getSaldo());

            conta.debitar(new BigDecimal(100));
            System.out.println(conta.getSaldo());

            System.out.println(conta.mostrarExtrato());

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
