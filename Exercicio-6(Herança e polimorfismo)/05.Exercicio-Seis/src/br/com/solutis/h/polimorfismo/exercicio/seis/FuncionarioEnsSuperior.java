package br.com.solutis.h.polimorfismo.exercicio.seis;


public class FuncionarioEnsSuperior extends Funcionario {
    private String universidade;

    public FuncionarioEnsSuperior(String nome, int codigoFuncional, String universidade) {
        super(nome, codigoFuncional);
        this.universidade = universidade;
    }

    @Override
    public double calcularRenda() {
        return rendaBase * 1.10 * 1.50 * 2.00;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Universidade: " + universidade);
        System.out.println("Renda Total: R$ " + calcularRenda());
    }
}
