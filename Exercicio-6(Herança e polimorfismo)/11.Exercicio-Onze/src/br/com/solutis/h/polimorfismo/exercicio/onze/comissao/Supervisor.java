package br.com.solutis.h.polimorfismo.exercicio.onze.comissao;


public class Supervisor extends Comissao {
    @Override
    public double calcularAdicional() {
        return 600.00;
    }

    @Override
    public String getNome() {
        return "Supervisor";
    }
}
