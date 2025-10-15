package Tema2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        }



    }
}
