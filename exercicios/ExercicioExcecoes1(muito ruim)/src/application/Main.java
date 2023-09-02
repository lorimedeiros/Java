// de tão merda, essa solução nem exceção usa

package application;

import model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException { // propagação de exceção

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("Data de entrada (dd/mm/aaaa): ");
        Date entrada = sdf.parse(sc.next());

        System.out.print("Data de saída (dd/mm/aaaa): ");
        Date saida = sdf.parse(sc.next());
        //esse parse rendeu aquela "propagação de exceção", pois ou vc trata ou propaga

        if (entrada.after(saida)){
            System.out.println("Erro em realizar a reserva. Data de saída deve ser depois da entrada.");
        } else {
            Reserva rs = new Reserva(n, entrada, saida);
            System.out.println(rs.toString());

            System.out.println();
            System.out.println("Insira a data de reserva atualizada");

            System.out.print("Data de entrada (dd/mm/aaaa): ");
            entrada = sdf.parse(sc.next());

            System.out.print("Data de saída (dd/mm/aaaa): ");
            saida = sdf.parse(sc.next());

            Date agora = new Date();
            if (entrada.before(agora) || saida.before(agora)){
                System.out.println("Erro em realizar a reserva. Data de entrada e saída devem ser futuras às anteriores.");
            } else if (entrada.after(saida)){
                System.out.println("Erro em realizar a reserva. Data de saída deve ser depois da entrada.");
            } else {

                rs.atualizaDatas(entrada, saida);
                System.out.println(rs.toString());

            }

        }

        sc.close();

    }
}
