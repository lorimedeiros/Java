import java.util.List;

public class Calculador {

    public static Integer maximo(List <Integer> l){ //o fato do método ser static permite que ele seja usado sem a necessidade de instanciar a classe
        if (l.isEmpty()){
            throw new IllegalStateException("A lista não pode ser vazia"); //caso não haja elementos na lista
            //programação defensiva
        }
        Integer maximo = l.get(0); // iniciando o maximo como sendo o primeiro elemneto
        for (Integer i : l){
            if (i.compareTo(maximo) > 0){
                maximo = i; //percorre comparando os itens, o cpmpareTo já é pra ver o maior
            }
        }
        return maximo;
    }

}
