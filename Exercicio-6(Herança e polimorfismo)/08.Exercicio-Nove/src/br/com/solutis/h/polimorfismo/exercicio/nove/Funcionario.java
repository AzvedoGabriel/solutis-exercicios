package br.com.solutis.h.polimorfismo.exercicio.nove;


import br.com.solutis.h.polimorfismo.exercicio.oito.Comissao;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBase = 1000.00;
    protected Comissao comissao;


    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;

    }

    public Comissao getComissao() {
        return comissao;
    }

    public abstract double calcularRenda();

    public abstract void mostrarDetalhes();
}