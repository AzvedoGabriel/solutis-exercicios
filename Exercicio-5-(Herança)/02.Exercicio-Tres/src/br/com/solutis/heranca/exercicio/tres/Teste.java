package br.com.solutis.heranca.exercicio.tres;

public class Teste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Ana Maria", "Av. Central, 456", 101, 3000.0, 10.0);

        System.out.println("-----------------------------------------------");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("-----------------------------------------------");
        // Testando métodos da classe Empregado
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto (%): " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
        System.out.println("-----------------------------------------------");
        // Modificando valores
        empregado.setSalarioBase(3500.0);
        empregado.setImposto(12.0);

        System.out.println("Novo Salário Base: " + empregado.getSalarioBase());
        System.out.println("Novo Imposto (%): " + empregado.getImposto());
        System.out.println("Novo Salário Líquido: " + empregado.calcularSalario());
        System.out.println("-----------------------------------------------");
    }

}
