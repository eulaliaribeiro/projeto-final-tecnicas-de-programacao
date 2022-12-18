package br.com.ada.escola.businessobject.cadastros;

import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.repository.GerenteBancodeDadosAluno;
import br.com.ada.escola.repository.GerenteDeArquivo;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.Serializable;

public class MatricularAluno implements Serializable {

    static GerenteBancodeDadosAluno gerenteBancodeDadosAluno = new GerenteBancodeDadosAluno();

    public static void matricular(Scanner sc) throws IOException {
        System.out.println("*** Cadastrro De Aluno ***");

        System.out.println("Digite o nome do aluno:");
        String nome = sc.next();

        System.out.println("Digite o cpf do aluno:");
        String cpf = sc.next();

        gerenteBancodeDadosAluno.cadastraAluno(new Aluno(nome,
                LocalDate.of(2008, 9, 16),
                cpf,
                new Endereco()));

    }
}