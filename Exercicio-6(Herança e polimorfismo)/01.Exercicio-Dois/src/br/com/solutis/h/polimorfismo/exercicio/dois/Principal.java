package br.com.solutis.h.polimorfismo.exercicio.dois;

import br.com.solutis.h.polimorfismo.exercicio.um.Animal;
import br.com.solutis.h.polimorfismo.exercicio.um.Cachorro;
import br.com.solutis.h.polimorfismo.exercicio.um.Cavalo;
import br.com.solutis.h.polimorfismo.exercicio.um.Preguica;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Sid", 3);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            System.out.print(animal.getNome() + " está fazendo som: ");
            animal.emitirSom();
        }
    }
}
