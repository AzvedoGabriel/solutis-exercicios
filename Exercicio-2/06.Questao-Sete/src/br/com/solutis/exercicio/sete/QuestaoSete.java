package br.com.solutis.exercicio.sete;

public class QuestaoSete {
	// 7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
	// 100,
	// usando os tipos de dados int e double .
	public static void main(String[] args) {
		System.out.println("Divisão usando Int: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				int resultadoInt = i / 2;
				System.out.println(" | " + i + " / 2 = " + resultadoInt + " | ");
			}
		}
		System.out.println("Divisão usando Double: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				double resultadoDouble = i / 2.0;
				System.out.print(" | " + i + " / 2 = " + resultadoDouble + " | \n");
			}
		}
	}
}
