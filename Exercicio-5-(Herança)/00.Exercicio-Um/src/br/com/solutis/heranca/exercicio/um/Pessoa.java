package br.com.solutis.heranca.exercicio.um;

public class Pessoa {

    /**
     * Exercício 01 -
     * Cria uma Classe Pessoa, contendo os atributos
     * encapsulados, com seus respectivos seletores (getters) e
     * modificadores (setters), e ainda o construtor padrão e pelo
     * menos mais duas opções de construtores conforme sua
     * percepção. Atributos: String nome; String endereço; String telefone;
    */

    protected String nome;
    protected String endereco;
    protected String telefone;


    public Pessoa() {
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}