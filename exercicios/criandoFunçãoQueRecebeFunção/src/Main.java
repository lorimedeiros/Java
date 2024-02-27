import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Amendoim", 10.5));
        lista.add(new Produto("Cu", 50.0));
        lista.add(new Produto("Ameixa", 5.25));
        lista.add(new Produto("amendoa", 10.0));

        ServicoProduto sp = new ServicoProduto();

        double soma = sp.somaFiltrada(lista, p -> p.getNome().charAt(0) == 'A');
        double soma2 = sp.somaFiltrada(lista, p -> p.getPreco() < 20);

        System.out.println("Soma = " + String.format("%.2f", soma));
        System.out.println("Soma2 = " + String.format("%.2f", soma2));
    }
}