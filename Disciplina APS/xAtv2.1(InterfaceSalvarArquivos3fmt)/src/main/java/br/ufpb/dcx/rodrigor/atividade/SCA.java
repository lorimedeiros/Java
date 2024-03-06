package br.ufpb.dcx.rodrigor.atividade;

import java.util.Scanner;

public class SCA {

    private GravadorAluno gravador;

    public static void main(String[] argsadd){
        System.out.println("Alo Mundo");
    }

    public void setGravador(GravadorAluno gravador){
        this.gravador = gravador;
    }

    public Aluno lerEntradaUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Informe o curso do aluno:");
        String curso = scanner.nextLine();

        return new Aluno(nome, curso);
    }
}
