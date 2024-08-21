package br.com.solutis.exercicio.lista.seis;

public class ConjQuestSeis {
    //6. Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo
    //é ¶ multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível em
    //Math.PI
    public static void main(String[] args) {
        double raio = 5;

        double areaCirculo = Math.PI * Math.pow(raio, 2);
        // Valor não está arredondado
        System.out.println("Área ocupada: " + areaCirculo);
        System.out.println("-----------------------------");
        System.out.println("Área ocupada arredondada: " + Math.round(areaCirculo));
    }
}
