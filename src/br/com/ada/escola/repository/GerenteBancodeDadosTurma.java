package br.com.ada.escola.repository;

import br.com.ada.escola.models.turma.Turma;

import java.io.*;
import java.util.ArrayList;

public class GerenteBancodeDadosTurma {
    public ArrayList<Turma> listaTurma = new ArrayList<>();
    public GerenteDeArquivo gerenteDeArquivo = new GerenteDeArquivo();

    public ArrayList<Turma> retornarTurmas() {
        carregarDados();
        return listaTurma;
    }

    public void cadastraTurma(Turma turma) throws IOException {

        var file = gerenteDeArquivo.getArquivoDeBanco("turmas.txt");

        if (!file.exists()) {
            gerenteDeArquivo.criarArquivoDeBanco("turmas.txt");
        }

        carregarDados();
        listaTurma.add(turma);

        var fileOutputStream = new FileOutputStream(file);
        var bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        try (var out = new ObjectOutputStream(bufferedOutputStream)) {
            for (Turma item : listaTurma) {
                out.writeObject(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void carregarDados() {
        listaTurma.clear();
        var file = gerenteDeArquivo.getArquivoDeBanco("turmas.txt");
        try (var in = new ObjectInputStream(new BufferedInputStream((new FileInputStream(file))))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof Turma t) {
                    listaTurma.add(t);
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}