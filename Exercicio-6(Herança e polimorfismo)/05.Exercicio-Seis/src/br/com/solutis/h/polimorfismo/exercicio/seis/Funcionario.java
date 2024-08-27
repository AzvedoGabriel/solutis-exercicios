package br.com.solutis.h.polimorfismo.exercicio.seis;

import br.com.solutis.h.polimorfismo.exerc.cinco.ACADEMICO;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBase = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public abstract double calcularRenda();
    public abstract void mostrarDetalhes();
}

