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

            List<Funcionario> lista = new ArrayList<>();

            String linha = br.readLine();
            while (linha != null){
                String[] fields = linha.split(",");
                lista.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                linha = br.readLine();
            } //separa os funcionarios do arquivo na lista

            System.out.print("Informe valor: ");
            Double valor = Double.parseDouble(sc.nextLine());

            Comparator<String> comp = (x, y) -> x.toUpperCase().compareTo(y.toUpperCase());
            List<String> emails = lista.stream()
                    .filter(f -> f.getSalario() > valor)
                    .map(f -> f.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());
            System.out.println("emails de funcionários com salario maior que " + valor);
            emails.forEach(System.out::println);

            Double soma = lista.stream()
                    .filter(f -> f.getNome().charAt(0) == 'M')
                    .map(f -> f.getSalario())
                    .reduce(0.0, (x,y) -> x + y);
            System.out.println("Soma dos salarios de funcionarios com nome iniciado com M: " + String.format("%.2f", soma));

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();

        /*
            Maria,maria@gmail.com,3200.00
            Alex,alex@gmail.com,1900.00
            Marco,marco@gmail.com,1700.00
            Bob,bob@gmail.com,3500.00
            Anna,anna@gmail.com,2800.00
         */
    }
}