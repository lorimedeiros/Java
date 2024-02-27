import java.util.List;
import java.util.function.Predicate;

public class ServicoProduto {
    public Double somaFiltrada(List<Produto> lista, Predicate<Produto> criterio){
        Double s = 0.0;
        for (Produto p : lista){
            if (criterio.test(p)){
                s += p.getPreco();
            }
        }
        return s;
    }
}
