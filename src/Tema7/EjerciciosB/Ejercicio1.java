package Tema7.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("numeros.txt");

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        boolean archivoVacio = true;

        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextInt()) {
                int numeroActual = lector.nextInt();
                archivoVacio = false;

                if (numeroActual > maximo) {
                    maximo = numeroActual;
                }

                if (numeroActual < minimo) {
                    minimo = numeroActual;
                }
            }

            if (!archivoVacio) {
                System.out.println("El valor máximo es: " + maximo);
                System.out.println("El valor mínimo es: " + minimo);
            } else {
                System.out.println("El archivo está vacío o no contiene números válidos.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el archivo 'numeros.txt'.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}