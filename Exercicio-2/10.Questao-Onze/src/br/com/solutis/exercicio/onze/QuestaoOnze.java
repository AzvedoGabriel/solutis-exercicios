package br.com.solutis.exercicio.onze;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoOnze {
	/*
	 * 11. Escreva um programa que tenha duas palavras como entrada, e a saída
	 * imprima as palavras em ordem alfabética (utilize o metodo compareTo da classe
	 * String),. Informe também, qual das palavras tem o maior número de caracteres.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a primeira palavra: ");
		String myStr1 = scan.nextLine().toLowerCase();
		System.out.println("Informe a segunda palavra: ");
		String myStr2 = scan.nextLine().toLowerCase();
		comparandoPalavras(myStr1, myStr2);

		scan.close();
	}

	public static void comparandoPalavras(String palavra1, String palavra2) {

		int resultado = palavra1.compareTo(palavra2);
		String[] palavras = { palavra1, palavra2 };

		if (resultado == 0) {
			System.out.printf("| Palavra: %s e Palavra: %s | são iguais\n", palavra1, palavra2);
			Arrays.sort(palavras);
			System.out.println("Odernadas:  " + Arrays.toString(palavras));
			System.out.println("As palavras tem o mesmo tamanho: " + palavra1.length() + " e " + palavra2.length());
		} else {
			System.out.printf("| Palavra: %s e Palavra: %s | são diferentes\n", palavra1, palavra2);
			Arrays.sort(palavras);
			System.out.printf("Ordenadas: %s \n", Arrays.toString(palavras));
			if (palavra1.length() > palavra2.length()) {
				System.out.printf("Palavra maior é %s com o tamanho de: %d , " + "a segunda palavra tem %d de tamanho",
						palavra1, palavra1.length(), palavra2.length());
			} else {
				System.out.printf("Palavra maior é %s com o tamanho de: %d , " + "a segunda palavra tem %d de tamanho",
						palavra2, palavra2.length(), palavra1.length());
			}
		}
	}
}
