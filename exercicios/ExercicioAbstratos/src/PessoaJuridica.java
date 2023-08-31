public class PessoaJuridica extends Pessoa{

    private Integer numDeFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numDeFuncionarios) {
        super(nome, rendaAnual);
        this.numDeFuncionarios = numDeFuncionarios;
    }

    public Integer getNumDeFuncionarios() {
        return numDeFuncionarios;
    }

    public void setNumDeFuncionarios(Integer numDeFuncionarios) {
        this.numDeFuncionarios = numDeFuncionarios;
    }

    @Override
    public Double impostoDeRenda(){

        if (getNumDeFuncionarios() > 10){

            Double imp = getRendaAnual() * 0.14;
            return imp;

        } else {

            Double imp = getRendaAnual() * 0.16;
            return imp;

        }
    }

    @Override
    public String toString(){
        return super.getNome() + ": R$ " + impostoDeRenda();
    }

}
