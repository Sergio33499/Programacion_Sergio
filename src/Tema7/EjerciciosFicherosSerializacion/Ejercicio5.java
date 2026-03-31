package Tema7.EjerciciosFicherosSerializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio5 {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.out.println("Error: No se ha encontrado la clase necesaria para recuperar el objeto.");
            e.printStackTrace();
        }
    }
}
