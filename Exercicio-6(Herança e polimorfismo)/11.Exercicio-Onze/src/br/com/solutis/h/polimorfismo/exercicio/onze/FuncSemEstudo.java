package br.com.solutis.h.polimorfismo.exercicio.onze;

public class FuncSemEstudo extends Funcionario {
    public FuncSemEstudo(String nome, int codigoFuncional) {
        super(codigoFuncional, nome);
    }

    @Override
    public double calcularRenda() {
        return rendaBase;
    }

    @Override
    public String toString() {
        return "FuncSemEstudo{" +
                "nome='" + nome + '\'' +
                ", codigoFuncional=" + codigoFuncional +
                ", comissao=" + comissao +
                ", rendaBase=" + rendaBase +
                '}';
    }
}

