package br.com.ada.escola.repository;

import br.com.ada.escola.models.pessoa.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class GerenteBancodeDadosAluno {
    public ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    public GerenteDeArquivo gerenteDeArquivo = new GerenteDeArquivo();

    public ArrayList<Aluno> retornarAlunos() {
        return listaDeAlunos;
    }

    public void cadastraAluno(Aluno aluno) {
        var file = gerenteDeArquivo.getArquivoDeBanco("alunos.txt");
        listaDeAlunos.add(aluno);
        try (var out = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(file.toPath())))) {
            for (Aluno item : listaDeAlunos) {
                out.writeObject(item);
            }
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
        carregarDados();
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
            System.out.println("Não carregou dados.");
            //tratamento
        }
    }

    public void editarAluno(String idContato, Aluno aluno) {

    }

    public boolean deletarAluno() {
        return false;
    }


}
