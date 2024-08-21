package br.com.solutis.lista.quatro.exercicio.tres;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;
import br.com.solutis.lista.quatro.exercicio.quatro.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, String tipoAnimal, int idade, String habitat,
                    double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(double quantidadeIngerida) {
        totalComida += quantidadeIngerida;
        System.out.println("Elefante comeu: " + quantidadeIngerida + " frutas no dia");
    }

    @Override
    public void moverse(double distanciaPecorrida) {
        andar(distanciaPecorrida);
    }

    @Override
    public void dormir(int sonoTotalHoras) {
        totalHorasDormida += sonoTotalHoras;
        System.out.println("Elefante dormiu: " + sonoTotalHoras + " horas no dia");
    }

    @Override
    public void andar(double distanciaCaminhada) {
        totalDistanciaPecorrida += distanciaCaminhada;
        System.out.println("Elefante caminhou: " + distanciaCaminhada + " Km de distância");
    }
}

