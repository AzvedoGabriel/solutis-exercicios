package br.com.solutis.exercicio.lista.quatro;

import java.util.Scanner;

public class ConjQuestQuatro {
    //4. Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Informe a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Informe a nota 3: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Informe a nota 4: ");
        double nota4 = entrada.nextDouble();


        double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média aritmética das notas: " + mediaNota);
        entrada.close();
    }
}
