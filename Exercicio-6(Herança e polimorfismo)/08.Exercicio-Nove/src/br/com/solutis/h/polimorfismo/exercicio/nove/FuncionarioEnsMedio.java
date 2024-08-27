package br.com.solutis.h.polimorfismo.exercicio.nove;

import br.com.solutis.h.polimorfismo.exercicio.oito.Comissao;

public class FuncionarioEnsMedio extends Funcionario {
    private String escola;

    public FuncionarioEnsMedio(String nome, int codigoFuncional, Comissao comissao, String escola) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    @Override
    public double calcularRenda() {
        return rendaBase * 1.10 * 1.50;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Escola: " + escola);
        System.out.println("Renda Total: R$ " + calcularRenda());
    }
}
