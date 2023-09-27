import java.util.Objects;

public class PratoRedondo extends ItemASerEmbalado {
    private double raio;

    public PratoRedondo(String material, double peso, double raio) throws Exception {
        super(material, peso);
        testaEntrada(raio);
        this.raio = raio;
    }

    private void testaEntrada(double raio) throws Exception {
        if(raio <= 0)
            throw new Exception("Raio tem que ser maior que zero");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterial(), getPeso(), raio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PratoRedondo that)) return false;
        if (!super.equals(o)) return false;

        return Double.compare(that.getRaio(), getRaio()) == 0;
    }

    @Override
    public String toString() {
        return "PratoRedondo{" +
                "raio = " + raio +
                super.toString() +
                '}';
    }
}