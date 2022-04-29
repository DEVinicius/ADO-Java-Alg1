package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Faça um algoritmo que leia um número inteiro diferente de zero e diga se este é positivo ou negativo

        Scanner scanner = new Scanner(System.in);
        boolean isNumberEqualZero = true;
        int number = 0;

        while (isNumberEqualZero) {
            System.out.println("Digite um numero maior que zero: ");
            number = scanner.nextInt();

            if(number != 0) {
                isNumberEqualZero = false;
            }
        }

        if (number > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }

    }
}
