package Tema3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void mostrarTabla(int num){
        System.out.println("Tabla de multiplicar del " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número del 1-10: ");
        num = scanner.nextInt();

        while (num < 1 || num > 10) {
                System.out.println("Número inválido. Intenta de nuevo.");

            System.out.print("Introduce un número del 1-10: ");
            num = scanner.nextInt();
        }

        mostrarTabla(num);    }
}
