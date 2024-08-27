package br.com.solutis.h.polimorfismo.exerc.cinco;

public class FuncionarioEnsMedio extends Funcionario {
    private String escolaMedio;


    public FuncionarioEnsMedio(String nome, int codigoFuncional, String escolaMedio) {
        super(nome, codigoFuncional, ACADEMICO.NIVEL_MEDIO);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Escola de Ensino Médio: " + escolaMedio);
    }
}
