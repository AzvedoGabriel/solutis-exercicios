package br.com.solutis.exercicio.lista.doze;

import java.util.Scanner;

public class CnjQuestDoze {
    //12. A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
    //recuperação ou foi reprovado. A média de aprovação é &gt;= 7.0; a média de recuperação é
    //=> 5.0 e < 7.0; e a média do reprovado é <5.0

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double notaUm = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double notaDois = entrada.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double notaTres = entrada.nextDouble();

        double mediaNotas = (notaUm + notaDois + notaTres) /3;
        if(mediaNotas >= 7) {
            System.out.println("Aluno aprovado");
        } else if(mediaNotas < 7) {
            System.out.println("Aluno foi reprovado");
        }
        entrada.close();
    }
}
