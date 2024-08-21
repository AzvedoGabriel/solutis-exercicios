package br.com.solutis.exercicio.dez;

public class SolucaoEstudo {
	public static void main(String[] args) {
		SolucaoEstudo contador = new SolucaoEstudo();
		String texto = "Exemplo de texto para contar aloca";
		contador.contarCaracteres(texto);
	}

	public void contarCaracteres(String texto) {
		int vogais = 0, consoantes = 0, espacos = 0;

		texto = texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vogais++;
			} else if (c == ' ') {
				espacos++;
			} else if (c >= 'a' && c <= 'z') {
				consoantes++;
			}
		}

		System.out.println("Vogais: " + vogais);
		System.out.println("Consoantes: " + consoantes);
		System.out.println("Espaços em branco: " + espacos);
	}
}
