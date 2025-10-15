package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la base del triangulo");
        int base = scanner.nextInt();

        System.out.println("Dime la altura del triangulo");
        int altura = scanner.nextInt();

        int area = base * altura / 2;

        System.out.println("El area del triangulo es: " + area);
    }
}
