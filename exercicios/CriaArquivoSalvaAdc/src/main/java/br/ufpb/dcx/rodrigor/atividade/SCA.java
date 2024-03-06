package br.ufpb.dcx.rodrigor.atividade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SCA {

    /*
    OBS: esta criando arquivo na area de trabalho do pc com esse método: criarArquivoCSV()
         mas esse aqui: gravador.salvar(lerEntradaUsuario()), só está criando o arquivo
         nos arquivos da propria IDE, ao invés do que está na area de trabalho
     */

    static GravadorAluno gravador;
    public static void main(String[] argsadd){


        setGravador(new GravadorCSV());
        criarArquivoCSV();
        gravador.salvar(lerEntradaUsuario());
        gravador.salvar(lerEntradaUsuario());
        gravador.recuperarAlunos();

    }

    public static void setGravador(GravadorAluno gravadorNovo){
        gravador = gravadorNovo;
    }

    public static Aluno lerEntradaUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Informe a matricula do aluno:");
        String mat = scanner.nextLine();

        return new Aluno(nome, mat);
    }

    public static void criarArquivoCSV(){
        String caminhoAreaTrabalho = System.getProperty("user.home") + "/Desktop/";
        String nomeArquivo = "alunos.csv";
        String caminhoCompleto = caminhoAreaTrabalho + nomeArquivo;

        String[] dados = {"Nome,Matricula"};

        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoCompleto))) {
            for (String linha : dados) {
                writer.println(linha);
            }
            System.out.println("Arquivo CSV criado com sucesso em: " + caminhoCompleto);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo CSV: " + e.getMessage());
        }
    }

    public static void criarArquivoXML(){
        String caminhoAreaTrabalho = System.getProperty("user.home") + "/Desktop/";
        String nomeArquivo = "alunos.xml";
        String caminhoCompleto = caminhoAreaTrabalho + nomeArquivo;

        String conteudoXML = "<alunos>\n" +
                "    <aluno>\n" +
                "        <nome>Nome</nome>\n" +
                "        <curso>Matricula</curso>\n" +
                "    </aluno>\n" +
                "</alunos>";

        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoCompleto))) {
            writer.println(conteudoXML);
            System.out.println("Arquivo XML criado com sucesso em: " + caminhoCompleto);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo XML: " + e.getMessage());
        }
    }

    public static void criarArquivoJSON(){
        String caminhoAreaTrabalho = System.getProperty("user.home") + "/Desktop/";
        String nomeArquivo = "arquivo.json";
        String caminhoCompleto = caminhoAreaTrabalho + nomeArquivo;

        String conteudoJSON = "[\n" +
                "    {\n" +
                "        \"nome\": \"Nome\",\n" +
                "        \"matricula\": \"Matricula\"\n" +
                "    },\n" +
                "]";

        try (PrintWriter writer = new PrintWriter(new FileWriter(caminhoCompleto))) {
            writer.println(conteudoJSON);
            System.out.println("Arquivo JSON criado com sucesso em: " + caminhoCompleto);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo JSON: " + e.getMessage());
        }

    }

}
