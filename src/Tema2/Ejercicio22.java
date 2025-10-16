package Tema2;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero entero:");
        int num = scanner.nextInt();

        num = Math.abs(num);

        int contador = 0;

        if (num == 0 ){
            contador = 1;
        }else{
            while (num > 0){
                num = num / 10;
                contador++;
            }
        }
        System.out.println("El numero tiene " + contador + " cifras");
    }
}
