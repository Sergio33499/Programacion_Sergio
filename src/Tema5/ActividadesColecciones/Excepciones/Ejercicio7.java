package Tema5.ActividadesColecciones.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static class Gato{
        private String nombre;
        private int edad;

        public Gato(String nombre, int edad)throws Exception{
            setNombre(nombre);
            setEdad(edad);
        }

        public void setNombre(String nombre)throws  Exception{
            if (nombre.length() < 3){
                throw new Exception("El nombre tiene que tener 3 caracteres");
            }else {
                this.nombre = nombre;
            }
        }

        public void setEdad(int edad)throws Exception{
            if (edad < 0){
                throw new Exception("La edad no puede ser negativa.");
            }else {
                this.edad = edad;
            }
        }

        public String getNombre(){
            return nombre;
        }

        public int getEdad(){
            return edad;
        }

        public void imprimir(){
            System.out.println("Gato [Nombre: " + nombre + ", Edad: " + edad + "]");
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        int edad;
        String nombre;
        int contador = 0;
        while (contador < 5){
            try {
                System.out.println("Gato numero " + (contador + 1));
                System.out.println("Introduce el nombre: ");
                nombre = scanner.nextLine();
                System.out.println("Introduce la edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();
                Gato miGato = new Gato(nombre,edad);
                listaGatos.add(miGato);
                contador++;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
                scanner.nextLine();
            }
        }
        System.out.println("\n---- Gatos introducidos ----");
        for (Gato g : listaGatos){
            g.imprimir();
        }
    }
}
