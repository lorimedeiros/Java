package br.ufpb.dcx.aps.atividades.banco;
import java.util.HashMap;
import static br.ufpb.dcx.aps.atividades.banco.Correntista.cpfValido;

public class Banco {

    private String nome;
    private HashMap <Integer, Conta> contas = new HashMap<>();
    private HashMap <String, Correntista> correntistas = new HashMap<>();
    private static int NUMERO_CONTA_LIVRE = 0;

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Conta criarConta(Correntista c) throws BancoException {
        if (!correntistas.containsValue(c)) throw new BancoException("Correntista não cadastrado no banco:" + c.toString());
        if (c.getConta() != null) throw new BancoException("Correntista já tem conta cadastrada");

        Conta ct = new Conta(c, gerarNumeroConta(), this);
        c.setConta(ct);
        contas.put(ct.getNumero(), ct);
        return ct;
    }

    public Conta getConta(int conta){
        return contas.get(conta);
    }

    public Conta getConta(Correntista titular){
        return correntistas.get(titular).getConta();
    }

    public void addCorrentista(Correntista c) throws BancoException {
        if (correntistas.containsKey(c.getCpf())) throw new RuntimeException("Correntista ja cadastrado:" + c.toString());
        if (!cpfValido(c.getCpf())) throw new RuntimeException("CPF invalido:" + c.getCpf());
        correntistas.put(c.getCpf(), c);
    }

    public Correntista getCorrentista(String cpf){
        if (!correntistas.containsKey(cpf)) throw new RuntimeException("Não existe correntista com cpf:" + cpf);
        return correntistas.get(cpf);

    }

    public static int gerarNumeroConta(){
        NUMERO_CONTA_LIVRE += 1;
        return NUMERO_CONTA_LIVRE;
    }

}
