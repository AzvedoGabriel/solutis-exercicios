package br.com.solutis.h.polimorfismo.exercicio.oito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista de comissões
        List<Comissao> comissoes = new ArrayList<>();
        comissoes.add(new Vendedor());
        comissoes.add(new Gerente());
        comissoes.add(new Supervisor());

        // Ordenar a lista por valor adicional
        comissoes.sort(Comparator.comparingDouble(Comissao::calcularAdicional).reversed());

        // Mostrar os adicionais
        System.out.println("Adicionais ao salário (ordenado por valor):");
        for (Comissao comissao : comissoes) {
            System.out.printf("Adicional do %s: R$%.2f%n", comissao.getNome(), comissao.calcularAdicional());
        }
    }
}

