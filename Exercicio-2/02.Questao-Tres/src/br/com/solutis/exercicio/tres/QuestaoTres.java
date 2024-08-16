package br.com.solutis.exercicio.tres;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = scan.nextInt();

        System.out.println("Números primos menores que " + num + ": ");

        for (int i = 1; i <= num-1; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " | ");
            }
        }

        scan.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= (num/2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
