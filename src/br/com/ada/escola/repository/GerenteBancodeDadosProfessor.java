package br.com.ada.escola.repository;

import br.com.ada.escola.models.pessoa.professor.Professor;

import java.io.*;
import java.util.ArrayList;

public class GerenteBancodeDadosProfessor {
    public ArrayList<Professor> listaProfessor = new ArrayList<>();

    public GerenteDeArquivo gerenteDeArquivo = new GerenteDeArquivo();

    public ArrayList<Professor> retornarProfessores() {
        carregarDados();
        return listaProfessor;
    }

    public void cadastraProfessor(Professor professor) throws IOException {

        var file = gerenteDeArquivo.getArquivoDeBanco("professores.txt");

        if (!file.exists()) {
            gerenteDeArquivo.criarArquivoDeBanco("professores.txt");
        }

        carregarDados();
        listaProfessor.add(professor);

        var fileOutputStream = new FileOutputStream(file);
        var bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        try (var out = new ObjectOutputStream(bufferedOutputStream)) {
            for (Professor item : listaProfessor) {
                out.writeObject(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void carregarDados() {
        listaProfessor.clear();
        var file = gerenteDeArquivo.getArquivoDeBanco("professores.txt");
        try (var in = new ObjectInputStream(new BufferedInputStream((new FileInputStream(file))))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof Professor t) {
                    listaProfessor.add(t);
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}