package br.com.solutis.exercicio.lista.dezessete;

import java.util.Scanner;

public class CnjQuestDezessete {
    //17. Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a data do seu aniversário: ");
        int dia = entrada.nextInt();

        System.out.print("Digite o numero que representa o mês que nasceu: ");
        int mes = entrada.nextInt();

        if (dia <= 31) {
            System.out.println("Data está ok | Mês escolhido: " + meses(mes));
            System.out.println("Nascido no: " + trimestre(mes));
            System.out.println("Signo: " + signo(dia, mes));
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

    public static String signo(int dia, int mes) {
        return switch (mes) {
            case 1 -> (dia <= 20) ? "Capricórnio" : "Aquário"; case 2 -> (dia <= 19) ? "Aquário" : "Peixes";
            case 3 -> (dia <= 20) ? "Peixes" : "Áries"; case 4 -> (dia <= 20) ? "Áries" : "Touro";
            case 5 -> (dia <= 20) ? "Touro" : "Gêmeos"; case 6 -> (dia <= 20) ? "Gêmeos" : "Câncer";
            case 7 -> (dia <= 22) ? "Câncer" : "Leão";  case 8 -> (dia <= 22) ? "Leão" : "Virgem";
            case 9 -> (dia <= 22) ? "Virgem" : "Libra"; case 10 -> (dia <= 22) ? "Libra" : "Escorpião";
            case 11 -> (dia <= 21) ? "Escorpião" : "Sagitário"; case 12 -> (dia <= 21) ? "Sagitário" : "Capricórnio";
            default -> "Signo inválido";
        };
    }
}