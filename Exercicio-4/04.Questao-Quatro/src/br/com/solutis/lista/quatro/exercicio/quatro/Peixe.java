package br.com.solutis.lista.quatro.exercicio.quatro;

public class Peixe extends AnimalMarinhoAB{

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    @Override
    public void nadar(double distanciaPecorrida) {
        totalDistanciaPecorrida  += distanciaPecorrida;
        System.out.println("Peixe nadou: " + distanciaPecorrida + " metros");
    }

    @Override
    public void comer(double quantidadeIngerida) {
        totalComida  += quantidadeIngerida;
        System.out.println("Peixe comeu: " + quantidadeIngerida + " unidades de comida");
    }

    @Override
    public void moverse(double distanciaPecorrida) {
        nadar(distanciaPecorrida);
    }

    @Override
    public void dormir(int sonoTotalHoras) {
        totalHorasDormida  += sonoTotalHoras;
        System.out.println("Peixe dormiu: " + sonoTotalHoras + " horas");
    }
}
