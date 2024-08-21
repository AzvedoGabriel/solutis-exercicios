package br.com.solutis.lista.quatro.exercicio.tres;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;
import br.com.solutis.lista.quatro.exercicio.quatro.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {


    public Gato(String nome, String tipoAnimal, int idade, String habitat,
                double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void andar(double distanciaCaminhada) {
        totalDistanciaPecorrida += distanciaCaminhada;
        System.out.println("O gato caminhou: " + distanciaCaminhada + " Km de distância dentro de casa");
    }

    @Override
    public void comer(double quantidadeIngerida) {
        totalComida += quantidadeIngerida;
        System.out.println("O gato comeu: " + quantidadeIngerida + " tigela no dia");
    }

    @Override
    public void moverse(double distanciaPecorrida) {
        andar(distanciaPecorrida);
    }

    @Override
    public void dormir(int sonoTotalHoras) {
        totalHorasDormida += sonoTotalHoras;
        System.out.println("O gato dormiu: " + sonoTotalHoras + " horas no dia");
    }
}

