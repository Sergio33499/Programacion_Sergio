package Tema7.EjerciciosFicherosSerializacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        try (PrintWriter pw = new PrintWriter(new FileWriter("usuario.txt"))) {
            pw.println("Nombre: " + nombre);
            pw.println("Edad: " + edad);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Archivo guardado con e xito");


    }
}
