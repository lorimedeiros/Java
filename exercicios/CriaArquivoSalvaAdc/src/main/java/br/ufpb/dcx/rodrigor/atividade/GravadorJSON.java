package br.ufpb.dcx.rodrigor.atividade;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class GravadorJSON implements GravadorAluno {

    private static final String JSON_FILE = "alunos.json";

    private ObjectMapper objectMapper;
    private File file;

    public GravadorJSON(String filePath) {
        this.objectMapper = new ObjectMapper();
        this.file = new File(filePath);
    }

    @Override
    public void salvar(Aluno aluno) {
        try (FileWriter writer = new FileWriter(JSON_FILE, true)) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(writer, aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Aluno> recuperarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        try {
            alunos = objectMapper.readValue(file, new TypeReference<List<Aluno>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alunos;
    }

}