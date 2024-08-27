package br.com.solutis.h.polimorfismo.exercicio.seis;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBase = 3000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularRenda();
    public abstract void mostrarDetalhes();
}

