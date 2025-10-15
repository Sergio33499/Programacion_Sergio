package Tema1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime dos numeros enteros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
        System.out.println("La suma de " + num1 + " - " + num2 + " es: " + (num1 - num2));
        System.out.println("La suma de " + num1 + " * " + num2 + " es: " + num1 * num2);
        System.out.println("La suma de " + num1 + " / " + num2 + " es: " + num1 / num2);
        System.out.println("La suma de " + num1 + " % " + num2 + " es: " + num1 % num2);





    }

}


