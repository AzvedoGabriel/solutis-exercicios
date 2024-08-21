package br.com.solutis.exercicio.lista.catorze;

import java.util.Scanner;

public class CnjQuestCatorze {
    // 14. Receba do usuário o nome de um mês. Exiba o número equivalente.
    // Obs.: para comparar Strings em Java deve-se usar o metodo equals ou equalsIgnoreCase,
    // mas nunca o operador “==”. Por exemplo, para comparar a variável nome com “Maria”
    // deve-se usar: if(nome.equals(“Maria”) ...

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do mês");
        String nomeMes = sc.nextLine();

        if(nomeMes.equalsIgnoreCase("Janeiro")) {
            System.out.println(1);
        } else if(nomeMes.equalsIgnoreCase("Fevereiro")) {
            System.out.println(2);
        } else if(nomeMes.equalsIgnoreCase("Março")) {
            System.out.println(3);
        } else if(nomeMes.equalsIgnoreCase("Abril")) {
            System.out.println(4);
        } else if(nomeMes.equalsIgnoreCase("Maio")) {
            System.out.println(5);
        } else if(nomeMes.equalsIgnoreCase("Junho")) {
            System.out.println(6);
        } else if(nomeMes.equalsIgnoreCase("Julho")) {
            System.out.println(7);
        } else if(nomeMes.equalsIgnoreCase("Agosto")) {
            System.out.println(8);
        } else if(nomeMes.equalsIgnoreCase("Setembro")) {
            System.out.println(9);
        } else if(nomeMes.equalsIgnoreCase("Outubro")) {
            System.out.println(10);
        } else if(nomeMes.equalsIgnoreCase("Novembro")) {
            System.out.println(11);
        } else if(nomeMes.equalsIgnoreCase("Dezembro")) {
            System.out.println(12);
        }


    }
}
