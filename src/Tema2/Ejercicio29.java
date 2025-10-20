package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numSecreto = random.nextInt(101);
        System.out.println(numSecreto);


        System.out.println("Adivina el numero secreto!");
        System.out.println("Dime un numero del 1-100");
        int numeroAdivinar = scanner.nextInt();


        while (numeroAdivinar != numSecreto){
            if (numeroAdivinar > numSecreto){
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("El numero secreto es mayor");
            }
            System.out.println("Intentalo de nuevo");
            numeroAdivinar = scanner.nextInt();
        }
        System.out.println("Has acertado el numero");
    }
}
