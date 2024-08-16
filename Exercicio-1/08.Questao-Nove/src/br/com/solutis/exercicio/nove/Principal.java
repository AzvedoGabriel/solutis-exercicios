package br.com.solutis.exercicio.nove;

public class Principal {
    // 9. Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("O quadrado de [%d] é %d \n", i, i * i);
        }
    }
}
