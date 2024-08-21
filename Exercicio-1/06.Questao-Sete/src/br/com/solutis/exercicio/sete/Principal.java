package br.com.solutis.exercicio.sete;

import java.util.Scanner;

public class Principal {
	/*
	 * 7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de
	 * forma que a variável A passe a possuir o valor da variável B e que a variável
	 * B passe a possuir o valor da variável A. Apresentar os valores trocados.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro valor (variavel A): ");
		int valorA = scan.nextInt();

		System.out.print("Informe o segundo valor (variavel B): ");
		int valorB = scan.nextInt();

		System.out.println("---------------------");
		System.out.println("Valor de A: " + valorA + " Valor de B: " + valorB + " Invertendo...");

		int valorBB = valorA;
		valorA = valorB;
		System.out.println("Valor de A: " + valorA);
		valorB = valorBB;
		System.out.println("Valor de B: " + valorB);

		scan.close();
	}
}
