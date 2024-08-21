package br.com.solutis.lista.quatro.exercicio.quatro;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;

public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public abstract void nadar(double distanciaPecorrida);


}
