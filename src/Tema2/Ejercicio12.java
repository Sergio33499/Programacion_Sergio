package Tema2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 3 numeros");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int mayor,medio,menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3){
                medio = num2;
                menor = num3;
            }else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3){
                medio = num1;
                menor = num3;
            }else{
                medio = num3;
                menor = num1;
            }
        }else {
            mayor = num3;
            if (num1 >= num2){
                medio = num1;
                menor = num2;
            }else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Los numeros ordenados de menor a mayor son: " + mayor + ", " + medio + ", " + menor);


    }
    }

