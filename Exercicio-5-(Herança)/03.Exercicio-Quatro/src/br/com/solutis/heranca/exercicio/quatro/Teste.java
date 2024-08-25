package br.com.solutis.heranca.exercicio.quatro;

public class Teste {
    public static void main(String[] args) {
        Administrador admin = new Administrador("João Silva", "Rua A, 123",
                1,5000.0,10.0, 800.0);


        System.out.println("Nome: " + admin.getNome());
        System.out.println("Endereço: " + admin.getEndereco());
        System.out.println("Telefone: " + admin.getTelefone());
        System.out.println("Salário base: R$ " + admin.getSalarioBase());
        System.out.println("Imposto: " + admin.getImposto() + "%");
        System.out.println("Ajuda de Custo: R$ " + admin.getAjudaDeCusto());
        System.out.println("Salário Total: R$ " + admin.calcularSalario());
    }
}