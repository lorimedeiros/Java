//esse é um hard code(codigo que, em resumo, apenas printa sem pedir nada) simples de postagem

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Postagem pt1 = new Postagem(sdf.parse("21/08/2023 13:42:26"), "Viajando para a Nova Zelândia", "Estou indo visitar esse país incrível!", 12);
        Comentario c11 = new Comentario("Tenha uma ótima viajem");
        Comentario c12 = new Comentario("Uau, isso é incrível!");
        pt1.adicionarComentario(c11);
        pt1.adicionarComentario(c12);

        Postagem pt2 = new Postagem(sdf.parse("25/08/2023 23:12:52"), "Boa noite, camaradas", "Vejo vocês amanhã", 5);
        Comentario c21 = new Comentario("Boa noite");
        Comentario c22 = new Comentario("Que a força esteja com você");
        pt2.adicionarComentario(c21);
        pt2.adicionarComentario(c22);

        System.out.println(pt1.toString());
        System.out.println(pt1.mostraComentarios());

        System.out.println(pt2.toString());
        System.out.println(pt2.mostraComentarios());

    }
}
