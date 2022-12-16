package br.com.ada.escola.models.turma;

import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    List<Aluno> alunos = new ArrayList<>();
    Disciplina disciplina;

    public Turma(List<Aluno> alunos, Disciplina disciplina) {
        this.alunos = alunos;
        this.disciplina = disciplina;
    }
}
