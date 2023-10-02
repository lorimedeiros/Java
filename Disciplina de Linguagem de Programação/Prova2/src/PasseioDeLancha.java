import java.time.LocalDate;
import java.util.Objects;

public class PasseioDeLancha extends VendaDeTurismo{

    private static double PRECO_POR_PESSOA = 60.0;
    private int numeroDePessoas;
    private int qtdeDeHoras;

    public PasseioDeLancha(LocalDate dataDoEvento, String tipoDoEvento, int numeroDePessoas, int qtdeDeHoras) {
        super(dataDoEvento, tipoDoEvento);
        this.numeroDePessoas = numeroDePessoas;
        this.qtdeDeHoras = numeroDePessoas;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public int getQtdeDeHoras() {
        return qtdeDeHoras;
    }

    public void setQtdeDeHoras(int qtdeDeHoras) {
        this.qtdeDeHoras = qtdeDeHoras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PasseioDeLancha that = (PasseioDeLancha) o;
        return numeroDePessoas == that.numeroDePessoas && qtdeDeHoras == that.qtdeDeHoras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDePessoas, qtdeDeHoras);
    }

    @Override
    public String toString(){
        return "Quantidade de pessoas: " + getNumeroDePessoas() + " quantidade de horas: " + getQtdeDeHoras() + " preço por pessoa: " + PRECO_POR_PESSOA + " evento: " + getTipoDoEvento();
    }

    @Override
    public double getPreco() {
        return numeroDePessoas * qtdeDeHoras * PRECO_POR_PESSOA;
    }

}
