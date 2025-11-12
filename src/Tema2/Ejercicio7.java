package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dos numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resta;
        int resta2;

        if (num1 > num2){
            resta = num1 - num2;
            System.out.println("El resultado de restar el mas grande al mas pequeño es: " + resta);
        }else{
            resta2 = num2 - num1;
            System.out.println("El resultado de restar el mas grande al mas pequeño es: " + resta2);
        }

    }
}