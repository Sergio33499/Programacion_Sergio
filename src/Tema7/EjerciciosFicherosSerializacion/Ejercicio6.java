package Tema7.EjerciciosFicherosSerializacion;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Persona> listaOriginal = new ArrayList<>();
        listaOriginal.add(new Persona("Ana", 30));
        listaOriginal.add(new Persona("Luis", 22));
        listaOriginal.add(new Persona("Marta", 28));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            oos.writeObject(listaOriginal);
            System.out.println("Lista guardada con éxito en personas.dat\n");
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            ArrayList<Persona> listaLeida = (ArrayList<Persona>) ois.readObject();

            System.out.println("Datos recuperados del archivo:");
            for (Persona p : listaLeida) {
                System.out.println("Nombre: " + p.getNombre() + " | Edad: " + p.getEdad());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}