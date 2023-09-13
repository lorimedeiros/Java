public class Circulo implements FiguraGeometrica2D{

    private Double raio;

    public Circulo(Double raio){
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * (raio * raio);
    }

    @Override
    public Double perimetro() {
        return 2.0 * Math.PI * raio;
    }

    @Override
    public String nomeFigura(){
        return "Círculo";
    }

    @Override
    public String toString(){
        return nomeFigura() + "\nDe raio: " + raio + "\nÁrea: " + area() + "\nPerímetro: " + perimetro();
    }

    @Override
    public int compareTo(FiguraGeometrica2D figura) {
        return this.area().compareTo(figura.area());
    }
}
