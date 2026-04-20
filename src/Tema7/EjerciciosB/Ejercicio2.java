package Tema7.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Alumno {
    String nombreCompleto;
    double notaMedia;

    public Alumno(String nombre, String apellido, double media) {
        this.nombreCompleto = nombre + " " + apellido;
        this.notaMedia = media;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", nombreCompleto, notaMedia);
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        File archivo = new File("/home/serpuimar2/IdeaProjects/Programacion_Sergio/src/Documentos/alumnos_notas.txt");
        List<Alumno> listaAlumnos = new ArrayList<>();

        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split(" ");

                String nombre = partes[0];
                String apellido = partes[1];

                double suma = 0;
                int contadorNotas = 0;

                for (int i = 2; i < partes.length; i++) {
                    suma += Double.parseDouble(partes[i]);
                    contadorNotas++;
                }

                double media = 0;
                if (contadorNotas > 0) {
                    media = suma / contadorNotas;
                }
                listaAlumnos.add(new Alumno(nombre, apellido, media));
            }

            listaAlumnos.sort(Comparator.comparingDouble(Alumno::getNotaMedia).reversed());

            System.out.println("--- Notas Medias de Alumnos ---");
            for (Alumno a : listaAlumnos) {
                System.out.println(a);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encuentra el archivo 'alumnos_notas.txt'.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de nota no válido en el archivo.");
        }
    }
}