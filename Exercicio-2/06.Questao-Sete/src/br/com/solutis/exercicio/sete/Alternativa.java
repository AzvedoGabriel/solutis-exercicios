package br.com.solutis.exercicio.sete;

public class Alternativa {
	// Solução de terceiros
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				int resultadoInt = i / 2;
				double resultadoDouble = i / 2.0;
				System.out.println("Número: " + i);
				System.out.println("Dividido por 2: Resultado em int: " + resultadoInt);
				System.out.println("Dividido por 2: Resultado em double: " + resultadoDouble);
				System.out.println();
			}
		}
	}
}
