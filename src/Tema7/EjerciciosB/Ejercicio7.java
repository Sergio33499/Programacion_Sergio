package Tema7.EjerciciosB;

import java.io.*;
import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\sergi\\IdeaProjects\\Programacion_Sergio\\src\\Documentos\\Libros\\quijote_cervantes.txt");

        int totalLineas = 0;
        int totalPalabras = 0;
        int totalCaracteres = 0;

        Map<String, Integer> frecuencias = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;
                totalCaracteres += linea.length();

                String[] palabrasEnLinea = linea.split("\\s+");

                for (String p : palabrasEnLinea) {
                    String limpia = p.toLowerCase().replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "");

                    if (!limpia.isEmpty()) {
                        totalPalabras++;
                        frecuencias.put(limpia, frecuencias.getOrDefault(limpia, 0) + 1);
                    }
                }
            }

            System.out.println("--- ESTADÍSTICAS DEL ARCHIVO ---");
            System.out.println("Líneas: " + totalLineas);
            System.out.println("Palabras: " + totalPalabras);
            System.out.println("Caracteres: " + totalCaracteres);
            System.out.println("--------------------------------");

            mostrarTop10(frecuencias);

        } catch (IOException e) {
            System.out.println("Error al procesar el libro: " + e.getMessage());
        }
    }

    private static void mostrarTop10(Map<String, Integer> mapa) {
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());

        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Las 10 palabras más comunes:");
        for (int i = 0; i < Math.min(10, lista.size()); i++) {
            Map.Entry<String, Integer> entrada = lista.get(i);
            System.out.println((i + 1) + ". " + entrada.getKey() + ": " + entrada.getValue() + " veces");
        }
    }
}