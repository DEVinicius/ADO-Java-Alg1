package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        /*
        * Faça um algoritmo que leia um número inteiro diferente de zero e diga
        * se este é positivo, negativo ou zero. Utilize a sequencia de
        * comandos se (if) encadeado
        * */

        int numero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero maior que zero: ");
        numero = scanner.nextInt();

        if(numero == 0) {
            System.out.println("Numero igual a Zero");
        } else if(numero > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero nagativo");
        }
    }
}
