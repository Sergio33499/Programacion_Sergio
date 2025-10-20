package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        System.out.println(randomInt);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Dime un numero de 5 cifras:");
            int numLoteria = scanner.nextInt();

            if (numLoteria == randomInt){
                System.out.println("Has ganado la loteria");
            }else {
                System.out.println("No has ganado");
            }
        }

    }
}
