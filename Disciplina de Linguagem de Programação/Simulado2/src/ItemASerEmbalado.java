public abstract class ItemASerEmbalado implements ItemASerEmbaladoIF{

    private String material;
    private double peso;

    public ItemASerEmbalado(String material, double peso){
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial(){
        return material;
    }

    public double getPeso(){
        return peso;
    }

    public abstract double getArea();

}
