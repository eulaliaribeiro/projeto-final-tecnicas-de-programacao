package br.com.ada.escola.models.turma;

import br.com.ada.escola.enums.EnumPeriodo;
import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.professor.Professor;
import java.io.Serializable;
import java.util.List;

public class Turma implements Serializable{

    public static final long serialVersionUID = 1L;
    private EnumPeriodo periodo;
    private Disciplina disciplina;
    private Professor professor;

    public Turma(EnumPeriodo periodo, Disciplina disciplina, Professor professor) {
        this.periodo = periodo;
        this.disciplina = disciplina;
        this.professor = professor;
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
