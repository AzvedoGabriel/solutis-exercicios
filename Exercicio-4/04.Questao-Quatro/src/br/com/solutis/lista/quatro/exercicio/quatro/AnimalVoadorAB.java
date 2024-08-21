package br.com.solutis.lista.quatro.exercicio.quatro;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadePatas;
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura,
                          double peso, int quantidadePatas, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    public abstract void voar(double totalPecorridoVoando);
}
