package br.com.ada.escola.models.pessoa;

import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.endereco.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    String nomeDaMae;
    String nomeDoPai;
    String matricula;
    EnumSerie serie;
    List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, LocalDate dataNascimento, String cpf, Endereco endereco, String nomeDaMae, String nomeDoPai, String matricula, EnumSerie serie, List<Disciplina> disciplinas) {
        super(nome, dataNascimento, cpf, endereco);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
        this.matricula = matricula;
        this.serie = serie;
        this.disciplinas = disciplinas;
    }

}
