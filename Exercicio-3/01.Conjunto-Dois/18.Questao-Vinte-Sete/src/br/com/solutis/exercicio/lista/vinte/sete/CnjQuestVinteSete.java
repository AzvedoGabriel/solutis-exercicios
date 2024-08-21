package br.com.solutis.exercicio.lista.vinte.sete;

import java.util.Scanner;

public class CnjQuestVinteSete {
    /*
     *   27. Descubra e apresente o maior entre três números fornecidos pelo usuário. Caso eles sejam
     *   iguais, avise ao usuário.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Informe o terceiro numero: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Informação que o usuário digitou " +
                    "pela primeira vez é o maior (primeiro numero): " + num1);
        }

        if(num2 > num3 && num2 > num1){
            System.out.println("Informação que o usuário digitou " +
                    "pela segunda vez é o maior (segundo numero): " + num2);
        }
        if(num3 > num2 && num3 > num1){
            System.out.println("Informação que o usuário digitou pela terceira vez é o maior (terceiro numero)" +  num3);
        }

        if (num1 == num2 && num1 == num3){
            System.out.println("Os três numeros fornecidos são iguais");
        }
    }
}

