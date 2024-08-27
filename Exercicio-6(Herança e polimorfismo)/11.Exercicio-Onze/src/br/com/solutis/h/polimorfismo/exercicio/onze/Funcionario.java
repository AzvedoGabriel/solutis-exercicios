package br.com.solutis.h.polimorfismo.exercicio.onze;


import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Comissao;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected Comissao comissao;
    protected double rendaBase = 2000.00;

    public Funcionario(int codigoFuncional, String nome) {
        this.codigoFuncional = codigoFuncional;
        this.nome = nome;
    }

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public abstract double calcularRenda();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: R$ " + comissao.calcularAdicional() + ", Salário Total: R$ " + calcularRenda();
    }

    public Comissao getComissao() {
        return comissao;
    }
}

