package br.ufpb.dcx.rodrigor.atividade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravadorCSV implements GravadorAluno{

    private static final String CSV_FILE = "alunos.csv";

    @Override
    public void salvar(Aluno aluno) {
        try (FileWriter writer = new FileWriter(CSV_FILE, true)) {
            String linha = aluno.getNome() + "," + aluno.getMatricula() + "\n";
            writer.write(linha);
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
