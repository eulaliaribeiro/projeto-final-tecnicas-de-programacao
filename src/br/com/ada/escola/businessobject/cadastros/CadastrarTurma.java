package br.com.ada.escola.businessobject.cadastros;

import br.com.ada.escola.enums.EnumPeriodo;
import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.pessoa.professor.Professor;
import br.com.ada.escola.models.turma.Turma;
import br.com.ada.escola.repository.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class CadastrarTurma {
    static GerenteBancodeDadosTurma gerenteBancodeDadosTurma = new GerenteBancodeDadosTurma();

    public static void cadastrar(Scanner sc) throws IOException  {
        System.out.println("*** Cadastrro De Turma ***");

        System.out.println("Digite o nome da turma:");
        String nome = sc.nextLine();

        System.out.println();
        GerenteBancodeDadosProfessor gerenteBancodeDadosProfessor = new GerenteBancodeDadosProfessor();
        var gerenteStreamProfessor = new GerenteStreamProfessor(gerenteBancodeDadosProfessor);
        gerenteStreamProfessor.mostreOrdenadoPorNome();
        System.out.println("Digite o nome de um professor da lista para ser o responsável pela turma :");
        String nomeProfesor = sc.nextLine();
        Professor professor = gerenteStreamProfessor.filtrarPorNome(nomeProfesor);


        gerenteBancodeDadosTurma.cadastraTurma(new Turma(nome, null, professor));

    }
}
