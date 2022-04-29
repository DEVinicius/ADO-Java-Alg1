package ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Faça um algoritmo que  leia 3 valores que representam os lados de um triângulo,
        * verifique se os três lados formam um triângulo: cada lado
        * deve ser menor do que a soma dos outros dois
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do triangulo: ");
        float lado1 = scanner.nextFloat();

        System.out.println("Digite o valor do lado do triangulo: ");
        float lado2 = scanner.nextFloat();

        System.out.println("Digite o valor do lado do triangulo: ");
        float lado3 = scanner.nextFloat();

        boolean isFirstPartValid = (lado1 < (lado2 + lado3)) ? true : false;
        boolean isSecondPartValid = (lado2 < (lado1 + lado3)) ? true : false;
        boolean isThirdPartValid = (lado3 < (lado2 + lado1)) ? true : false;

        if(isFirstPartValid && isSecondPartValid && isThirdPartValid) {
            System.out.println("Lados Validos. Podem formar um triangulo");
        } else {
            System.out.println("Lados Invalidos. Nao sera possivel formar um triangulo");
        }
    }
}
