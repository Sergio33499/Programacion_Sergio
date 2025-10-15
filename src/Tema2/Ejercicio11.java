package Tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 3 numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num2 == num1 + 1 && num3 == num2 + 1 || num1 == num2 +1 && num2 == num3 + 1){
            System.out.println("Los numeros son consecutivos");
        }else{
            System.out.println("Los numeros no son consecutivos");
        }


    }
}
