package br.com.solutis.h.polimorfismo.exercicio.quatro;

import br.com.solutis.h.polimorfismo.exercicio.um.Animal;
import br.com.solutis.h.polimorfismo.exercicio.um.Cachorro;
import br.com.solutis.h.polimorfismo.exercicio.um.Cavalo;
import br.com.solutis.h.polimorfismo.exercicio.um.Preguica;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Sid", 3);
        Animal cachorro2 = new Cachorro("Bob", 4);
        Animal cavalo2 = new Cavalo("Thunder", 6);
        Animal preguica2 = new Preguica("Lazy", 2);
        Animal cachorro3 = new Cachorro("Max", 8);
        Animal cavalo3 = new Cavalo("Storm", 5);
        Animal preguica3 = new Preguica("Slow", 4);
        Animal cachorro4 = new Cachorro("Bobby", 2);


        Zoologico zoologico = new Zoologico();

        // Adicionando animais às jaulas do zoológico
        zoologico.adicionarAnimal(0, cachorro);
        zoologico.adicionarAnimal(1, cavalo);
        zoologico.adicionarAnimal(2, preguica);
        zoologico.adicionarAnimal(3, cachorro2);
        zoologico.adicionarAnimal(4, cavalo2);
        zoologico.adicionarAnimal(5, preguica2);
        zoologico.adicionarAnimal(6, cachorro3);
        zoologico.adicionarAnimal(7, cavalo3);
        zoologico.adicionarAnimal(8, preguica3);
        zoologico.adicionarAnimal(9, cachorro4);

        // Mostrar todos os animais no zoológico e suas ações
        zoologico.mostrarAnimais();
    }
}
