import java.util.ArrayList;

public class ItensAEmbalar {

    ArrayList <ItemASerEmbaladoIF> itens = new ArrayList<>();

    public int adicionaItem(ItemASerEmbaladoIF item){
        itens.add(item);
        return itens.indexOf(item);
    }

    public double calculaQtdeDeEmbalar(int posicao){
        ItemASerEmbaladoIF i = itens.get(posicao);
        return i.getArea() * i.getPeso();
    }

    public double calculaQtdeTotalDeEmbalar(){
        double tot = 0.0;
        for (int i = 0; i < itens.size(); i++){
            tot += calculaQtdeDeEmbalar(i);
        }
        return tot;
    }

}
