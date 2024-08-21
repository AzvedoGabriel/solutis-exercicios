package br.com.solutis.exercicio.dois;

import java.util.Scanner;

public class QuestaoDois {
    // 2. Faça um programa que receba 2 valores e retorne o maior entre eles.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valorUm = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valorDois = scan.nextInt();

        System.out.println(Math.max(valorUm, valorDois));

        scan.close();
    }
}
