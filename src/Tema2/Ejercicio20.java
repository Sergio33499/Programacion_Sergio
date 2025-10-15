package Tema2;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime um numero");
        int a = scanner.nextInt();

        System.out.println("Dime otro numero");
        int b = scanner.nextInt();

        if (b > a){
            for (int i = b; i >= a ; i--) {
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }
    }
}
