package br.com.solutis.exercicio.lista.vinte.um;

import java.util.Scanner;

public class CnjQuestVinteUm {
    //21. Exiba o valor do empréstimo possível para um funcionário de uma empresa.
    //Sabe-se:
    //
    //| Cargo  | % do salário |
    //| Diretoria | 30% |
    //| Gerência | 25% |
    //| Operacional | 20% |

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o Cargo: ");
        String cargo = sc.nextLine().toLowerCase();

        System.out.println("Digite o valor do salário");
        double valorSalario = sc.nextDouble();

        if (cargo.equalsIgnoreCase("diretoria")) {
            double valorMaximoEmprestimo = valorSalario * 0.30;
            System.out.println("Valor do empréstimo: " + valorMaximoEmprestimo);
        } else if (cargo.equalsIgnoreCase("gerência")) {
            double valorMaximoEmprestimo = valorSalario * 0.25;
            System.out.println("Valor do empréstimo: " + valorMaximoEmprestimo);
        } else if (cargo.equalsIgnoreCase("operacional")) {
            double valorMaximoEmprestimo = valorSalario * 0.20;
            System.out.println("Valor do empréstimo: " + valorMaximoEmprestimo);
        }
        sc.close();
    }
}
