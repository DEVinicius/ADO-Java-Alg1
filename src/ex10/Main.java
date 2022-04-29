package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Faça um algoritmo que determine se um dado número é par ou impar
        * (utilize o operador resto (<dividendo> % <divisor>), que retorna
        *  o resto da divisão inteira.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        float numero = scanner.nextFloat();

        if(numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero Impar");
        }
    }
}
