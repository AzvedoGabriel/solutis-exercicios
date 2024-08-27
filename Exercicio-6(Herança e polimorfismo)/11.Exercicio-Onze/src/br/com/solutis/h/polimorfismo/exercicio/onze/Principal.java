package br.com.solutis.h.polimorfismo.exercicio.onze;

import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Gerente;
import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Supervisor;
import br.com.solutis.h.polimorfismo.exercicio.onze.comissao.Vendedor;

public class Principal {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsBasico("Ana", 1, new Vendedor(), "Escola X - Ensino Basico");
        funcionarios[1] = new FuncionarioEnsBasico("Luis", 2, new Vendedor(), "Escola X - Ensino Basico");
        funcionarios[2] = new FuncionarioEnsMedio("Carlos", 3, new Supervisor(), "Escola A - Ensino Medio");
        funcionarios[3] = new FuncionarioEnsMedio("Marta", 4, new Supervisor(), "Escola B - Ensino Medio");
        funcionarios[4] = new FuncionarioEnsMedio("Pedro", 5, new Supervisor(), "Escola C - Ensino Medio");
        funcionarios[5] = new FuncionarioEnsSuperior("João", 6, new Gerente(), "Escola XZ - Ensino Superior");
        funcionarios[6] = new FuncionarioEnsSuperior("Maria", 7, new Gerente(), "Escola XZ - Ensino Superior");
        funcionarios[7] = new FuncionarioEnsSuperior("Julia", 8, new Gerente(), "Escola XZ - Ensino Superior");
        funcionarios[8] = new FuncSemEstudo("Roberto", 9);
        funcionarios[9] = new FuncSemEstudo("Fernanda", 10);

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario f : funcionarios) {
            double renda = f.calcularRenda();
            custoTotal += renda;
            switch (f) {
                case FuncionarioEnsBasico funcionarioEnsBasico -> custoBasico += renda;
                case FuncionarioEnsMedio funcionarioEnsMedio -> custoMedio += renda;
                case FuncionarioEnsSuperior funcionarioEnsSuperior -> custoSuperior += renda;
                default -> {
                }
            }
        }

        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("Custo Ensino Básico: R$ " + custoBasico);
        System.out.println("Custo Ensino Médio: R$ " + custoMedio);
        System.out.println("Custo Nível Superior: R$ " + custoSuperior);
        // Utilizando o for-each para imprimir os detalhes dos funcionários usando toString()
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }
}

