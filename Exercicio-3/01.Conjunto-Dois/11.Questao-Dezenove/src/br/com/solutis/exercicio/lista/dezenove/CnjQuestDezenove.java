package br.com.solutis.exercicio.lista.dezenove;

import java.util.Arrays;
import java.util.Scanner;

public class CnjQuestDezenove {
    // 19. Exiba dois números fornecidos pelo usuário em ordem crescente.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        int[] salvarNumeros = {num1, num2};

        Arrays.sort(salvarNumeros);

        System.out.println(Arrays.toString(salvarNumeros));
    }
}
