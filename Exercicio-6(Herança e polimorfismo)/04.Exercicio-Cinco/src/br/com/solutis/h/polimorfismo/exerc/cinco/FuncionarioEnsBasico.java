package br.com.solutis.h.polimorfismo.exerc.cinco;

public class FuncionarioEnsBasico extends Funcionario {
    private String escolaridadeBasico;

    public FuncionarioEnsBasico(String nome, int codigoFuncional,String escolaridadeBasico) {
        super(nome, codigoFuncional, ACADEMICO.NIVEL_BASICO);
        this.escolaridadeBasico = escolaridadeBasico;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Escola de Ensino Básico: " + escolaridadeBasico);
    }
}
