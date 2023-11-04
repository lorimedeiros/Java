import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Produto> lista = new ArrayList<>();

        String caminho = "C:\\Users\\Lori\\Desktop\\teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();
            while (linha != null){
                String[] campo = linha.split(","); //vai separar/dividir com base na virgula
                lista.add(new Produto(campo[0], Double.parseDouble(campo[1])));
                linha = br.readLine();
            }

            Produto x = Calculador.maximo(lista);
            System.out.println("Maior:\n" + x);

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}