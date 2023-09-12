public class UrubuDoPix implements Voador{

    private Double saldoDoPix;

    public UrubuDoPix(){
        saldoDoPix = 0.0;
    }

    public Double getSaldoDoPix() {
        return saldoDoPix;
    }

    public void depositaPix(Double deposito) {

        if(deposito <= 0 || deposito == null){
            throw new IllegalArgumentException("Valor discrepante");
        }

        saldoDoPix += deposito;
        System.out.println("Urubu recebeu o pix");
    }

    public void pedirPix(Double valor) throws Exception {

        if(valor <= 0 || valor == null){
            throw new IllegalArgumentException("Valor discrepante");
        }
        if(valor > saldoDoPix){
            throw new Exception("Urubu está liso :(");
        }

        saldoDoPix -= valor;
        System.out.println("Urubu fez o pix");
    }

    @Override
    public double voar() {
        System.out.println("Voe, urubu");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plane, Urubu");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pouse, Urubu");
        return true;

    }

}
