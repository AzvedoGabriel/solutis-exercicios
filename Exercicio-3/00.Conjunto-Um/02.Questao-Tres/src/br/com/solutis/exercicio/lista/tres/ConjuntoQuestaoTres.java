package br.com.solutis.exercicio.lista.tres;

import java.util.Scanner;

public class ConjuntoQuestaoTres {
    //3. Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida
    //calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.
    //Obs.: em Java a divisão de valores inteiros dá como resultado um número inteiro, ao menos
    //que um dos números seja do tipo ponto flutuante (double, por exemplo). Para transformar
    //inteiro para double basta fazer um cast: “(double)x” - transforma “x” em double.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de homens na turma: ");
        int homens = entrada.nextInt();

        System.out.println("Informe a quantidade de mulheres na turma: ");
        int mulheres = entrada.nextInt();

        int totalPessoas = homens + mulheres;

        double mediaHomens = ((double) totalPessoas / homens) * 100;
        double mediaMulheres = ((double) totalPessoas /mulheres) * 100;

        System.out.printf("A um total de %.2f homens e %.1f mulheres\n", mediaHomens, mediaMulheres);

        entrada.close();
    }
}
