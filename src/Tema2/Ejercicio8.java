package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la cantidad de € que quieres convertir a $");

        int euros = scanner.nextInt();

        double dolares = euros * 1.08;

        System.out.println("La cantidad de € que has introducido son: " + dolares + " dolares");

    }
}
