package br.com.solutis.exercicio.doze;

import java.util.Scanner;

public class QuestaoDoze {
//    12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um
//    motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e
//    a quantidade de combustível em litros utilizados para cada tanque cheio.
//    Desenvolva um aplicativo Java que receba como entrant os quilômetros dirigidos e os
//    litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir o
//    consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a
//    soma total de litros de combustível consumidos até esse ponto. Todos os cálculos de
//    média devem produzir resultados de ponto flutuante.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKm = 0;
        int totalLitros = 0;
        char cadastroNovo;

        do {
            System.out.print("Informe os quilômetros dirigidos: ");
            int km = scanner.nextInt();
            System.out.print("Informe os litros de gasolina consumidos: ");
            int litros = scanner.nextInt();


            double consumoPorLitro = (double) km / litros;
            System.out.printf("Consumo para este tanque: %.2f km/l%n", consumoPorLitro);

            totalKm += km;
            totalLitros += litros;

            double consumoTotal = (double) totalKm / totalLitros;
            System.out.printf("Quilometragem combinada: %d km%n", totalKm);
            System.out.printf("Soma total de litros consumidos: %d L%n", totalLitros);
            System.out.printf("Consumo médio total: %.2f km/l%n", consumoTotal);

            System.out.print("Deseja registrar outro tanque? (s/n): ");
            cadastroNovo = scanner.next().toLowerCase().charAt(0);

        } while (cadastroNovo == 's');

        scanner.close();
    }
}
