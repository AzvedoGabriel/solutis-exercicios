package br.com.solutis.h.polimorfismo.exercicio.seis;

import br.com.solutis.h.polimorfismo.exerc.cinco.ACADEMICO;

public class FuncionarioEnsSuperior extends Funcionario {
    private String universidadeGraducao;

    public FuncionarioEnsSuperior(String nome, int codigoFuncional,String universidadeGraducao) {
        super(nome, codigoFuncional, ACADEMICO.NIVEL_SUPERIOR);
        this.universidadeGraducao = universidadeGraducao;
    }

    public String getUniversidadeGraducao() {
        return universidadeGraducao;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1; // Renda anterior + 100%
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Universidade: " + universidadeGraducao);
        System.out.println("Renda a mais : " + calcularRenda());
    }
}
