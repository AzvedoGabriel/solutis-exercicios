package br.com.solutis.h.polimorfismo.exercicio.onze.comissao;

public class Vendedor extends Comissao {
    @Override
    public double calcularAdicional() {
        return 250.00;
    }

    @Override
    public String getNome() {
        return "Vendedor";
    }
}
