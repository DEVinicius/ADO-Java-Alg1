package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Entrar comum número e informar se ele é
        * divisível lpor 10, por 5, por2 ouse não é
        * divisível por nenhum destes.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        float numero = scanner.nextFloat();

        if(numero % 10 == 0) {
            System.out.println("Numero divisivel por 10");
        } else if(numero % 5 == 0) {
            System.out.println("Numero divisivel por 5");
        } else if (numero % 2 == 0) {
            System.out.println("Numero divisivel por 2");
        } else {
            System.out.println("Numero nao divisivel");
        }
    }
}
