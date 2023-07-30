public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private Double saldo = 0.0;

    public Conta(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposita(depositoInicial);
    }

    public Conta(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;

    }

    public void deposita(double valor){
        saldo += valor;
    }

    public void saca(double valor){
        saldo -= (valor + 5);
    }

    public String toString(){
        return "Conta " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: R$ " + saldo;
    }

}
