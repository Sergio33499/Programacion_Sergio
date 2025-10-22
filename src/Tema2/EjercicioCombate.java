package Tema2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCombate {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

       int velocidadJ1 = 0,ataqueJ1 = 0,defensaJ1 = 0,vidaJ1 = 0;
       int velocidadJ2 = 0,ataqueJ2 = 0,defensaJ2 = 0,vidaJ2 = 0;
       int suma1, suma2;
       boolean valido1 = false, valido2 = false;

       System.out.println("----->EMPIEZA EL COMBATE<-----");

       //---JUGADOR 1---
       while (!valido1){
           System.out.println("Introduce los datos del Jugador1 (1-200)");
           System.out.println("Introduce la velocidad: ");
           velocidadJ1 = scanner.nextInt();
           System.out.println("Introduce el ataque: ");
           ataqueJ1 = scanner.nextInt();
           System.out.println("Introduce la defensa: ");
           defensaJ1 = scanner.nextInt();
           System.out.println("Introduce la vida: ");
           vidaJ1 = scanner.nextInt();

           suma1 = velocidadJ1 + ataqueJ1 + defensaJ1 + vidaJ1;

           if (velocidadJ1 < 1 || ataqueJ1 < 1 || defensaJ1 < 1 || vidaJ1 < 1 || velocidadJ1 > 200 || ataqueJ1 > 200 || defensaJ1 > 200 ||vidaJ1 > 200){
               System.out.println("ERROR: Los atributos tienen que estar entre 1-200");
           } else if (suma1 > 500) {
               System.out.println("ERROR: La suma de los atributos no puede superar 500");
           }else {
               valido1 = true;
           }
       }

       //---JUGADOR 2---
       while (!valido2){
           System.out.println("Introduce los datos del Jugador2 (1-200)");
           System.out.println("Introduce la velocidad: ");
           velocidadJ2 = scanner.nextInt();
           System.out.println("Introduce el ataque: ");
           ataqueJ2 = scanner.nextInt();
           System.out.println("Introduce la defensa: ");
           defensaJ2 = scanner.nextInt();
           System.out.println("Introduce la vida: ");
           vidaJ2 = scanner.nextInt();

           suma2 = velocidadJ2 + ataqueJ2 + defensaJ2 + vidaJ2;


           //Validaciones
           if (velocidadJ2 < 1 || ataqueJ2 < 1|| defensaJ2 < 1 || vidaJ2 < 1 || velocidadJ2 > 200 || ataqueJ2 > 200 || defensaJ2 > 200 || vidaJ2 > 200){
               System.out.println("ERROR: Los atributos tienen que estar entre 1-200");
           } else if (suma2 > 500) {
               System.out.println("ERROR: La suma de los atributos no puede superar 500");
           }else {
               valido2 = true;
           }
       }

       //---COMBATE---
       System.out.println("¡COMIENZA EL COMBATE!");
       int turno = 1;

       while (vidaJ1 > 0 && vidaJ2 > 0){
           System.out.println("\n--- Turno " + turno + " ---");

           //Decidir quien ataca primero
           if (velocidadJ1 >= velocidadJ2){

           }
       }








   }
}
