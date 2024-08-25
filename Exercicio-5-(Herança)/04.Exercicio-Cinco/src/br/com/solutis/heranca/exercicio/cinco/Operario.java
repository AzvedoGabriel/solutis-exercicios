package br.com.solutis.heranca.exercicio.cinco;

import br.com.solutis.heranca.exercicio.tres.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, int codigoSetor, double salarioBase,
                    double imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {

        return super.calcularSalario() + (valorProducao * comissao);
    }
}
