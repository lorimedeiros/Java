public class FuncionarioTerceirizado extends Funcionario{

    private Double despezaAdicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despezaAdicional){
        super(nome, horas, valorPorHora);
        this.despezaAdicional = despezaAdicional;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + (despezaAdicional * 1.1);
    }

}
