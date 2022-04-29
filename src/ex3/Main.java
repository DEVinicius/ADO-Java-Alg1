package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Entrar com quatro números e imprimir a média ponderada,
        * sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4
        * */

        Scanner scanner = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float num4 = 0;

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextFloat();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextFloat();

        System.out.println("Digite o terceiro numero");
        num3 = scanner.nextFloat();

        System.out.println("Digite o quarto numero");
        num4 = scanner.nextFloat();

        System.out.println("A media ponderada eh: " + ((num1 + (num2 * 2) + (num3 * 3) + (num4 * 4))/10));
    }
}
