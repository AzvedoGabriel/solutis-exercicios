package br.com.solutis.exercicio.lista.dois;

import java.util.Scanner;

public class ConjuntoQuestaoDois {
    //2. Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
    //Para isto, peça o valor do seu salário e o valor do salário mínimo atual.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário mínimo atual: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.print("Informe o salário que o funcionario ganha: ");
        double salarioFuncionario = entrada.nextDouble();

        double mediaSalario = salarioFuncionario / salarioMinimo;
        // Aqui como é um exercício "básico" não usamos bigdecimal pra lidar com o fator precisão da conta.
        System.out.printf("A quantidade aproximada do salário mínimo que o " +
                "funcionario ganha: %.3f salários mínimos.", mediaSalario);

        entrada.close();
    }
}
