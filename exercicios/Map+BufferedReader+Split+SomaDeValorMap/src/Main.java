import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\Lori\\Desktop\\teste.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Map <String, Integer> votes = new HashMap<>();

            String line = br.readLine();
            while(line != null){

                String[] fields = line.split(", ");
                String name = fields[0];
                Integer sessionVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    Integer votes0 = votes.get(name);
                    votes.put(name, votes0 + sessionVotes);
                } else {
                    votes.put(name, sessionVotes);
                }

                line = br.readLine();

            }

            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

    }
}