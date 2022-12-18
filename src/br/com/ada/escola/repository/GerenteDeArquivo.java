package br.com.ada.escola.repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenteDeArquivo {

    private String caminhoDoArquivo = "src/resources/files/";
    //private String caminhoDoArquivo = "C:/Users/HP/IdeaProjects/projeto-final-tecnicas-de-programacao/src/resources/files/";

    public void criarArquivoDeBanco(String nomeDoArquivo) {
        Path path = Paths.get(caminhoDoArquivo + nomeDoArquivo);
        File novoArquivo = path.toFile();
        System.out.println(novoArquivo);

        try {
            if (novoArquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso");
            } else {
                System.out.println("Arquivo não criado");
            }
        } catch (IOException e) {
            System.out.println("Erro");
            throw new RuntimeException(e);
        }
    }

    public void apagarArquivoDeBanco(String nomeDoArquivo) {
        Path path = Path.of(caminhoDoArquivo + nomeDoArquivo);
        File arquivo = path.toFile();
        if (arquivo.delete()) {
            System.out.println("Arquivo deletado com sucesso");
        } else {
            System.out.println("Arquivo não deletado");
        }
    }

    public File getArquivoDeBanco(String nomeDoArquivo) {
        Path path = Path.of(caminhoDoArquivo + nomeDoArquivo);
        File arquivo = path.toFile();
        return arquivo;
    }
}
