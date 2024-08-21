package br.com.solutis.exercicio.oito;

import java.util.Scanner;

public class QuestaoNove {
	/*
	 * / 9. Escreva uma classe para calcular a área de um círculo, / sabendo que a
	 * área é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o /
	 * resultado terá que ser arredondado.
	 */
	public static void main(String[] args) {
		// A = PI * (r * r)
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o raio do círculo: ");
		double raio = scan.nextDouble();

		double resultado = areaCirculo(raio);
		// Resultado Arredondado
		System.out.println("O resultado é: " + Math.round(resultado));

		scan.close();
	}

	public static double areaCirculo(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}
