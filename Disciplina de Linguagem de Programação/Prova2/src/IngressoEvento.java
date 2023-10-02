import java.time.LocalDate;
import java.util.Objects;

public class IngressoEvento extends VendaDeTurismo {
    private int qtdeDeIngressosInteira;
    private int qtdeDeIngressosMeia;
    private double valorEntradaInteira;

    public IngressoEvento(LocalDate dataDoEvento, String tipoDoEvento,
                          int qtdeDeIngressosInteira, int qtdeDeIngressosMeia,
                          double valorEntradaInteira) throws Exception {
        super(dataDoEvento, "Ingresso: " + tipoDoEvento);
        testaEntrada(qtdeDeIngressosInteira, qtdeDeIngressosMeia, valorEntradaInteira);
        this.qtdeDeIngressosInteira = qtdeDeIngressosInteira;
        this.qtdeDeIngressosMeia = qtdeDeIngressosMeia;
        this.valorEntradaInteira = valorEntradaInteira;
    }

    private void testaEntrada(int qtdeDeIngressosTotal, int qtdeMeiaEntrada, double valorEntradaInteira)
            throws Exception {
        if (qtdeDeIngressosTotal < 1 || qtdeMeiaEntrada < 1)
            throw new Exception(
                    "Quantidade total de ingressos e quantidade de ingressos de meia entrada deve ser maior que 1");
        if (qtdeDeIngressosTotal < qtdeMeiaEntrada)
            throw new Exception("Quantidade de meia entrada deve ser menor que quantidade total de ingressos");
        if (valorEntradaInteira <= 0)
            throw new Exception("Valor da entrada inteira deve ser maior que zero");
    }

    public int getQtdeDeIngressosInteira() {
        return qtdeDeIngressosInteira;
    }

    public void setQtdeDeIngressosInteira(int qtdeDeIngressosInteira) {
        this.qtdeDeIngressosInteira = qtdeDeIngressosInteira;
    }

    public int getQtdeMeiaEntrada() {
        return qtdeDeIngressosMeia;
    }

    public void setQtdeMeiaEntrada(int qtdeMeiaEntrada) {
        this.qtdeDeIngressosMeia = qtdeMeiaEntrada;
    }

    public double getValorEntradaInteira() {
        return valorEntradaInteira;
    }

    public void setValorEntradaInteira(double valorEntradaInteira) {
        this.valorEntradaInteira = valorEntradaInteira;
    }

    @Override
    public double getPreco() {
        return ((double) qtdeDeIngressosInteira) * valorEntradaInteira
                + ((double) qtdeDeIngressosMeia) * valorEntradaInteira / 2.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IngressoEvento that)) return false;
        if (!super.equals(o)) return false;

        if (getQtdeDeIngressosInteira() != that.getQtdeDeIngressosInteira()) return false;
        if (qtdeDeIngressosMeia != that.qtdeDeIngressosMeia) return false;
        return Double.compare(that.getValorEntradaInteira(), getValorEntradaInteira()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + getQtdeDeIngressosInteira();
        result = 31 * result + qtdeDeIngressosMeia;
        temp = Double.doubleToLongBits(getValorEntradaInteira());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getQtdeDeIngressosInteira() + " ingressos tarifa inteira e " + getQtdeMeiaEntrada()
                + " ingressos meia entrada para o evento " + getTipoDoEvento() + ".";
    }
}
