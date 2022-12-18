package br.com.ada.escola.models.pessoa;

import br.com.ada.escola.enums.EnumSerie;
import br.com.ada.escola.models.disciplina.Disciplina;
import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.turma.Turma;

import java.time.LocalDate;
import java.util.List;

public class Aluno extends Pessoa {
    private String nomeDaMae;
    private String nomeDoPai;
    private int matricula;
    private EnumSerie serie;
    private List<Disciplina> disciplinas;

    private Turma turma;

    private static int sequenceMatricula = 1;

    public Aluno(String nome,LocalDate dataNascimento, String cpf,Endereco endereco){
        super(nome, dataNascimento, cpf, endereco);;
    }

    public Aluno(String nome, LocalDate dataNascimento, String cpf, Endereco endereco, String nomeDaMae, String nomeDoPai, EnumSerie serie, List<Disciplina> disciplinas, Turma turma) {
        super(nome, dataNascimento, cpf, endereco);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
        this.serie = serie;
        this.disciplinas = disciplinas;
        this.turma = turma;
        setMatricula(sequenceMatricula);
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (getMatricula() == 0) {
            this.matricula = matricula;
            sequenceMatricula++;
        } else {
            System.out.println("Aluno já possui matricula, não é possível alterar");
        }
    }

    public EnumSerie getSerie() {
        return serie;
    }

    public void setSerie(EnumSerie serie) {
        this.serie = serie;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                " matricula=" + matricula +
                ", nome='" + getNome() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", cpf='" + getCpf() + '\'' +
                ", nomeDaMae='" + nomeDaMae + '\'' +
                ", nomeDoPai='" + nomeDoPai + '\'' +
                ", serie=" + serie +
                ", disciplinas=" + disciplinas +
                ", turma=" + turma +
                ", endereco=" + getEndereco() +
                '}';
    }
}
