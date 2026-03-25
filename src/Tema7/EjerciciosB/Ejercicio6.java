package Tema7.EjerciciosB;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número a buscar: ");
        String buscar = scanner.nextLine();
        int longitud = buscar.length();

        if (longitud == 0){
            System.out.println("No has introducido ningun numero");
            return;
        }

        try (FileReader fr = new FileReader("C:\\Users\\sergi\\IdeaProjects\\Programacion_Sergio\\src\\Documentos\\pi-million.txt");
             BufferedReader br = new BufferedReader(fr)) {

            StringBuilder ventana = new StringBuilder();
            boolean encontrado = false;
            int caracterLeido;

            int i = 0;
            while (i < longitud && (caracterLeido = br.read()) != -1) {
                ventana.append((char) caracterLeido);
                i++;
            }
            while (!encontrado && (caracterLeido = br.read()) != -1){
                if (ventana.toString().equals(buscar)){
                    encontrado = true;
                }else {
                    ventana.deleteCharAt(0);
                    ventana.append((char) caracterLeido);
                }
            }
            if (!encontrado && ventana.toString().equals(buscar)) {
                encontrado = true;
            }
            if (encontrado) {
                System.out.println("El número " + buscar + " aparece en el primer millón de decimales.");
            } else {
                System.out.println("El número no aparece.");
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
