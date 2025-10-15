package Tema2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una D o una E");
        char letra = scanner.next().charAt(0);

        if (letra == 'D' || letra == 'd'){
            System.out.println("Introduce una cantidad de euros:");

            int euros = scanner.nextInt();

            double dolares = euros * 1.08;

            System.out.println("La cantidad de € que has introducido son: " + dolares + " dolares");
        } else if (letra == 'E' || letra == 'e') {

            System.out.println("Introduce una cantidad de dolares:");
            int dolares = scanner.nextInt();

            double euros = dolares / 1.08;

            System.out.println("La cantidad de $ que has introducido son: " + euros + " euros");
        }else {
            System.out.println("Opcion no valida, debes introducir una D o una E");
        }
    }
}

