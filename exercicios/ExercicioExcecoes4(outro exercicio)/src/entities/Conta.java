package entities;

public class Conta {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta(){}

    public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void deposito(Double valor){
        saldo += valor;
    }

    public String saque(Double valor){
        if (saldo == 0.0 || saldo == null || valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        if (valor > limiteDeSaque){
            throw new IllegalArgumentException("Valor ultrapassa seu limite de saque");
        }
        saldo -= valor;
        return "Novo saldo: " + getSaldo();
    }

    @Override
    public String toString(){
        return "Número da conta: " + getNumero() + "\n" +
                "Titular: " + getTitular() + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "Limite de saque: " + getLimiteDeSaque();
    }
}
