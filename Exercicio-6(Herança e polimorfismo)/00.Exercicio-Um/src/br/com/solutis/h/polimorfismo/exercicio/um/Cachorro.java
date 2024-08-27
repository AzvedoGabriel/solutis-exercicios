package br.com.solutis.h.polimorfismo.exercicio.um;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("BARK BARK");
    }
}
