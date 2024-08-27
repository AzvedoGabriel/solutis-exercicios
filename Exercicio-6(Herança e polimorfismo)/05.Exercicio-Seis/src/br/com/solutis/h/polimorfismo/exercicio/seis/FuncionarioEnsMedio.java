package br.com.solutis.h.polimorfismo.exercicio.seis;


public class FuncionarioEnsMedio extends Funcionario {
    private String escola;

    public FuncionarioEnsMedio(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    @Override
    public double calcularRenda() {
        return rendaBase * 1.10 * 1.50;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Escola: " + escola);
        System.out.println("Renda Total: R$ " + calcularRenda());
    }
}
