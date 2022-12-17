package br.com.ada.escola.models.disciplina;

import br.com.ada.escola.enums.EnumDiasDaSemana;
import br.com.ada.escola.enums.EnumDisciplina;
import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.pessoa.professor.Professor;

import java.time.LocalTime;
import java.util.List;

public class DisciplinaBuilder {
    private EnumDisciplina nomeDisciplina;
    private Professor professor;
    private EnumSerie serie;
    private List<EnumDiasDaSemana> dias;
    private LocalTime horario;

    public DisciplinaBuilder nomeDisciplina(EnumDisciplina nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        return this;
    }

    public DisciplinaBuilder professor(Professor professor) {
        this.professor = professor;
        return this;
    }

    public DisciplinaBuilder serie(EnumSerie serie) {
        this.serie = serie;
        return this;
    }

    public DisciplinaBuilder dias(List<EnumDiasDaSemana> dias) {
        this.dias = dias;
        return this;
    }

    public DisciplinaBuilder horario(LocalTime horario) {
        this.horario = horario;
        return this;
    }

    public Disciplina build(){
        Disciplina disciplinaCriada = new Disciplina(nomeDisciplina, professor, serie, dias, horario);
        return disciplinaCriada;
    }


}
