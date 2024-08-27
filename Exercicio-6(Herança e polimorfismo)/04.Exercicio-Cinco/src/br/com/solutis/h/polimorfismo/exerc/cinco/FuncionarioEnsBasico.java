package br.com.solutis.h.polimorfismo.exerc.cinco;

public class FuncionarioEnsBasico extends Funcionario {
    private String escolaridadeBasico;

    public FuncionarioEnsBasico(String nome, int codigoFuncional,String escolaridadeBasico) {
        super(nome, codigoFuncional);
        this.escolaridadeBasico = escolaridadeBasico;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Escola de Ensino Básico: " + escolaridadeBasico);
    }
}
