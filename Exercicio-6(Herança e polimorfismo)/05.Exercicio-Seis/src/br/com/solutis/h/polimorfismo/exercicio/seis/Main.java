package br.com.solutis.h.polimorfismo.exercicio.seis;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos diferentes tipos de funcionários
        Funcionario funcionario1 = new FuncSemEstudo("Ana", 1);
        Funcionario funcionario2 = new FuncionarioEnsBasico("Luis", 2, "Escola A");
        Funcionario funcionario3 = new FuncionarioEnsMedio("Carlos", 3, "Escola B");
        Funcionario funcionario4 = new FuncionarioEnsSuperior("João", 4, "Universidade X");

        // Exibindo detalhes e renda total dos funcionários
        funcionario1.mostrarDetalhes();
        System.out.println(); // Linha em branco para separar
        funcionario2.mostrarDetalhes();
        System.out.println(); // Linha em branco para separar
        funcionario3.mostrarDetalhes();
        System.out.println(); // Linha em branco para separar
        funcionario4.mostrarDetalhes();
    }
}

