package br.com.solutis.h.polimorfismo.exerc.cinco;

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
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Universidade: " + universidadeGraducao);
    }
}
