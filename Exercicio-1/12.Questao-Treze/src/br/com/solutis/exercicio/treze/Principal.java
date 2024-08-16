package br.com.solutis.exercicio.treze;

public class Principal {
    // 13. Escreva uma classe que imprima todas as possibilidades de que no lançamento de
    //dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.

    public static void main(String[] args) {
        calculandoDados();
    }

    public static void calculandoDados(){
        for (int dado1 = 1; dado1 <=6 ; dado1++) {
            for (int dado2 = 1; dado2 <=6 ; dado2++) {
                if (dado1 + dado2 == 7) {
                    System.out.printf("| Dado 1 - [%d] - Dado2 - [%d] |\n", dado1 ,dado2);
                }
            }
        }
    }
}
