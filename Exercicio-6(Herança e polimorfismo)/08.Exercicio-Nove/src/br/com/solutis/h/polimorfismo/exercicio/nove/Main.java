package br.com.solutis.h.polimorfismo.exercicio.nove;
import br.com.solutis.h.polimorfismo.exercicio.oito.Gerente;
import br.com.solutis.h.polimorfismo.exercicio.oito.Supervisor;
import br.com.solutis.h.polimorfismo.exercicio.oito.Vendedor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar a lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adicionar funcionários à lista
        funcionarios.add(new FuncionarioEnsBasico("Alice", 1001, new Vendedor(), "Escola X - Basico"));
        funcionarios.add(new FuncionarioEnsMedio("Bob", 1002, new Supervisor(), "Escola Y - Medio Concluido"));
        funcionarios.add(new FuncionarioEnsSuperior("Carlos", 1003, new Gerente(), "Federal do Sul - Superior"));

        // Ordenar a lista de funcionários pela renda total (do maior para o menor)
        funcionarios.sort(Comparator.comparingDouble(Funcionario::calcularRenda).reversed());

        // Mostrar detalhes dos funcionários
        System.out.println("Detalhes dos Funcionários (ordenado do maior para o menor renda total):");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDetalhes();
            System.out.println();
        }
    }
}

