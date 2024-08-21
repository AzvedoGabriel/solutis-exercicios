package br.com.solutis.exercicio.oito;

import java.util.Scanner;

public class QuestaoOito {
	/*
	 * / 8. Criar uma classe Java que receba uma palavra (String) retorne uma
	 * mensagem caso a palavra / fornecida seja uma palavra que pode ser lida da
	 * esquerda pra direita ou da direita pra / esquerda obtendo-se a mesma palavra.
	 * Ex.: Ana, arara, osso, etc.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String palavra = scanner.nextLine().toLowerCase();
		StringBuilder palavraReversa = new StringBuilder(palavra).reverse();
		if (palavra.contentEquals(palavraReversa)) {
			System.out.println("Ela é um palíndromo, palavra: " + palavraReversa);
		} else {
			System.out.println("Palavra não é considerada palíndromo");
		}
		scanner.close();
	}
}
