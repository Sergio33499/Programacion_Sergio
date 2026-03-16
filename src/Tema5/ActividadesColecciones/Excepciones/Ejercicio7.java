package Tema5.ActividadesColecciones.Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {


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
