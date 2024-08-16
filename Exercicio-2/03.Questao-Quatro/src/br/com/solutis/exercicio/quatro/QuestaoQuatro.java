package br.com.solutis.exercicio.quatro;


import java.util.Scanner;

public class QuestaoQuatro {
    // 4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
    // converte-a para quilômetros e apresenta o resultado no console. (fórmula de conversão: 1 milha = 1.609 km).

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a milha que deseja converter: ");
        int milha = entrada.nextInt();
        double resultado = conversorMilhaAKm(milha);

        System.out.printf("Resultado em: %,.3f km", resultado);
    }

    public static double conversorMilhaAKm(int milha){

        return milha * 1.609;
    }
}
