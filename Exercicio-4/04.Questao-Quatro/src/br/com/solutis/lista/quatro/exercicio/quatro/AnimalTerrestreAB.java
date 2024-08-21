package br.com.solutis.lista.quatro.exercicio.quatro;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade,
                             String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public abstract void andar(double distanciaCaminhada);
}
