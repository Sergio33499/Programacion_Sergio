package Tema3;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean isAdult(int edad){
        Scanner scanner = new Scanner(System.in);

        return edad >= 18;

    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Ejercicio1.numberSign(1);
        Ejercicio1.main(args);


        System.out.println("Dime tu edad: ");
        int edad = scanner.nextInt();

        if (isAdult(edad)){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("No eres mayor de edad.");
        }

    }
}
