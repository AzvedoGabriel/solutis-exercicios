package br.com.solutis.heranca.exercicio.seis;

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana","9876-5432",202,
                3000.00,0.15,10000.00,0.10);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() * 100 + "%");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() * 100 + "%");

        System.out.println("Salário Total: " + vendedor.calcularSalario());
    }
}
