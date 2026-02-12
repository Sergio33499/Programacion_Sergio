package Tema5.ActividadesColecciones.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void crearVector(){
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];
        int contador = 0;

        while (contador < 5){
            try {
                System.out.println("Introduce los valores enteros: ");
                valores[contador] = scanner.nextDouble();
                contador++;
            }catch (InputMismatchException e){
                System.out.println("Has introducido un valor incorrecto.");
                e.printStackTrace();
                scanner.nextLine();
            }
        }
        scanner.close();
        System.out.println("Array rellenado con exito.");
    }

    public static void main(String[] args){
        crearVector();
    }
}
