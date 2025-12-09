package Tema3.Actividades_Arrays_Strings;

import java.util.Scanner;

public class JuegoAhorcado {

    public static String pedirPalabraSecreta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("JUGADOR 1: Introduce la palabra secreta");
        String palabra = scanner.nextLine();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("Consola borrada! Jugador 2, es tu turno.");

        return palabra.toUpperCase();
    }

    public static void dibujarAhorcado(int fallos) {
        switch (fallos) {
            case 0:
                System.out.println("  --|");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("  -----");
                break;

            case 1:
                System.out.println("  --|");
                System.out.println("  O |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("  -----");
                break;

            case 2:
                System.out.println("  --|");
                System.out.println("  O |");
                System.out.println("  | |");
                System.out.println("    |");
                System.out.println("  -----");
                break;

            case 3:
                System.out.println("  --|");
                System.out.println("  O |");
                System.out.println(" /| |");
                System.out.println("    |");
                System.out.println("  -----");
                break;

            case 4:
                System.out.println("  --|");
                System.out.println("  O |");
                System.out.println(" /|\\|");
                System.out.println("    |");
                System.out.println("  -----");
                break;

            case 5:
                System.out.println("  --|");
                System.out.println("  O |");
                System.out.println(" /|\\|");
                System.out.println(" /  |");
                System.out.println("  -----");
                break;

            case 6:
                System.out.println("  --|");
                System.out.println("  O |");
                System.out.println(" /|\\|");
                System.out.println(" / \\|");
                System.out.println("  -----");
                System.out.println("¡DERROTA! EL AHORCADO ESTÁ COMPLETO.");
                break;

            default:
                System.out.println("Estado de intentos desconocido.");
                break;
        }
    }

    public static void iniciarJuego(){
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = pedirPalabraSecreta();

        int maxIntentos = 6;
        int fallosActuales = 0;

        String intentos = "";

        char[] palabraMostrada = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraMostrada[i] = '_';
        }

        while (fallosActuales < maxIntentos && String.valueOf(palabraMostrada).contains("_")){
            System.out.println("\n---------------------------");
            dibujarAhorcado(fallosActuales);

            System.out.println("Palabra a adivinar: " + String.valueOf(palabraMostrada));
            System.out.println("Letras usadas: " + intentos);
            System.out.println("Intentos restantes: " + (maxIntentos - fallosActuales));
            System.out.println("----------------------------");

            System.out.println("Introduce una letra o la palabra completa para resolver:");
            String entrada = scanner.nextLine().toUpperCase();
        }
    }


public static void main(String[] args) {

}
}
