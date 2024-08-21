package br.com.solutis.exercicio.lista.sete;

import java.util.Scanner;

public class ConjQuestSete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da despesa de um cliente: ");
        double valorDespCliente = entrada.nextDouble();

        comissaoResult(valorDespCliente);
        entrada.close();

    }

    public static void comissaoResult(double despesaCliente){
        double comissaoGarcom = 0.10;

        double valorComissao = despesaCliente * comissaoGarcom;

        System.out.printf("A comissão do garçom será de R$ %.2f ", valorComissao);
    }
}
