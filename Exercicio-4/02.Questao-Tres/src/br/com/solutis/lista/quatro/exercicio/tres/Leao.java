package br.com.solutis.lista.quatro.exercicio.tres;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;
import br.com.solutis.lista.quatro.exercicio.quatro.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, String tipoAnimal, int idade, String habitat,
                double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(double quantidadeIngerida) {
        totalComida += quantidadeIngerida;
        System.out.println("O leão caçou: " + quantidadeIngerida + " animais no dia");
    }

    @Override
    public void moverse(double distanciaPecorrida) {
        andar(distanciaPecorrida);
    }

    @Override
    public void dormir(int sonoTotalHoras) {
        totalHorasDormida += sonoTotalHoras;
        System.out.println("O leão dorme: " + sonoTotalHoras + " horas no dia");
    }

    @Override
    public void andar(double distanciaCaminhada) {
        totalComida += distanciaCaminhada;
        System.out.println("O leão correu: " + distanciaCaminhada + " km no dia");
    }
}
