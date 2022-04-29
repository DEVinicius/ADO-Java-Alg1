package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Faça um algoritmo para determinar o consumo médio de um automóvel, considerando que a
        * distância total percorrida e o total de combustível gasto são fornecidos.
        * */

        float distancia = 0;
        float combustivelGasto = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida (Km): ");
        distancia = scanner.nextFloat();

        System.out.println("Digite o total de combustivel gasto em L: ");
        combustivelGasto = scanner.nextFloat();

        System.out.println("O consumo médio foi de " + (distancia/combustivelGasto) + " km/L");
    }
}
