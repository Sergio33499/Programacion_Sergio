package Tema2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el lado del cuadrado");

        int lado = scanner.nextInt();
        int area =  lado * lado;
        int perimetro = 4 * lado;

        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);


    }
}