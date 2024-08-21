package br.com.solutis.exercicio.lista.dezesseis;

import java.util.Scanner;

public class CnjQuestDezesseis {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a data do seu aniversário: ");
        int dia = entrada.nextInt();

        System.out.print("Digite o numero que representa o mês que nasceu: ");
        int mes = entrada.nextInt();

        if (dia <= 31) {
            System.out.println("Data está ok | Mês escolhido: " + meses(mes));
            System.out.println("Nascido no: " + trimestre(mes));
        } else {
            System.out.println("Data informada é inválida");
        }

        entrada.close();
    }

    public static String trimestre(int mes) {
        if (mes >= 1 && mes <= 3) {
            return "1º Trimestre";
        } else if (mes >= 4 && mes <= 6) {
            return "2º Trimestre";
        } else if (mes >= 7 && mes <= 9) {
            return "3º Trimestre";
        } else {
            return "4º Trimestre";
        }
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
