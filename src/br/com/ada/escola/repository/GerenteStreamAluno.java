package br.com.ada.escola.repository;

import br.com.ada.escola.models.pessoa.Aluno;

import java.util.Comparator;

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

}
