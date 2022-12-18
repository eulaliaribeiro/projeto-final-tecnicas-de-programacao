package br.com.ada.escola.repository;

import br.com.ada.escola.models.pessoa.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class GerenteBancodeDadosAluno {
    public ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    public GerenteDeArquivo gerenteDeArquivo = new GerenteDeArquivo();

    public ArrayList<Aluno> retornarAlunos() {
        carregarDados();
        return listaDeAlunos;
    }

    public void cadastraAluno(Aluno aluno) throws IOException {

        var file = gerenteDeArquivo.getArquivoDeBanco("alunos.txt");

        if (!file.exists()) {
            gerenteDeArquivo.criarArquivoDeBanco("alunos.txt");
        }

        carregarDados();
        listaDeAlunos.add(aluno);

        var fileOutputStream = new FileOutputStream(file);
        var bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        try (var out = new ObjectOutputStream(bufferedOutputStream)) {
            for (Aluno item : listaDeAlunos) {
                System.out.println("cadastrou");
                out.writeObject(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void carregarDados() {
        listaDeAlunos.clear();
        var file = gerenteDeArquivo.getArquivoDeBanco("alunos.txt");
        try (var in = new ObjectInputStream(new BufferedInputStream((new FileInputStream(file))))) {
            while (true) {
                var objeto = in.readObject();
                if (objeto instanceof Aluno a) {
                   listaDeAlunos.add(a);
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}
