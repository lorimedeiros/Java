import java.util.Objects;

public class MalaRetangular extends ItemASerEmbalado{

    private double lado1;
    private double lado2;

    public MalaRetangular(String material, double peso, double lado1, double lado2){
        super(material, peso);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double getArea() {
        return lado1 * lado2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterial(), getPeso(), lado1, lado2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MalaRetangular that = (MalaRetangular) o;
        return Double.compare(that.lado1, lado1) == 0 && Double.compare(that.lado2, lado2) == 0;
    }

    @Override
    public String toString() {
        return "MalaRetangular{" +
                "lado 1 = " + lado1 +
                "lado 2 = " + lado2 +
                super.toString() +
                '}';
    }

}
