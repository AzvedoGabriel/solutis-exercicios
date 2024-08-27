package br.com.solutis.h.polimorfismo.exercicio.seis;

import br.com.solutis.h.polimorfismo.exerc.cinco.ACADEMICO;

public class FuncionarioEnsBasico extends Funcionario {
    private String escolaridadeBasico;

    public FuncionarioEnsBasico(String nome, int codigoFuncional,String escolaridadeBasico) {
        super(nome, codigoFuncional, ACADEMICO.NIVEL_BASICO);
        this.escolaridadeBasico = escolaridadeBasico;
    }

    @Override
    public double calcularRenda() {
        return rendaBasica * 0.10; // Renda básica + 10%
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Escola de Ensino Básico: " + escolaridadeBasico);
        System.out.println("Renda a mais : " + calcularRenda());
    }
}
