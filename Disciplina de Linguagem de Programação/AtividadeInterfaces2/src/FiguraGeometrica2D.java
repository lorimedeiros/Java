public interface FiguraGeometrica2D extends Comparable <FiguraGeometrica2D>{

    Double area();
    Double perimetro();;
    String nomeFigura();
    int compareTo(FiguraGeometrica2D figura);
}
