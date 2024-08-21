package br.com.solutis.exercicio.lista.cinco;

import java.util.Scanner;

public class ConjQuestCinco {
    //5. Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do
    //débito, a quantidade de meses e os juros mensais. Use o calculo de juros simples.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor inicial do débito: ");
        double valorInicial = entrada.nextDouble();

        System.out.print("Informe em quantos meses foi negociado a dívida: ");
        double qtdMeses = entrada.nextDouble();

        System.out.println(" | Sabendo que a taxa está em 5% mensal.");
        System.out.println(" | Usaremos 0,05 como base para representar 5% (é menos correto em calculo especifico) |");
        double juros = 0.05;
        // Juros simples formula ( juros + capital + taxa de juros + tempo)

        double valorFinal = valorInicial + (valorInicial * juros)* qtdMeses;
        System.out.println("Valor final: " + valorFinal);
        entrada.close();
    }
}
