public class Conversor {

    public static double IOF = 0.06;

    public static double valorDaCompra (double precoDolar, double comprados) {
        double valorBruto = precoDolar * comprados;
        double valorBRL = valorBruto + (valorBruto * IOF);
        return valorBRL;
    }

}
