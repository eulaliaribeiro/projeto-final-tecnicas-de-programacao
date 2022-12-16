package br.com.ada.escola.models.turma;

import br.com.ada.escola.enums.EnumPeriodo;
import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    EnumPeriodo periodo;
    List<Aluno> alunos;
    Disciplina disciplina;
    Professor professor;

    public Turma(EnumPeriodo periodo, List<Aluno> alunos, Disciplina disciplina, Professor professor) {
        this.periodo = periodo;
        this.alunos = alunos;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public EnumPeriodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(EnumPeriodo periodo) {
        this.periodo = periodo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
