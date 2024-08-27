package br.com.solutis.h.polimorfismo.exerc.cinco;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBase = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public abstract void mostrarDetalhes();
}

