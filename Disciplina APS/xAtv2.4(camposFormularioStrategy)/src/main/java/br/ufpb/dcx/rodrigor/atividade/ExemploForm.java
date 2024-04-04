package br.ufpb.dcx.rodrigor.atividade;

import java.util.Scanner;

public class ExemploForm {


    public static void main(String[] args) {
        Formulario form = new Formulario();

        try {
            form.addCampo(new Campo("nome","Digite seu nome:", new ValidadorTexto(2,300)));
            form.addCampo(new Campo("idade","Digite sua idade:", new ValidadorNumerico(0,100)));
        } catch (CampoInvalidoException e) {
            System.out.println("erro:"+e.getMessage());
        }

        Scanner entrada = new Scanner(System.in);

        RespostasForm resposta = new RespostasForm(form);
        for(Campo c: form.getCampos()){
            System.out.println(c.getLabel());
            String valor = entrada.nextLine();
            resposta.setResposta(c,valor);
        }




    }
}
