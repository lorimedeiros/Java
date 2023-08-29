public class Funcionario {

    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Funcionario(){}

    public Funcionario(String nome, Integer horas, Double valorPorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome(){
        return nome;
    }

    public Double pagamento(){
        return horas * valorPorHora;
    }

}
