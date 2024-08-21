package br.com.solutis.exercicio.lista.vinte;

import java.util.Scanner;

public class CnjQuestVinte {
    //20. Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais
    //velha e o nome da pessoa mais nova.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe o nome do pessoa " + 1 + ": ");
        String nomePessoa = entrada.next();
        System.out.print("Informe a idade do pessoa " + 1 + ": ");
        int idadePessoa = entrada.nextInt();

        System.out.print("Informe o nome do pessoa " + 2 + ": ");
        String nomePessoaDois = entrada.next();
        System.out.print("Informe a idade do pessoa " + 2 + ": ");
        int idadePessoaDois = entrada.nextInt();


        if (idadePessoa > idadePessoaDois) {
            System.out.println("Pessoa: " + nomePessoa + " de idade: "  + idadePessoa + " é mais velha que" +
                    " Pessoa 2: " + nomePessoaDois + " de idade: " + idadePessoaDois);
        }else {
            System.out.println("Pessoa 2: " + nomePessoaDois + " de idade: " + idadePessoaDois + " é mais velha que"
                    + " Pessoa: " + nomePessoa + " de idade: "  + idadePessoa);
        }
    }
}
