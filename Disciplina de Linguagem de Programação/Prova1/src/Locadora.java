import java.util.ArrayList;

public class Locadora {

    private ArrayList <Automovel> lista = new ArrayList<>();

    public Integer adicionaAutomovel(String modelo, Integer ano){

        Automovel am = new Automovel(lista.size() + 1, modelo, ano);
        lista.add(am);
        return am.getId();

    }

    public String alugaAutomovel(Integer id){

        Automovel am = lista.get(id - 1);
        if (am.getAlugado() == false){
            am.setAlugado(true);
            return am.toString();
        } else {
            return null;
        }

    }

    public String devolveAutomovel(Integer id){

        Automovel am = lista.get(id - 1);
        if(am.getAlugado() == true){
            am.setAlugado(false);
            return am.toString();
        } else {
            return null;
        }

    }

    public String buscaPorModelo(String modelo){

        String str = "";
        for (int i = 0; i < lista.size(); i++){

            Automovel am = lista.get(i);
            if(am.getModelo().contains(modelo)){
                str += am.toString() + "\n";
            }

        }

        return str;

    }

    public String buscaNaoAlugados(){

        String str = "";
        for (int i = 0; i < lista.size(); i++){

            Automovel am = lista.get(i);
            if(am.getAlugado() == false){
                str += am.toString() + "\n";
            }

        }

        return str;

    }

}
