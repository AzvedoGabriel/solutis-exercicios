package br.com.solutis.heranca.exercicio.cinco;

public class Teste {
    public static void main(String[] args) {
        Operario operario = new Operario("Carlos","1234-5678",101,
                2000.00,0.10,5000.00, 0.05);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() * 100 + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() * 100 + "%");

        System.out.println("Salário Total: " + operario.calcularSalario());
    }
}
