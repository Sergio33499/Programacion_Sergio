package Tema3.Actividades_Arrays_Strings;

import java.util.Scanner;

public class JuegoLingo {


    public static String evaluarIntento(String secreta, String intento) {
        int longitud = 5;

        char[] hintArray = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            hintArray[i] = '-';
        }

        boolean[] secretaUsada = new boolean[longitud];

        System.out.println("  > Ejecutando Etapa 1: Buscando aciertos exactos (*)...");

        for (int i = 0; i < longitud; i++) {
            if (intento.charAt(i) == secreta.charAt(i)) {
                hintArray[i] = '*';
                secretaUsada[i] = true;
            }
        }

        for (int i = 0; i < longitud; i++) {
            if (hintArray[i] == '-') {
                for (int j = 0; j < longitud; j++) {
                    if (intento.charAt(i) == secreta.charAt(j) && !secretaUsada[j]) {
                        hintArray[i] = '0';
                        secretaUsada[j] = true;
                        break;
                    }
                }
            }
        }

        return String.valueOf(hintArray);
    }

    public static void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        int longitudRequerida = 5;
        int maxIntentos = 5;
        String palabraSecreta = "";

        do {
            System.out.print("JUGADOR 1: Escribe la palabra secreta (" + longitudRequerida + " letras): ");
            palabraSecreta = scanner.nextLine().toUpperCase();

            if (palabraSecreta.length() != longitudRequerida || !contieneSoloLetras(palabraSecreta)) {
                System.out.println("Error: La palabra debe ser de 5 letras alfabéticas. Vuelve a intentarlo.");
            }
        } while (palabraSecreta.length() != longitudRequerida || !contieneSoloLetras(palabraSecreta));


        for (int k = 0; k < 50; k++) {
            System.out.println();
        }
        System.out.println("Consola despejada. Jugador 2, ¡es tu turno!");


        for (int intentoActual = 1; intentoActual <= maxIntentos; intentoActual++) {
            System.out.println("\n--- Intento " + intentoActual + " de " + maxIntentos + " ---");

            String intentoUsuario = pedirIntentoValido(scanner, longitudRequerida);

            String resultadoHint = evaluarIntento(palabraSecreta, intentoUsuario);
            System.out.println("Hint: " + resultadoHint);

            if (resultadoHint.equals("*****")) {
                System.out.println("\nHas adivinado la palabra: " + palabraSecreta);
                scanner.close();
                return;
            }
        }

        System.out.println("\nHas agotado tus " + maxIntentos + " intentos.");
        System.out.println("La palabra secreta era: " + palabraSecreta);

        scanner.close();
    }

    public static String pedirIntentoValido(Scanner scanner, int longitudRequerida) {
        String intento;
        boolean entradaValida;

        do {
            System.out.print("Introduce tu palabra (" + longitudRequerida + " letras): ");
            intento = scanner.nextLine().toUpperCase();

            if (intento.length() != longitudRequerida) {
                System.out.println("Error: La palabra debe tener exactamente " + longitudRequerida + " letras.");
                entradaValida = false;
            } else if (!contieneSoloLetras(intento)) {
                System.out.println("Error: La palabra debe contener solo caracteres alfabéticos.");
                entradaValida = false;
            } else {
                entradaValida = true;
            }
        } while (!entradaValida);

        return intento;
    }


    public static boolean contieneSoloLetras(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c < 'A' || c > 'Z') {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        iniciarJuego();
    }
}
