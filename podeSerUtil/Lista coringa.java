import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<?> lista = Arrays.asList("dddd", 3, 5.4, true);
        List<String> str = Arrays.asList("luiz", "jao", "eric");
        List<Integer> i = Arrays.asList(3,5,8);

        System.out.println(lista);
        System.out.println(str);
        System.out.println(i);
    }
}
