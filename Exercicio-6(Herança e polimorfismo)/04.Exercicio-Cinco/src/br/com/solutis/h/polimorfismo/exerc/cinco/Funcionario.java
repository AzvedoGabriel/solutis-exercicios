package br.com.solutis.h.polimorfismo.exerc.cinco;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private ACADEMICO academico;

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

    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigoFuncional);
        System.out.println("Academico: " + academico);
    }
}
