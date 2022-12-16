package br.com.ada.escola.models.pessoa;

import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.turma.Turma;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Pessoa {
    Disciplina disciplina;
    List<Turma> turmas;

    public Professor(String nome, LocalDate dataNascimento, String cpf, Endereco endereco, Disciplina disciplina, List<Turma> turmas) {
        super(nome, dataNascimento, cpf, endereco);
        this.disciplina = disciplina;
        this.turmas = turmas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
