package br.com.solutis.exercicio.lista.onze;

import java.util.Scanner;

public class CnjQuestOnze {
    //11. A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16),
    //ou se o voto é facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o
    //voto é obrigatório.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade do cidadão: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Ele(a) não poderá votar");
        } else if (idade < 18 || idade >= 65) {
            System.out.println("Voto é facultativo");
        }else {
            System.out.println("O voto é obrigatorio");
        }

        sc.close();
    }
}
