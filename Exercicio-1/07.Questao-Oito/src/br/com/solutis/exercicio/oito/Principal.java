package br.com.solutis.exercicio.oito;

import java.util.Scanner;

public class Principal {
    /*
    * 8. Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verifique se o numero é par ou impar: ");
        int num = sc.nextInt();

        String mensagemParOuImpar = num % 2 == 0 ? "Par" : "Impar";

        System.out.println(mensagemParOuImpar);
    }
}
