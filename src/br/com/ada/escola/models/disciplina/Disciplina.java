package br.com.ada.escola.models.disciplina;

import br.com.ada.escola.enums.EnumDiasDaSemana;
import br.com.ada.escola.enums.EnumDisciplina;
import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.pessoa.Professor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    EnumDisciplina nomeDisciplina;
    Professor professor;
    EnumSerie serie;
    List<EnumDiasDaSemana> dias = new ArrayList<>();
    LocalTime horario;

    public Disciplina(EnumDisciplina nomeDisciplina, Professor professor, EnumSerie serie, List<EnumDiasDaSemana> dias, LocalTime horario) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.serie = serie;
        this.dias = dias;
        this.horario = horario;
    }
}
