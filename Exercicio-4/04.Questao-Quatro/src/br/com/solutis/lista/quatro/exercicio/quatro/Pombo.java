package br.com.solutis.lista.quatro.exercicio.quatro;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura,
                 double peso, int quantidadePatas, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas, quantidadeAssas, envergaduraAssa);
    }

    @Override
    public void comer(double quantidade) {
        totalComida += quantidade;
        System.out.println("Pombo comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        voar(distancia);  // O movimento do pombo é voar
    }

    @Override
    public void dormir(int horas) {
         totalHorasDormida += horas;
        System.out.println("Pombo dormiu " + horas + " horas.");
    }

    @Override
    public void voar(double distancia) {
        totalDistanciaPecorrida += distancia;
        System.out.println("Pombo voou " + distancia + " metros.");
    }
}
