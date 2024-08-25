package br.com.solutis.herenca.exercicio.dois;

import java.util.Scanner;

public class Teste {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Joao", "Rua das flores, 145", "81992105078",
                5000.0, 25000.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());


        System.out.println("Valor do Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo restante da divida: " + fornecedor.obterSaldo());

        fornecedor.setValorCredito(10000.0);
        fornecedor.setValorDivida(15000.0);

        System.out.println("Novo valor do crédito: " + fornecedor.getValorCredito());
        System.out.println("Novo valor do Dívida: " + fornecedor.getValorDivida());
        System.out.println("Novo Saldo: " + fornecedor.obterSaldo());
    }
}
