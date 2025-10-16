package Tema2;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero entero:");
        int num = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
