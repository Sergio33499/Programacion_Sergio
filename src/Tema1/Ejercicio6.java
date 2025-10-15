package Tema1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el valor de R");

        int R = scanner.nextInt();

        double A = 3.14 * R * R;

        System.out.println("El area del circulo es: " + A);


    }

}


