package br.com.ada.escola.models.turma;

import br.com.ada.escola.enums.EnumPeriodo;
import br.com.ada.escola.models.pessoa.professor.Professor;
import java.io.Serializable;
import java.util.List;

public class Turma implements Serializable{

    public static final long serialVersionUID = 1L;
    private String nomeTurma;
    private EnumPeriodo periodo;
    private Professor professor;


    public Turma(String nomeTurma,EnumPeriodo periodo, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.periodo = periodo;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeTurma='" + nomeTurma + '\'' +
                ", periodo=" + periodo +
                ", professor=" + professor +
                '}';
    }
}
