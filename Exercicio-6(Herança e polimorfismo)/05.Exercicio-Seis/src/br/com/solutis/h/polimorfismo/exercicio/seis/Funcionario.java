package br.com.solutis.h.polimorfismo.exercicio.seis;

import br.com.solutis.h.polimorfismo.exerc.cinco.ACADEMICO;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private ACADEMICO academico;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, int codigoFuncional, ACADEMICO academico) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.academico = academico;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public ACADEMICO getAcademico() {
        return academico;
    }

    public double calcularRenda() {
        return rendaBasica;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigoFuncional);
        System.out.println("Academico: " + academico);
        System.out.printf("Renda Total: R$ %.2f\n", calcularRenda());
    }
}
