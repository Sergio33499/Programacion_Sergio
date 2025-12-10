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

    public static void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = pedirPalabraSecreta();

        int maxIntentos = 6;
        int fallosActuales = 0;

        String intentos = "";

        char[] palabraMostrada = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraMostrada[i] = '_';
        }

        while (fallosActuales < maxIntentos && String.valueOf(palabraMostrada).contains("_")) {
            System.out.println("\n===========================");
            dibujarAhorcado(fallosActuales);

            System.out.println("Palabra a adivinar: " + String.valueOf(palabraMostrada));
            System.out.println("Letras usadas: " + intentos);
            System.out.println("Intentos restantes: " + (maxIntentos - fallosActuales));
            System.out.println("===========================");

            System.out.println("Introduce una letra o la palabra completa para resolver:");
            String entrada = scanner.nextLine().toUpperCase();

            if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                char letra = entrada.charAt(0);

                if (intentos.contains(String.valueOf(letra))) {
                    System.out.println("Ya has intentado la letra '" + letra + "'.");
                    continue;
                }

                intentos += letra + " ";

                if (palabraSecreta.contains(String.valueOf(letra))) {
                    System.out.println("¡Acierto! La letra '" + letra + "' está en la palabra.");

                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        if (palabraSecreta.charAt(i) == letra) {
                            palabraMostrada[i] = letra;
                        }
                    }
                } else {
                    System.out.println("¡Fallo! La letra '" + letra + "' no está.");
                    fallosActuales++;
                }

            } else if (entrada.length() == palabraSecreta.length() && Character.isLetter(entrada.charAt(0))) {

                if (entrada.equals(palabraSecreta)) {
                    palabraMostrada = palabraSecreta.toCharArray();
                    System.out.println("¡ACIERTO! Has adivinado la palabra completa.");
                    break;
                } else {
                    System.out.println("¡Palabra incorrecta!");
                    fallosActuales++;
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduce una sola letra o la palabra completa.");
            }
        }

        System.out.println("\n*** JUEGO TERMINADO ***");
        dibujarAhorcado(fallosActuales);

        if (!String.valueOf(palabraMostrada).contains("_")) {
            System.out.println("¡VICTORIA! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("¡DERROTA! La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }


    public static void main(String[] args) {
        iniciarJuego();
    }
}
