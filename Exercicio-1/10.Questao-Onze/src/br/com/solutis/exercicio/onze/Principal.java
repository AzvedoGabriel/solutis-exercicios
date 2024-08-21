package br.com.solutis.exercicio.onze;

import java.util.Scanner;

public class Principal {
	/*
	 * 11. Utilize a estrutura if para fazer um programa que retorne o nome de um
	 * produto a partir do código do mesmo. Considere os seguintes códigos: 001 ?
	 * Parafuso; 002 ? Porca; 003 ? Prego; Para qualquer outro código: XXX ?
	 * Diversos
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o código do produto: ");
		String codProduto = sc.nextLine();

		String nomeProduto;

		if (codProduto.equals("001")) {
			nomeProduto = "Parafuso";
		}
		if (codProduto.equals("002")) {
			nomeProduto = "Porca";
		} else if (codProduto.equals("003")) {
			nomeProduto = "Prego";
		} else {
			nomeProduto = "Diversos";
		}
		System.out.println("Produto: " + nomeProduto);

		sc.close();
	}
}
