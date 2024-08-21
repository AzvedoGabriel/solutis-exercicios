package br.com.solutis.lista.quatro.exercicio.tres;

import br.com.solutis.lista.quatro.exercicio.dois.AnimalAB;
import br.com.solutis.lista.quatro.exercicio.quatro.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat,
                    double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(double quantidadeIngerida) {
        totalComida += quantidadeIngerida;
        System.out.println("Cachorro comeu: " + quantidadeIngerida + " potes de ração");
    }

    @Override
    public void moverse(double distanciaPecorrida) {
        andar(distanciaPecorrida);
    }

    @Override
    public void dormir(int sonoTotalHoras) {
        totalHorasDormida += sonoTotalHoras;
        System.out.println("Cachorro dormiu: " + sonoTotalHoras + " horas no dia");
    }

    @Override
    public void andar(double distanciaCaminhada) {
        totalDistanciaPecorrida += distanciaCaminhada;
        System.out.println("Cachorro correu: " + distanciaCaminhada + " Km de distância");
    }
}

