import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList <Produto> pdts = new ArrayList<>();

        System.out.print("Insira quantos produtos deseja cadastrar: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("Informações do produto " + (i + 1));
            System.out.print("Comum, importado ou usado (c/i/u)? ");
            char c = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nm = sc.nextLine();
            System.out.print("Preço: ");
            double pc = Double.parseDouble(sc.nextLine());

            if (c == 'c'){

                Produto pdt = new Produto(nm, pc);
                pdts.add(pdt);

            } else if (c == 'i'){

                System.out.print("Taxa de importação: ");
                double ti = Double.parseDouble(sc.nextLine());

                ProdutoImportado pdt = new ProdutoImportado(nm, pc, ti);
                pdts.add(pdt);

            } else if (c == 'u'){

                System.out.print("Data de fabricação: ");
                System.out.printf("Data (DD/MM/AAAA): ");
                Date date = sdf1.parse(sc.next());

                ProdutoUsado pdt = new ProdutoUsado(nm, pc, date);
                pdts.add(pdt);

            }

        }

        String s = "";
        for (Produto p : pdts) {

            s += p.toString() + "\n\n";

        }

        System.out.println("Etiquetas:");
        System.out.println(s);

        sc.close();

    }
}