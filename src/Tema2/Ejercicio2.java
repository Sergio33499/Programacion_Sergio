package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la base del rectangulo");
        int base = scanner.nextInt();
        System.out.println("Dime la altura del rectangulo");
        int altura = scanner.nextInt();

        int area = base * altura;

        int perimetro = 2 * (base + altura);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

    }
}
