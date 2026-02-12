package Tema5.ActividadesColecciones.Excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

    public static void crearVector(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        int posicion = 0;
        while (posicion >= 0){
            try {
                System.out.println("Introduce la posicion: ");
                posicion = scanner.nextInt();
                if (posicion >= 0){
                    System.out.println("Valor en la posicion " + posicion + ": " + array[posicion]);
                }
            }catch (InputMismatchException e){
                    System.out.println("El valor introducido es incorrecto.");
                    e.printStackTrace();
                    scanner.nextLine();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("La posicion se sale del array.");
                e.printStackTrace();
            }
        }
        System.out.println("Programa finalizado");
        scanner.close();
    }

    public static void main(String[] args){
        crearVector();
    }
}
