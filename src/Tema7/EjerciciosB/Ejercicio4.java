package Tema7.EjerciciosB;

import java.io.*;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        List<String> nombres = cargarArchivo("/home/serpuimar2/IdeaProjects/Programacion_Sergio/src/Documentos/usa_nombres.txt");
        List<String> apellidos = cargarArchivo("/home/serpuimar2/IdeaProjects/Programacion_Sergio/src/Documentos/usa_apellidos.txt");

        if (nombres.isEmpty() || apellidos.isEmpty()) {
            System.out.println("Error: No se pudieron cargar los archivos de base.");
            return;
        }

        System.out.print("Cuántos nombres aleatorios quieres generar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("¿A qué archivo deseas añadirlos? (ej: usa_personas.txt): ");
        String nombreArchivoDestino = teclado.nextLine();

        try (PrintWriter escritor = new PrintWriter(new FileWriter(nombreArchivoDestino, true))) {
            for (int i = 0; i < cantidad; i++) {
                String nombreAleatorio = nombres.get(random.nextInt(nombres.size()));
                String apellidoAleatorio = apellidos.get(random.nextInt(apellidos.size()));

                escritor.println(nombreAleatorio + " " + apellidoAleatorio);
            }
            System.out.println("Se han añadido " + cantidad + " nombres a " + nombreArchivoDestino);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static List<String> cargarArchivo(String ruta) {
        List<String> lineas = new ArrayList<>();
        try (Scanner lector = new Scanner(new File(ruta))) {
            while (lector.hasNextLine()) {
                lineas.add(lector.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + ruta);
        }
        return lineas;
    }
}