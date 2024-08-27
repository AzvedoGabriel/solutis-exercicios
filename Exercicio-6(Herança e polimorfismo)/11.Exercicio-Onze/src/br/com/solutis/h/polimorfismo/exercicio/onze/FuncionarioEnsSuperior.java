package br.com.solutis.h.polimorfismo.exercicio.onze;

import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Comissao;

public class FuncionarioEnsSuperior extends Funcionario {
    private String universidade;

    public FuncionarioEnsSuperior(String nome, int codigoFuncional, Comissao comissao, String universidade) {
        super(nome, codigoFuncional, comissao);
        this.universidade = universidade;
    }


    @Override
    public double calcularRenda() {
        return rendaBase * 1.10 * 1.50 * 2.00;
    }


}
