package br.com.ada.escola.businessobject;

import br.com.ada.escola.models.pessoa.Aluno;
import br.com.ada.escola.repository.GerenteBancodeDadosAluno;
import br.com.ada.escola.repository.GerenteBancodeDadosProfessor;
import br.com.ada.escola.repository.GerenteBancodeDadosTurma;
import br.com.ada.escola.repository.GerenteStreamAluno;

import java.util.Comparator;
import java.util.Scanner;

public class GerarRelatorio {

    static GerenteBancodeDadosAluno gerenteBancodeDadosAluno = new GerenteBancodeDadosAluno();
    static GerenteBancodeDadosProfessor gerenteBancodeDadosProfessor = new GerenteBancodeDadosProfessor();
    static GerenteBancodeDadosTurma gerenteBancodeDadosTurma = new GerenteBancodeDadosTurma();


    public static void opcoesRelatorio(Scanner sc) {
        Scanner scOpcao = new Scanner(System.in);
        var gerenteStreamAluno = new GerenteStreamAluno(gerenteBancodeDadosAluno);
        final int OPCAO_SAIR = 5;
        int opcaoMenu = 0;
        do {
            try {
                System.out.println("\n- MENU DE RELATORIOS -\n");
                System.out.println("Escolha: ");
                System.out.println("1 - Pesquisar aluno por nome");
                System.out.println("2 - Pesquisar aluno por matrícula");
                System.out.println("3 - Relatório de todos os alunos matriculados (ordem alabética)");
                System.out.println("4 - Relatório de todos os professores");
                System.out.println("5 - Relatório de todas as turmas");
                System.out.println("6 - Voltar ao menu principal");
                System.out.println("Por favor, informe a opção desejada: ");


                opcaoMenu = sc.nextInt();
                switch (opcaoMenu) {
                    case 1:
                        System.out.println("Digite o nome do aluno que deseja pesquisar:");
                        String nomePesquisa = scOpcao.nextLine();
                        gerenteStreamAluno.pesquisarPorNome(nomePesquisa);
                        break;
                    case 2:
                        System.out.println("Digite a matrícula do aluno que deseja pesquisar:");
                        int matriculaPesquisa = scOpcao.nextInt();
                        gerenteStreamAluno.pesquisarPorMatricula(matriculaPesquisa);
                        break;
                    case 3:
                        gerenteStreamAluno.mostreOrdenadoPorNome();
                        break;
                     case 4:
                        gerenteBancodeDadosProfessor.retornarProfessores().stream().forEach(System.out::println);
                        break;
                    case 5:
                        gerenteBancodeDadosTurma.retornarTurmas().stream().forEach(System.out::println);
                        break;
                    default:
                        if (opcaoMenu != OPCAO_SAIR) {
                            System.out.println("Opção invalida");
                        }
                        opcaoMenu = OPCAO_SAIR;
                }
            } catch (Exception e) {
                System.out.println("Opcao inválida");
                opcaoMenu = OPCAO_SAIR;
            }
        } while (opcaoMenu < OPCAO_SAIR);
        System.out.println("Voltando ao Menu Principal");
    }
}
