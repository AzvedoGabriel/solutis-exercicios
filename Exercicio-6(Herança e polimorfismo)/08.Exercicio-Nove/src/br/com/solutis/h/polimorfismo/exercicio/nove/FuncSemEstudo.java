package br.com.solutis.h.polimorfismo.exercicio.nove;

import br.com.solutis.h.polimorfismo.exercicio.oito.Comissao;

public class FuncSemEstudo extends Funcionario {
    public FuncSemEstudo(String nome, int codigoFuncional, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }

    @Override
    public double calcularRenda() {
        return rendaBase;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Renda Total: R$ " + calcularRenda());
    }
}

