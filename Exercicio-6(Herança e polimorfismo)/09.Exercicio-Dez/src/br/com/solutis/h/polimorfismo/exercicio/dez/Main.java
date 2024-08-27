package br.com.solutis.h.polimorfismo.exercicio.dez;

import br.com.solutis.h.polimorfismo.exercicio.nove.Funcionario;
import br.com.solutis.h.polimorfismo.exercicio.nove.FuncionarioEnsBasico;
import br.com.solutis.h.polimorfismo.exercicio.nove.FuncionarioEnsMedio;
import br.com.solutis.h.polimorfismo.exercicio.nove.FuncionarioEnsSuperior;
import br.com.solutis.h.polimorfismo.exercicio.oito.Gerente;
import br.com.solutis.h.polimorfismo.exercicio.oito.Supervisor;
import br.com.solutis.h.polimorfismo.exercicio.oito.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar a lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();

        // Criar 10 funcionários com a distribuição especificada
        int totalFuncionarios = 10;
        int numGerentes = (int) (totalFuncionarios * 0.10);
        int numSupervisores = (int) (totalFuncionarios * 0.20);
        int numVendedores = (int) (totalFuncionarios * 0.70);

        // Adicionar Gerentes
        for (int i = 1; i <= numGerentes; i++) {
            funcionarios.add(new FuncionarioEnsSuperior("Gerente" + i, i, new Gerente(), "Federal do Norte - Superior"));
        }

        // Adicionar Supervisores
        for (int i = 1; i <= numSupervisores; i++) {
            funcionarios.add(new FuncionarioEnsMedio("Supervisor" + i, numGerentes + i, new Supervisor(), "Escola S - Nivel Medio"));
        }

        // Adicionar Vendedores
        for (int i = 1; i <= numVendedores; i++) {
            funcionarios.add(new FuncionarioEnsBasico("Vendedor" + i, numGerentes + numSupervisores + i, new Vendedor(), "Escola V - Basico"));
        }

        // Calcular custos totais
        double custoTotal = 0;
        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;

        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.calcularRenda();
            custoTotal += rendaTotal;

            if (funcionario.getComissao() instanceof Gerente) {
                custoGerentes += rendaTotal;
            } else if (funcionario.getComissao() instanceof Supervisor) {
                custoSupervisores += rendaTotal;
            } else if (funcionario.getComissao() instanceof Vendedor) {
                custoVendedores += rendaTotal;
            }
        }

        // Exibir resultados
        System.out.println("Custos da Empresa:");
        System.out.println("Custo Total com Salários: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerentes);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisores);
        System.out.println("Custo com Vendedores: R$ " + custoVendedores);
    }
}
