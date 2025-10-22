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








        }






    }
}

