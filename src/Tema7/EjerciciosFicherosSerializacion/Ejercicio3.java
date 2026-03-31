package Tema7.EjerciciosFicherosSerializacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))){
            String linea;
            while ((linea = br.readLine()) != null){
                linea = linea.trim();
                if (!linea.isEmpty()){
                    String[] array = linea.split("\\s+");
                    totalPalabras += array.length;
                }
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo: + " + e.getMessage());
        }
        System.out.println("El número total de palabras es: " + totalPalabras);
    }
}
