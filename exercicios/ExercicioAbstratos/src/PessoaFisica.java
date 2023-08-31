public class PessoaFisica extends Pessoa{

    private Double gastoComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public Double impostoDeRenda(){

        if (getRendaAnual() <= 20000.0){

            Double imp = getRendaAnual() * 0.15;
            return imp;

        } else {

            if (getGastoComSaude() > 0){

                Double imp = (getRendaAnual() * 0.25) - (getGastoComSaude() * 0.5);
                return imp;

            } else {

                Double imp = (getRendaAnual() * 0.25);
                return imp;

            }
        }

    }

    @Override
    public String toString(){
        return super.getNome() + ": R$ " + impostoDeRenda();
    }

}
