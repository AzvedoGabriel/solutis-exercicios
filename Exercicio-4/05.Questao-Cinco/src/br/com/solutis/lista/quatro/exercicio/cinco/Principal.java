package br.com.solutis.lista.quatro.exercicio.cinco;

import br.com.solutis.lista.quatro.exercicio.quatro.Peixe;
import br.com.solutis.lista.quatro.exercicio.quatro.Pombo;
import br.com.solutis.lista.quatro.exercicio.tres.Cachorro;
import br.com.solutis.lista.quatro.exercicio.tres.Elefante;
import br.com.solutis.lista.quatro.exercicio.tres.Gato;
import br.com.solutis.lista.quatro.exercicio.tres.Leao;

public class Principal {
    public static void main(String[] args) {
        // Instanciar e chamar métodos dos animais
        Cachorro cachorro = new Cachorro("Bolt", "Cachorro", 3,
                "Casa", 0.5, 20.0, 4);
        Gato gato = new Gato("Whiskers", "Gato", 2,
                "Apartamento", 0.3, 5.0, 4);
        Elefante elefante = new Elefante("Dumbo", "Elefante", 10, "Savannah",
                3.0, 5000.0, 4);
        Leao leao = new Leao("Simba", "Leão", 5,
                "Selva", 1.2, 190.0, 4);
        Peixe peixe = new Peixe("Nemo", "Peixe-palhaço", 2,
                "Oceano", 0.1, 0.2);
        Pombo pombo = new Pombo("Pomba Branca", "Pombo", 1,
                "Cidade", 0.3, 0.4, 2, 2, 0.5);
        System.out.println("-----------------------------------------------");
        // Cachorro
        cachorro.comer(5);
        cachorro.moverse(100); // Cachorro andando
        cachorro.dormir(8);
        System.out.println("-----------------------------------------------");
        // Gato
        gato.comer(3);
        gato.moverse(13); // Gato andando
        gato.dormir(10);
        System.out.println("-----------------------------------------------");
        // Elefante
        elefante.comer(50);
        elefante.moverse(500); // Elefante andando
        elefante.dormir(3);
        System.out.println("-----------------------------------------------");
        // Leão
        leao.comer(20);
        leao.moverse(500); // Leão andando
        leao.dormir(12);
        System.out.println("-----------------------------------------------");
        // Peixe
        peixe.comer(2);
        peixe.moverse(30); // Peixe nadando
        peixe.dormir(4);
        System.out.println("-----------------------------------------------");
        // Pombo
        pombo.comer(5);
        pombo.moverse(200); // Pombo voando
        pombo.dormir(6);
    }
}
