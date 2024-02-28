import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String local = "C:\\Users\\Lori\\Desktop\\teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(local))){

            List<Produto> lista = new ArrayList<>();

            String linha = br.readLine();
            while (linha != null){
                String[] fields = linha.split(",");
                lista.add(new Produto(fields[0], Double.parseDouble(fields[1])));
                linha = br.readLine();
            } //separa os produtos do arquivo na lista

            double media = lista.stream()
                    .map(p -> p.getPreco())
                    .reduce(0.0, (x,y) -> x + y) / lista.size();
            System.out.println("Preço médio: " + String.format("%.2f", media)); //media dos preços dos produtos

            Comparator<String> comp = (x,y) -> x.toUpperCase().compareTo(y.toUpperCase());
            List<String> abaixoMedia = lista.stream()
                    .filter(p -> p.getPreco() < media) //filtra produtos com preço abaixo da media
                    .map(p -> p.getNome()) //obtem os nomes dos mesmos
                    .sorted(comp.reversed()) //usa o comp como predicado e inverte esse predicado (alfabetica inversa)
                    .collect(Collectors.toList());
            abaixoMedia.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();

        /*
            Tv,900.00
            Mouse,50.00
            Tablet,350.50
            HD Case,80.90
            Computer,850,00
            Monitor,290.00
         */
    }
}