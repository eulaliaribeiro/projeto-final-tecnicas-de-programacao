package br.com.ada.escola.models.pessoa;

import br.com.ada.escola.models.pessoa.endereco.Endereco;

import java.time.LocalDate;

public class Pessoa {
    String nome;
    LocalDate dataNascimento;
    String cpf;
    Endereco endereco;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }

}
