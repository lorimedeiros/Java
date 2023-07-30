public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private Double saldo;

    public void Conta(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
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
