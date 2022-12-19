package br.com.ada.escola.businessobject.cadastros;

import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.pessoa.professor.Professor;
import br.com.ada.escola.repository.GerenteBancodeDadosAluno;
import br.com.ada.escola.repository.GerenteBancodeDadosProfessor;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class CadastrarProfessor {
    static GerenteBancodeDadosProfessor gerenteBancodeDadosProfessor = new GerenteBancodeDadosProfessor();

    public static void cadastrar(Scanner sc) throws IOException {
        {
            System.out.println("*** Cadastrro De Professor ***");

            System.out.println("Digite o nome do professor:");
            String nome = sc.next();

            System.out.println("Digite o cpf do professor:");
            String cpf = sc.next();

            sc.nextLine();

            System.out.println("\n- Agora vamos cadastrar o endereço do professor");
            Endereco endereco = CadastroEndereco.cadastra(sc);

            gerenteBancodeDadosProfessor.cadastraProfessor(new Professor(nome,
                    LocalDate.of(1996, 10, 28),
                    cpf,
                    endereco));

            System.out.println("Professor cadastrado com sucesso!\n");

        }

    }
}
