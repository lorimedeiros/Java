import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Integer> lista = new ArrayList<>();

        String caminho = "C:\\Users\\Lori\\Desktop\\teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();
            while (linha != null){
                lista.add(Integer.parseInt(linha));
                linha = br.readLine();
            }

            Integer x = Calculador.maximo(lista);
            System.out.println("Maior: " + x);

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}