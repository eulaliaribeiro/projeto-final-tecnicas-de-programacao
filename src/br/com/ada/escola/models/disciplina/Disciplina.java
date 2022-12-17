package br.com.ada.escola.models.disciplina;

import br.com.ada.escola.enums.EnumDiasDaSemana;
import br.com.ada.escola.enums.EnumDisciplina;
import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.pessoa.professor.Professor;

import java.time.LocalTime;
import java.util.List;

public class Disciplina {
    private EnumDisciplina nomeDisciplina;
    private Professor professor;
    private  EnumSerie serie;
    private List<EnumDiasDaSemana> dias;
    private LocalTime horario;

    public Disciplina(EnumDisciplina nomeDisciplina, Professor professor, EnumSerie serie, List<EnumDiasDaSemana> dias, LocalTime horario) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.serie = serie;
        this.dias = dias;
        this.horario = horario;
    }

    public EnumDisciplina getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(EnumDisciplina nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public EnumSerie getSerie() {
        return serie;
    }

    public void setSerie(EnumSerie serie) {
        this.serie = serie;
    }

    public List<EnumDiasDaSemana> getDias() {
        return dias;
    }

    public void setDias(List<EnumDiasDaSemana> dias) {
        this.dias = dias;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina=" + nomeDisciplina +
                ", professor=" + professor +
                ", serie=" + serie +
                ", dias=" + dias +
                ", horario=" + horario +
                '}';
    }
}
