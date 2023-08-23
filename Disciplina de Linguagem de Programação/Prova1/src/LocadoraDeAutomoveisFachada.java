public class LocadoraDeAutomoveisFachada {

    private Locadora lc = new Locadora();

    public Integer adicionaAutomovel(String modelo, int ano) {
        return lc.adicionaAutomovel(modelo, ano);
    }

    public String alugaCarro(int id) {
        return lc.alugaAutomovel(id);
    }

    public String devolveCarro(int id) {
        return lc.devolveAutomovel(id);
    }

    public String buscaPorModelo(String modelo) {
        return lc.buscaPorModelo(modelo);
    }

    public String buscaPorNaoAlugados() {
        return lc.buscaNaoAlugados();
    }

}
