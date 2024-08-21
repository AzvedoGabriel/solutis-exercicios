package br.com.solutis.exercicio.lista.quinze;

import java.util.Scanner;

public class CnjQuestQuinze {
    // 15. Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
    //Além de falar se a data está ok, informe também o nome do mês.
    //Dica: meses com 30 dias: abril, junho, setembro e novembro.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a data do seu aniversário: ");
        int dia = entrada.nextInt();

        System.out.print("Digite o numero que representa o mês que nasceu: ");
        int mes = entrada.nextInt();

        if (dia <= 31) {
            System.out.println("Data está ok | Mês escolhido: " + meses(mes));
        } else {
            System.out.println("Data informada é inválida");
        }

        entrada.close();
    }
    public static String meses(int mes) {
        return switch (mes) {
            case 1 -> "Janeiro"; case 2 -> "Fevereiro";
            case 3 -> "Março";   case 4 -> "Abril";
            case 5 -> "Maio";    case 6 -> "Junho";
            case 7 -> "Julho";   case 8 -> "Agosto";
            case 9 -> "Setembro"; case 10 -> "Outubro";
            case 11 -> "Novembro"; case 12 -> "Dezembro";
            default -> "Mês invalido";
        };
    }

}
