package br.com.solutis.h.polimorfismo.exercicio.tres;

import br.com.solutis.h.polimorfismo.exercicio.um.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.getNome());
        animal.emitirSom();
    }
}
