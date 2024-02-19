package br.ufpb.dcx.aps.atividades.banco;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Conta {
    Locale brasil = new Locale("pt", "BR");
    private Correntista correntista;
    private int numero;
    private Banco banco;
    private ArrayList <Transacao> transacoes = new ArrayList<Transacao>();
    private double saldo;

    public Conta(Correntista correntista, int numero, Banco banco) {
        if (numero < 0) throw new IllegalArgumentException("numero da conta não pode ser negativo");
        this.correntista = correntista;
        this.numero = numero;
        this.banco = banco;
        saldo = 0.0;
    }

    public int getNumero(){
        return numero;
    }

    public Transacao depositar(double valor) throws ContaException {
        if (valor < 0) throw new ContaException("Não é possível depositar valor negativo");
        saldo += valor;
        Transacao t;
        if (transacoes.isEmpty()) {
            t = new Transacao(1, valor);
        } else {
            t = new Transacao(transacoes.size() + 1, valor);
        }
        transacoes.add(t);
        t.setTipo("CRÉDITO");
        return t;
    }

    public Transacao sacar(double valor) throws ContaException {
        if (valor < 0) throw new ContaException("Não é possível sacar valor negativo");
        if (saldo < valor) throw new ContaException("Saldo insuficiente. Saldo:" + saldo + " - valor do saque:" + valor);
        saldo -= valor;
        Transacao t = new Transacao(transacoes.size() + 1, - valor);
        transacoes.add(t);
        t.setTipo("DÉBITO");
        return t;
    }

    public double getSaldo(){
        return saldo;
    }

    public String extrato(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(brasil);
        String str = ">> " + this.banco.getNome() + "\n" + ">> Correntista: \n" +
                " CPF: " + this.correntista.getCpf() + "\n " + this.correntista.getNome() + "\n> EXTRATO\n" +
                "------------------------------------\n";

        for (Transacao t : transacoes) {
            str += t.toString() + "\n";
        }

        str += "------------------------------------\n";
        String saldoFormatado = nf.format(saldo);
        saldoFormatado = saldoFormatado.replace("\u00a0", " "); // Substitui NBSP por espaço
        str += "SALDO:\t" + saldoFormatado;
        return str;
        //tava dando um problema do diabo, por isso aquela gambiarra no saldo
        //o NumberFormat para converter num formato que já "traduz" o double a real brasileiro
        //o saldoFormatado para tirar um espaço indesejado (ao invés de um espaço printava "NBSP", que é \u00a0
    }

}
