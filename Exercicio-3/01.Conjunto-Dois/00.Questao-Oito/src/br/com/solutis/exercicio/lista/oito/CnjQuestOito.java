package br.com.solutis.exercicio.lista.oito;

import java.util.Scanner;

public class CnjQuestOito {
    // 8. Transforme um número Racional (formado por numerador e denominador) para um número
    // Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
    // mensagem de alerta ao usuário se for zero.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerador, denominador;

        System.out.println("Informe o numerador: ");
        numerador = entrada.nextInt();

        System.out.println("Informe o denominador: ");
        denominador = entrada.nextInt();

        if(denominador == 0){
            System.out.println("Erro: denominador não pode ser zero");
        } else {
            double resultado  = (double) numerador / denominador;

            System.out.println("Resultado: " + resultado);
        }


        entrada.close();
    }
}
