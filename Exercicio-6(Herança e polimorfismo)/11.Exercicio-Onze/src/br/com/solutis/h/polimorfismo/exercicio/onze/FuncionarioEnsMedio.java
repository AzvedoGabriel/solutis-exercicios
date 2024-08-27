package br.com.solutis.h.polimorfismo.exercicio.onze;


import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Comissao;

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
    public String toString() {
        return "FuncionarioEnsMedio{" +
                "escola='" + escola + '\'' +
                ", nome='" + nome + '\'' +
                ", codigoFuncional=" + codigoFuncional +
                ", comissao=" + comissao.getNome() +
                ", rendaBase=" + rendaBase +
                '}';
    }
}
