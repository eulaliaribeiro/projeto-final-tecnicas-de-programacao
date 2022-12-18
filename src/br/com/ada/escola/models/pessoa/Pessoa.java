package br.com.ada.escola.models.pessoa;

import br.com.ada.escola.models.pessoa.endereco.Endereco;

import java.time.LocalDate;
import java.io.Serializable;

public class Pessoa implements Serializable {

    public static final long serialVersionUID = 1L;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
