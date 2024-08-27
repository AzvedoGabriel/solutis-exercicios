package br.com.solutis.h.polimorfismo.exercicio.onze;

import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Comissao;

public class FuncionarioEnsBasico extends Funcionario {
   private String escola;

    public FuncionarioEnsBasico(String nome, int codigoFuncional, Comissao comissao, String escola) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    @Override
    public double calcularRenda() {
        return rendaBase * 1.10;
    }

    @Override
    public String toString() {
        return "FuncionarioEnsBasico{" +
                "escola='" + escola + '\'' +
                ", nome='" + nome + '\'' +
                ", codigoFuncional=" + codigoFuncional +
                ", comissao=" + comissao +
                ", rendaBase=" + rendaBase +
                '}';
    }
}
