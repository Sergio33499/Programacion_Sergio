package Tema5.ActividadesColecciones.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void leerEntero(){
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            System.out.println("Introduce un numero entero: ");
            num = scanner.nextInt();
            System.out.println("Valor introducido: " + num);
        }catch (InputMismatchException e){
            System.out.println("valor introducido incorrecto");
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }

    public static void main(String[] args){
        leerEntero();
    }
}
