package Tema3;

import java.util.Scanner;

public class Ejercicio7 {

    public static boolean esPrimo(int num){
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = -1;

        System.out.println("Introduce una serie de numeros enteros positivos (0 para terminar)");

        while (num != 0){
            System.out.println("Numero: ");
            num = scanner.nextInt();

            if (num < 0){
                System.out.println("Por favor, introduce solo numeros positivos");
            } else if (num != 0) {
                if (esPrimo(num)){
                    System.out.println(num + " es primo");
                }else{
                    System.out.println(num + " no es primo");
                }
            }
        }
        System.out.println("Programa terminado");
    }
}
