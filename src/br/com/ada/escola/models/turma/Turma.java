package br.com.ada.escola.models.turma;

import br.com.ada.escola.enums.EnumPeriodo;
import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.professor.Professor;
import java.io.Serializable;
import java.util.List;

public class Turma implements Serializable{

    public static final long serialVersionUID = 1L;
    private String nomeTurma;
    private EnumPeriodo periodo;
    private Disciplina disciplina;
    private Professor professor;

    public Turma(String nomeTurma,EnumPeriodo periodo, Disciplina disciplina, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.periodo = periodo;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public EnumPeriodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(EnumPeriodo periodo) {
        this.periodo = periodo;
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
