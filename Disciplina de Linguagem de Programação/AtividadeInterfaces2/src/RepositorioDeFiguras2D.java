import java.util.ArrayList;;
import java.util.Collections;

public class RepositorioDeFiguras2D {

    ArrayList <FiguraGeometrica2D> lista = new ArrayList<>();

    public void adiciona(FiguraGeometrica2D figura){
        lista.add(figura);
        System.out.println("Posição da figura " + (lista.size() - 1));
    }

    public void remove(Integer posicao) throws Exception {

        if(lista.isEmpty()){
            throw new Exception("Não há figuras para remover");
        }
        if (posicao > lista.size() || posicao < 0){
            throw new ArrayIndexOutOfBoundsException("Posição inexistente");
        }

        FiguraGeometrica2D f = lista.get(posicao);
        lista.remove(f);

    }

    public Double areaDaFiguraNaPosicao(Integer posicao) throws Exception {

        if(lista.isEmpty()){
            throw new Exception("Não há figuras");
        }
        if (posicao > lista.size() || posicao < 0){
            throw new ArrayIndexOutOfBoundsException("Posição inexistente");
        }

        FiguraGeometrica2D f = lista.get(posicao);
        return f.area();

    }

    public Double perimetroDaFiguraNaPosicao(Integer posicao) throws Exception {

        if(lista.isEmpty()){
            throw new Exception("Não há figuras");
        }
        if (posicao > lista.size() || posicao < 0){
            throw new ArrayIndexOutOfBoundsException("Posição inexistente");
        }

        FiguraGeometrica2D f = lista.get(posicao);
        return f.perimetro();

    }

    public String descricaoDaFiguraNaPosicao(Integer posicao) throws Exception {

        if(lista.isEmpty()){
            throw new Exception("Não há figuras");
        }
        if (posicao > lista.size() || posicao < 0){
            throw new ArrayIndexOutOfBoundsException("Posição inexistente");
        }

        FiguraGeometrica2D f = lista.get(posicao);
        return f.nomeFigura();

    }

    public void ordenaPorArea(){
        Collections.sort(lista);
    }

    public void retornaTodos(){
        for (int i = 0; i < lista.size(); i++) {
            FiguraGeometrica2D f = lista.get(i);
            System.out.println(f.toString());
        }
    }

}
