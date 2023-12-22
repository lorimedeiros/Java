import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class NumerosNaoRepetidos {

    private List<Integer> numerosGerados = new ArrayList<>();
    private Random random = new Random();

    public int gerarNumeroNaoRepetido(int min, int max) {
        int numero;

        do {
            numero = random.nextInt(max - min + 1) + min;
        } while (numerosGerados.contains(numero));

        numerosGerados.add(numero);

        // Se todos os números possíveis já foram gerados, você pode reiniciar a lista de números gerados aqui.
        // Por exemplo, você pode adicionar a seguinte verificação:
        if (numerosGerados.size() == (max - min + 1)) {
            numerosGerados.clear();
        }

        return numero;
    }

    public static void main(String[] args) {
        NumerosNaoRepetidos gerador = new NumerosNaoRepetidos();

        // Gere 10 números não repetidos no intervalo de 1 a 100.
        for (int i = 0; i < 10; i++) {
            int numero = gerador.gerarNumeroNaoRepetido(1, 100);
            System.out.println("Número gerado: " + numero);
        }
    }
}
