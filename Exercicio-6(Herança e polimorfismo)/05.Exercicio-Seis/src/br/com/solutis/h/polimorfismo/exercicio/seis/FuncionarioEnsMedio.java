package br.com.solutis.h.polimorfismo.exercicio.seis;

import br.com.solutis.h.polimorfismo.exerc.cinco.ACADEMICO;

public class FuncionarioEnsMedio extends Funcionario {
    private String escolaMedio;


    public FuncionarioEnsMedio(String nome, int codigoFuncional, String escolaMedio) {
        super(nome, codigoFuncional, ACADEMICO.NIVEL_MEDIO);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 0.50; // Renda anterior + 50%
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Escola de Ensino Médio: " + escolaMedio);
        System.out.println("Renda a mais : " + calcularRenda());
    }
}
