package Tema1;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime dos numeros enteros");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
        System.out.println("La suma de " + num1 + " - " + num2 + " es: " + (num1 - num2));
        System.out.println("La suma de " + num1 + " * " + num2 + " es: " + num1 * num2);
        System.out.println("La suma de " + num1 + " / " + num2 + " es: " + num1 / num2);
        System.out.println("La suma de " + num1 + " % " + num2 + " es: " + num1 % num2);





    }

}


