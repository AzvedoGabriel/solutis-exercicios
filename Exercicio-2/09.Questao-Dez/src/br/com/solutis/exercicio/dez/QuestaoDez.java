package br.com.solutis.exercicio.dez;

import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a Palavra: ");
        String cont = scanner.nextLine().toLowerCase();

        String resultado = contarCaracteres(cont);

        System.out.println("Palavra: " + resultado);
        scanner.close();
    }

    public static String contarCaracteres(String texto) {
        int contagemVogais = 0;
        int contagemConsoantes = 0;
        int contagemEspacos = 0;
        for (char v : texto.toCharArray()) {
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                contagemVogais++;
            } else if (v == ' ') {
                contagemEspacos++;
            } else if (v >= 'a' && v <= 'z') {
                contagemConsoantes++;
            }
        }
        System.out.println("Vogais: " + contagemVogais);
        System.out.println("Consoantes: " + contagemConsoantes);
        System.out.println("Espaços em branco: " + contagemEspacos);

        return texto;
    }

}

