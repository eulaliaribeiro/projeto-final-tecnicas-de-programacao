package br.com.ada.escola.models.pessoa;

import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.endereco.Endereco;

import java.time.LocalDate;

public class Professor extends Pessoa {
    Disciplina disciplina;

    public Professor(String nome, LocalDate dataNascimento, String cpf, Endereco endereco, Disciplina disciplina) {
        super(nome, dataNascimento, cpf, endereco);
        this.disciplina = disciplina;
    }
}
