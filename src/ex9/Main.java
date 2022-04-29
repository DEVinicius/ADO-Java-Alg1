package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
            carioca
            paulista
            mineiro
            outros estados
        * */

        Scanner scanner = new Scanner(System.in);
        String estado = "";

        System.out.println("Digite a sigla de um estado");
        estado = scanner.next();

        if(estado.toUpperCase() == "SP") {
            System.out.println("Paulista");
        } else if(estado.toUpperCase()  == "RJ") {
            System.out.println("Carioca");
        } else if(estado.toUpperCase() == "MG") {
            System.out.println("Mineiro");
        } else {
            System.out.println("Outros Estados");
        }
    }
}
