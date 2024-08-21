package br.com.solutis.lista.quatro.exercicio.dois;

import br.com.solutis.lista.quatro.exercicio.um.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    protected double totalComida;
    protected double totalDistanciaPecorrida;
    protected  int totalHorasDormida;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    @Override
    public abstract void comer(double quantidadeIngerida);

    @Override
    public abstract void moverse(double distanciaPecorrida);

    @Override
    public abstract void dormir(int sonoTotalHoras);



    public double getTotalComida() {
        return totalComida;
    }

    public double getTotalDistanciaPecorrida() {
        return totalDistanciaPecorrida;
    }

    public int getTotalHorasDormida() {
        return totalHorasDormida;
    }


}
