package br.com.solutis.exercicio.dez;

public class Principal {
    /*  10. Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6,
    *   a segunda o valor 4 e a terceira receba o valor da divisão da primeira pela segunda.
    *    Exiba o valor da terceira variável. Faça uma análise do resultado
    */

    public static void main(String[] args) {
        int numb1 = 6, numb2 = 4;

        int calcDivisao = numb1 / numb2;
        // Esse resultado não é necessariamente o ideal por conta da divisão dar numero "quebrado"
        // no caso o resultado seria 1,5
        System.out.println(calcDivisao);

    }
}
