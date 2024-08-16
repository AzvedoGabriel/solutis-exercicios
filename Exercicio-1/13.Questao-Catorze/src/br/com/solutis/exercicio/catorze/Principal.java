package br.com.solutis.exercicio.catorze;

import java.util.Random;

public class Principal {
    // 14. Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética
    // deles. (Pesquise sobre como realizar entrada de dados)
    public static void main(String[] args) {
        int[] numeros = new int[50];


        Random random = new Random();

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = random.nextInt(200);
        }

        int k = 0;
        int media = 0;
        while (k < numeros.length) {
            System.out.println("| " + numeros[k] + " | ");
            numeros[k] += numeros[k];
            media += numeros[k];

            k++;
        }

        System.out.println("| " + "Media total: " + media + " | ");
        System.out.println("| " + "Média entre 50 numeros é: " + media/50);
    }
}
