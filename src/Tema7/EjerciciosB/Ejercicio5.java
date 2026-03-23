package Tema7.EjerciciosB;

import java.io.*;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        File carpeta = new File("Diccionario");
        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("Carpeta 'Diccionario' creada.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
                return;
            }
        }

        File archivoDiccionario = new File("/home/serpuimar2/IdeaProjects/Programacion_Sergio/src/Documentos/diccionario.txt");

        try (Scanner lector = new Scanner(archivoDiccionario)) {
            while (lector.hasNextLine()) {
                String palabra = lector.nextLine().trim();

                if (!palabra.isEmpty()) {
                    char primeraLetra = Character.toUpperCase(palabra.charAt(0));

                    if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
                        escribirEnArchivoLetra(primeraLetra, palabra);
                    }
                }
            }
            System.out.println("Diccionario clasificado con éxito en la carpeta 'Diccionario'.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encuentra 'diccionario.txt'.");
        }
    }


    private static void escribirEnArchivoLetra(char letra, String palabra) {
        String rutaArchivo = "Diccionario" + File.separator + letra + ".txt";

        try (PrintWriter escritor = new PrintWriter(new FileWriter(rutaArchivo, true))) {
            escritor.println(palabra);
        } catch (IOException e) {
            System.out.println("Error escribiendo la palabra '" + palabra + "': " + e.getMessage());
        }
    }
}