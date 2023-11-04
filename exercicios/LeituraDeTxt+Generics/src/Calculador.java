import java.util.List;

public class Calculador {

    public static <T extends Comparable<? super T>> T maximo(List <T> l){ //o fato do método ser static permite que ele seja usado sem a necessidade de instanciar a classe
        //aquela porra grande(extends) ali é pra fazer o compareTo funcionar
        if (l.isEmpty()){
            throw new IllegalStateException("A lista não pode ser vazia"); //caso não haja elementos na lista
            //programação defensiva
        }
        T maximo = l.get(0); // iniciando o maximo como sendo o primeiro elemneto
        for (T i : l){
            if (i.compareTo(maximo) > 0){
                maximo = i; //percorre comparando os itens, o cpmpareTo já é pra ver o maior
            }
        }
        return maximo;
    }

}