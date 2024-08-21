package br.com.solutis.exercicio.lista.nove;

import java.util.Scanner;

public class CnjQuestNove {
    //9. Verifique se o usuário é maior de idade ou não.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();

        String mensagem = idade >= 18 ? "Usuário é maior de idade" : "Usuário ainda é menor de idade";

        System.out.println(mensagem);

        sc.close();
    }
}
