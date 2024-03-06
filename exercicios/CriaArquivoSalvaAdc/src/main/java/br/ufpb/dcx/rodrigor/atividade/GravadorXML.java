package br.ufpb.dcx.rodrigor.atividade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GravadorXML implements GravadorAluno {

    private static final String XML_FILE = "alunos.xml";

    @Override
    public void salvar(Aluno aluno) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(XML_FILE, true))) {
            String xmlString = "<aluno><nome>" + aluno.getNome() +  "</idade><matricula>" + aluno.getMatricula() + "</matricula></aluno>\n";
            writer.write(xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Aluno> recuperarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("alunos.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                alunos.add(new Aluno(fields[0], fields[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alunos;
    }
}
