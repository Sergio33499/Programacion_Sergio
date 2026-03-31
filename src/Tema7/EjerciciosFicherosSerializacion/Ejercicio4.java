package Tema7.EjerciciosFicherosSerializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            Persona persona = new Persona("Pepe",44);
            oos.writeObject(persona);
            System.out.println("Objeto serializado correctamente en persona.dat");
        } catch (IOException e) {
            System.out.println("Error al escribir el objeto: " + e.getMessage());
        }
    }
}
