package Tema1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime dos numeros enteros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("El numero mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.printf("El numero mayor es: " + num2);
        }else {
            System.out.println("Los numeros son iguales");
        }

    }

}


