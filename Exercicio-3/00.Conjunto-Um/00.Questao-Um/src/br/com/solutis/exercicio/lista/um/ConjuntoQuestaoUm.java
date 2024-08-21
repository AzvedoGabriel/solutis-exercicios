package br.com.solutis.exercicio.lista.um;

import java.util.Scanner;

public class ConjuntoQuestaoUm {
    //1. Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de
    //nascimento e o ano atual.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int ano = entrada.nextInt();

        System.out.print("Agora informe o ano do seu nascimento: ");
        int anoNascimento = entrada.nextInt();

        int calculoIdade = ano - anoNascimento;

        System.out.println("Idade do usuário: " + calculoIdade);

        entrada.close();
    }
}
