package Tema2;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        int num;

        System.out.println("Dime numeros enteros positivos y un negativo para cerrar:");

        while ((num = scanner.nextInt()) >= 0) {
            suma += num;
            contador++;
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los numeros positivos es: " + media);
        } else {
            System.out.println("No se introdujeron numeros positivos");
        }
    }
}
