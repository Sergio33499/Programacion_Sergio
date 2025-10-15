package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime 3 numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int mediaSinDecimales = (num1 + num2 + num3) / 3;
        double mediaConDecimales = (num1 + num2 + num3) / 3;

        System.out.println("La media de los 3 numeros introducidos es: " + mediaConDecimales);
        System.out.println("La media de los 3 numeros introducidos es: " + mediaSinDecimales);

    }
}
