package Tema3;

import java.util.Scanner;

public class Ejercicio1 {

    public static int numberSign(int num){

        if (num == 0){
            return 0;
        } else if (num > 0) {
            return 1;
        }else{
            return -1;
        }
    }

    public static void comprobarNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero entero: ");
        int numero = scanner.nextInt();

        int result = numberSign(numero);

        if (result == 1){
            System.out.println(result);
        }else if (result == -1){
            System.out.println(result);
        }else {
            System.out.println(result);
        }
    }

    public static void main(String[]args){

        comprobarNum();
    }
}
