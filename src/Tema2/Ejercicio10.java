package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 3 numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los numeros estan ordenados de menor a mayor");
        }else {
            System.out.println("Los numeros no estan ordenados de menor a mayor");
        }
    }
}