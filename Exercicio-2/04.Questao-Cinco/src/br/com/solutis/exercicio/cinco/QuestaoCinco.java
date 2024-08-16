package br.com.solutis.exercicio.cinco;

import java.util.Scanner;

public class QuestaoCinco {
    //5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente.
    // Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero (1 a 7) da semana correspondente: ");
        int semanaNum = entrada.nextInt();

        String[] diasDaSemanas = {
                "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};

        if (semanaNum >= 1 && semanaNum <= 7) {
            System.out.println("O dia da semana correpondente é: " + diasDaSemanas[semanaNum-1]);
        } else {
            System.out.println("Número informado pelo usuario é inválido!");
        }
    }
}
