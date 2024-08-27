package br.com.solutis.h.polimorfismo.exercicio.seis;

public class FuncSemEstudo extends Funcionario {
    public FuncSemEstudo(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public double calcularRenda() {
        return rendaBase;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Renda Total: R$ " + calcularRenda());
    }
}

