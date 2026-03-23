package Tema7.EjerciciosB;

import java.io.*;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo de origen (lectura): ");
        String nombreA = teclado.nextLine();
        System.out.print("Introduce el nombre del archivo de destino (escritura): ");
        String nombreB = teclado.nextLine();

        List<String> lineas = new ArrayList<>();

        try (Scanner lectorArchivo = new Scanner(new File(nombreA))) {
            while (lectorArchivo.hasNextLine()) {
                lineas.add(lectorArchivo.nextLine());
            }
            System.out.println("Archivo leído correctamente. Líneas encontradas: " + lineas.size());

            Collections.sort(lineas);

            try (PrintWriter escritor = new PrintWriter(new File(nombreB))) {
                for (String linea : lineas) {
                    escritor.println(linea);
                }
                System.out.println("Archivo '" + nombreB + "' generado con éxito.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el archivo de origen.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}