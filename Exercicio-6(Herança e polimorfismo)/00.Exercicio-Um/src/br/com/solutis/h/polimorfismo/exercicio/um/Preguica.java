package br.com.solutis.h.polimorfismo.exercicio.um;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        // Não achei onomatopeia
        System.out.println("A preguiça está emitindo som!?");
    }

    @Override
    public void correr() {
        System.out.println("A preguiça não corre, mas sobe em árvores.");
    }
}
