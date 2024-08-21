package br.com.solutis.exercicio.lista.dez;

import java.util.Scanner;

public class CnjQuestDez {
    //10. Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
    //salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
    //empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário bruto");
        double valorSalarioBruto = sc.nextDouble();

        System.out.print("O valor máximo para o emprestimo é de 30% do valor do seu salário líquido");
        System.out.println();
        System.out.print("Digite o valor do possível empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.print("Digite o valor total dos descontos mensal: ");
        double valorDesconto = sc.nextDouble();

        double salarioLiquido = valorSalarioBruto - valorDesconto;

        double limiteEmprestimo = salarioLiquido * 0.30;

        if (valorEmprestimo > limiteEmprestimo) {
            System.out.println("O empréstimo não pode ser concedido.");
        } else {
            System.out.println("O empréstimo pode ser concedido.");
        }


        sc.close();
    }

}

