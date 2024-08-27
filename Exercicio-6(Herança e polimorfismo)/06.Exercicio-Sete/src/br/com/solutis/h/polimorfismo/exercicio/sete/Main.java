package br.com.solutis.h.polimorfismo.exercicio.sete;

import br.com.solutis.h.polimorfismo.exercicio.seis.*;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsBasico("Ana", 1, "Escola A");
        funcionarios[1] = new FuncionarioEnsBasico("Luis", 2, "Escola B");
        funcionarios[2] = new FuncionarioEnsMedio("Carlos", 3, "Escola C");
        funcionarios[3] = new FuncionarioEnsMedio("Marta", 4, "Escola D");
        funcionarios[4] = new FuncionarioEnsMedio("Pedro", 5, "Escola E");
        funcionarios[5] = new FuncionarioEnsSuperior("João", 6, "Universidade X");
        funcionarios[6] = new FuncionarioEnsSuperior("Maria", 7, "Universidade Y");
        funcionarios[7] = new FuncionarioEnsSuperior("Julia",8 , "Universidade Z");
        funcionarios[8] = new FuncSemEstudo("Roberto", 9);
        funcionarios[9] = new FuncSemEstudo("Fernanda", 10);

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario f : funcionarios) {
            double renda = f.calcularRenda();
            custoTotal += renda;
            if (f instanceof FuncionarioEnsBasico) {
                custoBasico += renda;
            } else if (f instanceof FuncionarioEnsMedio) {
                custoMedio += renda;
            } else if (f instanceof FuncionarioEnsSuperior) {
                custoSuperior += renda;
            }
        }

        System.out.printf("Custo Total: R$ %.2f \n", custoTotal);
        System.out.printf("Custo Ensino Básico: R$ %.2f\n", custoBasico);
        System.out.printf("Custo Ensino Médio: R$ %.2f\n", custoMedio);
        System.out.printf("Custo Nível Superior: R$ %.2f\n", custoSuperior);
    }
}

