package br.com.solutis.exercicio.seis;

public class QuestaoSeis {

	public static void main(String[] args) {
		int numeroImparInicial = 15;
		int numeroImparFinal = 30;

		int produtoInteiro = 1;
		float produtoFloat = 1.0F;

		for (int i = numeroImparInicial; i <= numeroImparFinal; i++) {
			if (i % 2 == 1) {
				produtoInteiro *= i;
			}
		}

		for (int i = numeroImparInicial; i <= numeroImparFinal; i++) {
			if (i % 2 == 1) {
				produtoFloat *= i;
			}
		}

		System.out.println("Produtos dos números ímpares (int) de 15 a 30: " + produtoInteiro);
		System.out.println("Produtos dos números ímpares (float) de 15 a 30: " + produtoFloat);
	}
}
