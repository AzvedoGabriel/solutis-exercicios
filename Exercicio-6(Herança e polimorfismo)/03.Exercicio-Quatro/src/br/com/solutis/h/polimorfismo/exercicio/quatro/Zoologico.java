package br.com.solutis.h.polimorfismo.exercicio.quatro;

import br.com.solutis.h.polimorfismo.exercicio.um.Animal;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        // Cria um array de 10 jaulas
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Index fora dos limites das jaulas.");
        }
    }

    public void mostrarAnimais() {
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] != null) {
                System.out.println("Jaula " + (i + 1) + ": " + jaulas[i].getNome());
                jaulas[i].emitirSom();
                jaulas[i].correr();
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
            }
        }
    }
}
