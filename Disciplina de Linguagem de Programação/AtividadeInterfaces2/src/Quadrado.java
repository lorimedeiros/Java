public class Quadrado implements FiguraGeometrica2D{

    private Double lado;

    public Quadrado(Double lado){
        this.lado = lado;
    }

    @Override
    public Double area() {
        return lado * lado;
    }

    @Override
    public Double perimetro() {
        return 4.0 * lado;
    }

    @Override
    public String nomeFigura(){
        return "Quadrado";
    }

    @Override
    public String toString(){
        return nomeFigura() + "\nDe lado: " + lado + "\nÁrea: " + area() + "\nPerímetro: " + perimetro();
    }

    @Override
    public int compareTo(FiguraGeometrica2D figura) {
        return this.area().compareTo(figura.area());
    }

}
