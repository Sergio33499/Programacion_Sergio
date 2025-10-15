package Tema2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero");

        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("El numero introducido es positivo");
        }else if (numero < 0){
            System.out.println("El numero introducido es negativo");
        }else {
            System.out.println("El numero es 0");
        }
    }
}
