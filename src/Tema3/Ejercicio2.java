package Tema3;

import java.util.Scanner;

public class Ejercicio2 {

    public static int numberSign(int num){

        if (num == 0){
            return 0;
        } else if (num > 0) {
            return 1;
        }else{
            return -1;
        }
    }

    boolean isAdult(int edad){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una edad: ");
        edad = scanner.nextInt();

        return true;


    }



    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


    }
}
