package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime 3 numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El " + num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El " + num2 + " es el mayor");
        }else{
            System.out.println("El " + num3 + " es el mayor");
        }


    }
}
