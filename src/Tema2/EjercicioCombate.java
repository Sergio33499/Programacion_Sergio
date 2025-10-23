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

       int vidaMax1 = vidaJ1;
       int vidaMax2 = vidaJ2;

       while (vidaJ1 > 0 && vidaJ2 > 0){
           System.out.println("\n--- Turno " + turno + " ---");

           //Decidir quien ataca primero por el que tenga mayor velocidad
           double factorAtaque;
           double factorDefensa;
           int daño1;
           int daño2;

           if (velocidadJ1 >= velocidadJ2){
               //Jugador 1 ataca
               factorAtaque = 0.6 + rand.nextDouble() * 0.4;
               factorDefensa = 0.2 + rand.nextDouble() * 0.4;

               daño1 = (int) Math.round((ataqueJ1 * factorAtaque) - (defensaJ2 * factorDefensa));
               if (daño1 < 1){
                   daño1 = 1;
               }
               vidaJ2 -= daño1;
               if (vidaJ2 < 0){
                   vidaJ2 = 0;
               }
               System.out.println("Jugador 1 ataca e inflinge " + daño1 + " de daño.");

               //Si el jugador 2 sigue vivo contraataca

               if (vidaJ2 > 0){
                   factorAtaque = 0.6 + rand.nextDouble() * 0.4;
                   factorDefensa = 0.2 + rand.nextDouble() * 0.4;
                   daño2 = (int) Math.round((ataqueJ2 * factorAtaque) - (defensaJ1 * factorDefensa));
                   if (daño2 < 1){
                       daño2 = 1;
                   }
                   vidaJ1 -= daño2;
                   if (vidaJ1 < 0){
                       vidaJ1 = 0;
                   }
                   System.out.println("Jugador 2 ataca e inflinge " + daño2 + " de daño.");
               }

           }else {//Si la velocidad del jugador 2 es mayor
               factorAtaque = 0.6 + rand.nextDouble() * 0.4;
               factorDefensa = 0.2 + rand.nextDouble() * 0.4;
               daño2 = (int) Math.round((ataqueJ2 * factorAtaque) - (defensaJ1 * factorDefensa));
               if (daño2 < 1){
                   daño2 = 1;
               }
               if (vidaJ1 < 0){
                   vidaJ1 = 0;
               }
               System.out.println("Jugador 2 ataca e inflinge " + daño2 + " de daño.");

               //Si el jugador 1 sigue con vida contraataca
               if (vidaJ1 > 0){
                   factorAtaque = 0.6 + rand.nextDouble() * 0.4;
                   factorDefensa = 0.2 + rand.nextDouble() * 0.4;
                   daño1 = (int) Math.round((ataqueJ1 * factorAtaque) - (defensaJ2 * factorDefensa));
                   if (daño1 < 1){
                       daño1 = 1;
                   }
                   vidaJ2 -= daño1;
                   if (vidaJ2 < 0){
                       vidaJ2 = 0;
                   }
                   System.out.println("Jugador 1 ataca e inlfinge " + daño1 + " de daño");
               }
           }

           //Mostrar barra de vida de cada jugador
           System.out.println("Jugador1: [");
           int barra1 = (int) ((vidaJ1 * 20.0) / vidaMax1);
           for (int i = 0; i < 20; i++) {
               if (i < barra1){
                   System.out.print("-");
               }else {
                   System.out.println(" ");
               }
           }
           System.out.println("] " + vidaJ1 + " PV");

           System.out.println("Jugador2: [");
           int barra2 = (int) ((vidaJ2 * 20.0) / vidaMax2);
           for (int i = 0; i < 20; i++) {
               if (i < barra2){
                   System.out.print("-");
               }else {
                   System.out.println(" ");
               }
           }
           System.out.println("] " + vidaJ2 + " PV");
           turno++;
       }

       //Resultado final

       System.out.println("\n--- RESULTADO FINAL ---");
       if (vidaJ1 <= 0 && vidaJ2 <= 0){
           System.out.println("¡EMPATE! ambos jugadores han muerto");
       } else if (vidaJ1 <= 0) {
           System.out.println("GANA EL JUGADOR 2");
       }else{
           System.out.println("GANA EL JUGADOR 1");
       }


   }
}
