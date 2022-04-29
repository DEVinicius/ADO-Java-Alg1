package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrar com um número e informar se ele é ou não divisível por 5.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        float numero = scanner.nextFloat();

        if(numero % 5 == 0) {
            System.out.println("Numero divisivel por 5");
        } else {
            System.out.println("Numero nao divisivel por 5");
        }

        return;
    }
}
