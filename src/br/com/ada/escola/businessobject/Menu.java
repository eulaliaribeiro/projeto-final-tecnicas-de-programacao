package br.com.ada.escola.businessobject;

import br.com.ada.escola.businessobject.cadastros.CadastrarProfessor;
import br.com.ada.escola.businessobject.cadastros.CadastrarTurma;
import br.com.ada.escola.businessobject.cadastros.MatricularAluno;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void iniciando() {
        System.out.println("\n********** Bem vindo ao sistema da escola Ada! **********");
    }

    public static void principal() {
        final int OPCAO_SAIR = 5;
        int opcaoMenu = 0;
        do {
            try {
                System.out.println("\n- MENU PRINCIPAL -\n");
                System.out.println("Escolha");
                System.out.println("1 - Matricular um aluno");
                System.out.println("2 - Cadastrar um professor");
                System.out.println("3 - Cadastrar uma turma");
                System.out.println("4 - Gerar Relatórios");
                System.out.println("5 - Sair do sistema");
                System.out.println("Por favor, informe a opção desejada:");

                opcaoMenu = sc.nextInt();
                switch (opcaoMenu) {
                    case 1:
                        MatricularAluno.matricular(sc);
                        break;
                    case 2:
                        CadastrarProfessor.cadastrar(sc);
                        break;
                    case 3:
                   //     CadastrarTurma.cadastrar(sc);
                        break;
                    case 4:
                        GerarRelatorio.opcoesRelatorio(sc);
                        break;
                    default:
                        opcaoMenu = OPCAO_SAIR;
                }
            } catch (Exception e) {
                System.out.println("Opcao invalida");
                opcaoMenu = OPCAO_SAIR;
            }
        } while (opcaoMenu < OPCAO_SAIR);
        sc.close();
    }

    public static void finalizar() {
        System.out.println("Encerrando o sistema.");
    }
}
