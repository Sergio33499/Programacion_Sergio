package Tema2;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean esPrimo = true;
        if (num < 2){
            esPrimo = false;
        }else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }


    }
}
