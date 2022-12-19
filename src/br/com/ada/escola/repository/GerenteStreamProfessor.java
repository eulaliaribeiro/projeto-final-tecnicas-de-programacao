package br.com.ada.escola.repository;

import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.models.pessoa.professor.Professor;

import java.util.Comparator;
import java.util.stream.Stream;

public class GerenteStreamProfessor {
    private GerenteBancodeDadosProfessor gerenteBancodeDados;

    public GerenteStreamProfessor(GerenteBancodeDadosProfessor gerenteBancodeDadosProfessor){
        this.gerenteBancodeDados = gerenteBancodeDadosProfessor;
    }


    public void mostreOrdenadoPorNome() {
        System.out.println("----------- Ordenado por nome ----------");
        gerenteBancodeDados.retornarProfessores().stream().
                sorted(Comparator.comparing(Professor::getNome))
                .forEach(System.out::println);
    }

    public Professor filtrarPorNome(String nome) {
        Professor value =
                gerenteBancodeDados.retornarProfessores().stream()
                .filter(item -> item.getNome().toUpperCase().equals(nome))
                .findAny()
                .orElse(null);
        return value;
    }
    public void pesquisarPorNome(String nome){
        gerenteBancodeDados.retornarProfessores().stream().
                filter(item -> item.getNome().toUpperCase().equals(nome.toUpperCase()))
                .forEach(System.out::println);
    }

}