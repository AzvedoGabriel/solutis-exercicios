package br.com.solutis.exercicio.lista.treze;

import java.util.Scanner;

public class CnjQuestTreze {
    //13. Acrescente no problema anterior possibilidade dele fazer prova final em caso de
    //recuperação. Neste caso a nota de aprovação passa a ser &gt;= 5.0
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double notaUm = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double notaDois = scan.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double notaTres = scan.nextDouble();

        double mediaNotas = (notaUm + notaDois + notaTres) /3;
        if(mediaNotas >= 7) {
            System.out.println("Aluno aprovado");
        } else if(mediaNotas < 7) {
            System.out.println("Aluno ficou de recuperação");
            System.out.println("| "+ mediaNotas + " |");
            if (mediaNotas >= 5) {
                System.out.println("Informe a nota da prova de recuperação: ");
                double notaRecuperacao = scan.nextDouble();
                if (notaRecuperacao >= 5) {
                    System.out.println("Aluno foi aprovado");
                } else {
                    System.out.println("Aluno foi reprovado");
                }
            }
        }


        scan.close();
    }
}
