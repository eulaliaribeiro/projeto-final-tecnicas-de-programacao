package br.com.ada.escola.businessobject.cadastros;

import br.com.ada.escola.models.pessoa.endereco.Endereco;
import br.com.ada.escola.models.pessoa.endereco.EnderecoBuilder;

import java.util.Scanner;

public class CadastroEndereco {
    public static Endereco cadastra(Scanner sc) {

        System.out.println("Digite a rua:");
        String rua = sc.nextLine();

        System.out.println("Digite o numero da casa:");
        String numero = sc.nextLine();

        System.out.println("Digite o CEP:");
        String cep = sc.nextLine();

        System.out.println("Digite o bairro:");
        String bairro = sc.nextLine();

        System.out.println("Digite a cidade:");
        String cidade = sc.nextLine();

        System.out.println("Digite a UF:");
        String uf = sc.nextLine();


        Endereco endereco = new EnderecoBuilder()
                .bairro(bairro)
                .estado(uf)
                .rua(rua)
                .cep(cep)
                .numero(numero)
                .cidade(cidade)
                .build();

        return endereco;
    }
}
