package br.com.solutis.heranca.exercicio.quatro;

import br.com.solutis.heranca.exercicio.tres.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String telefone, int codigoSetor, double salarioBase,
                         double imposto, double ajudaDeCusto) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }


}
