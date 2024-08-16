package br.com.solutis.exercicio.quinze;

import java.util.Random;

public class Principal {
    // 15. Refaça o programa anterior utilizando a estrutura do while.
    public static void main(String[] args) {
        int[] numeros = new int[50];


        Random random = new Random();

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = random.nextInt(200);
        }

        int k = 0;
        int media = 0;
        do {
            System.out.println("| " + numeros[k] + " | ");
            numeros[k] += numeros[k];
            media += numeros[k];

            k++;
        }while (k < numeros.length);

        System.out.println("| " + "Media total: " + media + " | ");
        System.out.println("| " + "Média entre 50 numeros é: " + media/50);
    }
}
