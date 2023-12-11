import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //C:\Users\Lori\Desktop\teste.txt

        System.out.println("Enter file path: ");
        //String path = sc.nextLine();  -> Isso se eu quiser que o usuário informe o local do arquivo
        String path = "C:\\Users\\Lori\\Desktop\\teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<User> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(" ");
                String name = fields[0];
                Date entryMoment = Date.from(Instant.parse(fields[1])); //essa chuva de funções pra tranformar aquela Str em Date

                set.add(new User(name, entryMoment)); //essa belezura não permite repetições, ou seja, se quero contar os repetidos apenas 1x o HashSet é a melhor opção

                line = br.readLine();

            }

            System.out.println("Total users: " + set.size());

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

        /*
        É isso o que tem no meu arquivo de texto:
        lol 2022-08-26T20:45:08Z
        lol 2022-08-26T20:45:08Z
        yuyu 2023-08-21T20:45:08Z
        YUYU 2021-08-21T20:45:08Z
        lol 2023-08-26T20:45:08Z

        OBS: resutado dá 4
        resultado dos testes: só contabiliza como sendo repetição se os 2 atributos forem iguais (no caso dos 2 primeiros), isso não me impede de fazer com que o critério comparativo seja apenas o nome
                              nomes só são iguais se todos os caracteres forem iguais (yuyu != YUYU)
         */

    }
}