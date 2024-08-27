package br.com.solutis.h.polimorfismo.exercicio.um;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("brããã");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está a correr pelo pasto");
    }
}
