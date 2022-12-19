package br.com.ada.escola.models.pessoa.professor;

import br.com.ada.escola.models.pessoa.Pessoa;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.turma.Turma;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Pessoa {

    public Professor(String nome, LocalDate dataNascimento, String cpf, Endereco endereco) {
        super(nome, dataNascimento, cpf, endereco);
    }

    @Override
    public String toString() {
        return "Professor{" +
                " nome='" + getNome() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", cpf='" + getCpf() + '\'' +
                ", endereco=" + getEndereco() +
                '}';
    }
}
