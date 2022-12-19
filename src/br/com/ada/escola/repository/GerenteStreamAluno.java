package br.com.ada.escola.repository;

import br.com.ada.escola.models.pessoa.Aluno;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GerenteStreamAluno {
    private GerenteBancodeDadosAluno gerenteBancodeDados;

    public GerenteStreamAluno(GerenteBancodeDadosAluno gerenteBancodeDadosAluno){
        this.gerenteBancodeDados = gerenteBancodeDadosAluno;
    }


    public void mostreOrdenadoPorNome() {
        System.out.println("----------- Ordenado por nome ----------");
        gerenteBancodeDados.retornarAlunos().stream().
                sorted(Comparator.comparing(Aluno::getNome))
                        .forEach(System.out::println);
        System.out.println("---------------------");
    }

    public void pesquisarPorTurma(String turma){
        gerenteBancodeDados.retornarAlunos().stream().
                filter(t -> t.getTurma().getNomeTurma().contentEquals(turma))
                .forEach(System.out::println);
    }
    public void pesquisarPorNome(String nome){
        gerenteBancodeDados.retornarAlunos().stream().
                filter(aluno -> aluno.getNome().toUpperCase().equals(nome.toUpperCase()))
                .forEach(System.out::println);
    }

    public void pesquisarPorMatricula(int matricula){
        gerenteBancodeDados.retornarAlunos().stream().
                filter(aluno -> {
                    boolean isMatricula = aluno.getMatricula() == matricula;
                    return isMatricula;
                })
                .forEach(System.out::println);
    }


}
