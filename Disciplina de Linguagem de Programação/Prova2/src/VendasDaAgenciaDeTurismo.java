import java.util.ArrayList;
import java.util.List;

public class VendasDaAgenciaDeTurismo {

    private List <VendasDeTurismoIF> lista = new ArrayList<>();

    public int adicionaVenda(VendasDeTurismoIF venda){
        lista.add(venda);
        return lista.indexOf(venda);
    }

    public double getPrecoDeVenda(int posicao){
        VendasDeTurismoIF venda = lista.get(posicao);
        return venda.getPreco();
    }

    public double getPrecoTotal(){
        double total = 0.0;

        for (int i = 0; i < lista.size(); i++) {

            VendasDeTurismoIF venda = lista.get(i);
            total += venda.getPreco();

        }

        return total;
    }

    public String listagemDeVendas(){
        String str = "";

        for (int i = 0; i < lista.size(); i++) {

            VendasDeTurismoIF venda = lista.get(i);
            str += venda.toString() + "\n";

        }

        return str;
    }

}
