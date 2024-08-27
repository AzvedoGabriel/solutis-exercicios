package br.com.solutis.h.polimorfismo.exercicio.tres;

import br.com.solutis.h.polimorfismo.exercicio.um.Animal;
import br.com.solutis.h.polimorfismo.exercicio.um.Cachorro;
import br.com.solutis.h.polimorfismo.exercicio.um.Cavalo;
import br.com.solutis.h.polimorfismo.exercicio.um.Preguica;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Sid", 3);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
