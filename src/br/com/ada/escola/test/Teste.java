package br.com.ada.escola.test;

import br.com.ada.escola.enums.EnumDisciplina;
import br.com.ada.escola.enums.EnumPeriodo;
import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.disciplina.DisciplinaBuilder;
import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.professor.Professor;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.pessoa.endereco.EnderecoBuilder;
import br.com.ada.escola.models.turma.Turma;
import br.com.ada.escola.repository.GerenteBancodeDadosAluno;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;

public class Teste implements Serializable{
    static GerenteBancodeDadosAluno gerenteBancodeDadosAluno = new GerenteBancodeDadosAluno();

    public static void main(String[] args) throws IOException {
        Endereco endereco = new EnderecoBuilder()
                .rua("Rua das Flores")
                .numero("190")
                .bairro("Centro")
                .estado("PR")
                .cidade("Curitiba")
                .cep("12345678")
                .build();

        Professor professor = new Professor("Maria",
                LocalDate.of(1990, 10, 22),
                "09075896378",
                endereco, null, null);


        Disciplina matematica = new DisciplinaBuilder()
                .nomeDisciplina(EnumDisciplina.MATEMATICA)
                .professor(professor)
                .serie(EnumSerie.NONO_ANO_FUNDAMENTAL)
                .dias(null)
                .horario(LocalTime.of(14, 30))
                .build();

        Turma turma1 = new Turma("1C",EnumPeriodo.MATUTINO, matematica, professor);

        gerenteBancodeDadosAluno.cadastraAluno(
                new Aluno("Lucas",
                        LocalDate.of(2008, 9, 16),
                        "09287459632",
                        endereco,
                        "Joana",
                        "André",
                        EnumSerie.PRIMEIRO_ANO_MEDIO,
                        null,
                        turma1)
        );
        gerenteBancodeDadosAluno.retornarAlunos().stream().forEach(System.out::println);

    }
}
