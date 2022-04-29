package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        /*
        * Desenhe um algoritmo que leia uma temperatura em graus Celsius e a
        * apresente convertida em graus Fahrenheit. A fórmula de conversão
        * é: F = (9 * C + 160) / 5, sendo F a temperatura em graus Fahrenheit e C,
        * a temperatura em graus Celsius.
        * */

        double temperaturaCelsius = 0;
        double temperaturaFahrenheint = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius");
        temperaturaCelsius = scanner.nextDouble();

        temperaturaFahrenheint =(9 * temperaturaCelsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheint eh: " + temperaturaFahrenheint + " F");
        return;
    }
}
