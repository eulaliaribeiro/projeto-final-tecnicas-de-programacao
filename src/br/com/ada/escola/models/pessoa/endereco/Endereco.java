package br.com.ada.escola.models.pessoa.endereco;

import java.io.Serializable;

public class Endereco implements Serializable{
    public static final long serialVersionUID = 1L;
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(){

    }


    public Endereco(String rua, String numero, String cep, String bairro, String cidade, String uf) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + uf + '\'' +
                '}';
    }
}
