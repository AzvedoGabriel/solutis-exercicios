package br.com.solutis.h.polimorfismo.exercicio.onze.comissao;

public class Gerente extends Comissao {
    @Override
    public double calcularAdicional() {
        return 1500.00;
    }

    @Override
    public String getNome() {
        return "Gerente";
    }
}
