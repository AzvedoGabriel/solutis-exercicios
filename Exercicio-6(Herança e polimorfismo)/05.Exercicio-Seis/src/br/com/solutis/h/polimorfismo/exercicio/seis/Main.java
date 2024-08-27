package br.com.solutis.h.polimorfismo.exercicio.seis;

import br.com.solutis.h.polimorfismo.exerc.cinco.ACADEMICO;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("João", 101, ACADEMICO.SEM_ESCOLARIDADE);
        Funcionario func2 = new FuncionarioEnsBasico("Maria", 102, "Escola Primária ABC");
        Funcionario func3 = new FuncionarioEnsMedio("Carlos", 103,  "Escola Secundária XYZ");
        Funcionario func4 = new FuncionarioEnsSuperior("Ana", 104, "Universidade Federal");

        // Mostrando detalhes dos funcionários
        func1.mostrarDetalhes();
        System.out.println();
        func2.mostrarDetalhes();
        System.out.println();
        func3.mostrarDetalhes();
        System.out.println();
        func4.mostrarDetalhes();
    }
}

