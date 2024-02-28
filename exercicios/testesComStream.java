import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = lista.stream();
        Stream<Integer> st2 = lista.stream().map(x -> x * 10);
        Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
        Stream<Integer> st4 = Stream.iterate(0, x-> x + 2); //pelo amor de deus, não imprimir assim, pois essa porra é infinita e explode meu PC
        Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]); //sim, vadia. é um fibonacci

        System.out.println("st1: " + Arrays.toString(st1.toArray()));
        System.out.println("st2: " + Arrays.toString(st2.toArray()));
        System.out.println("st3: " + Arrays.toString(st3.toArray()));
        System.out.println("st4: " + Arrays.toString(st4.limit(10).toArray())); //vai gerar 10 elementos a partir de 0 e seguindo as instruções da função
        System.out.println("st5: " + Arrays.toString(st5.limit(10).toArray())); //vai gerar 10 elementos pro pc não explodir

    }
}
