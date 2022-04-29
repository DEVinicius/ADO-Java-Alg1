package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        /*
        * Entrar com dois números reais e imprimir a
        * média aritmética com a mensagem “média: “ antes do resultado
        * */

        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        System.out.println("media: " + ((num1 + num2)/2));
    }
}
