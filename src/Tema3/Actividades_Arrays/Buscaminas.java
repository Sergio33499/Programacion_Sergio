package Tema3.Actividades_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static String[] contenido;
    public static boolean[] estadoVisible;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void inicializarTablero() {
        contenido = new String[20];
        estadoVisible = new boolean[20];

        for (int i = 0; i < contenido.length; i++) {
            contenido[i] = "0";
        }

        int minasColocadas = 0;
        while (minasColocadas < 6) {
            int posicion = random.nextInt(20);
            if (!contenido[posicion].equals("*")) {
                contenido[posicion] = "*";
                minasColocadas++;
            }
        }

        for (int i = 0; i < contenido.length; i++) {
            if (!contenido[i].equals("*")) {
                int contador = 0;
                if (i > 0 && contenido[i - 1].equals("*")) contador++;
                if (i < 19 && contenido[i + 1].equals("*")) contador++;
                contenido[i] = String.valueOf(contador);
            }
        }
    }

    public static void mostrarTablero() {
        System.out.print("\nTABLERO: ");
        for (int i = 0; i < contenido.length; i++) {
            if (estadoVisible[i]) {
                System.out.print("[" + contenido[i] + "] ");
            } else {
                System.out.print("[?] ");
            }
        }
        System.out.println();
    }

    public static boolean comprobarVictoria() {
        int contadorDescubiertas = 0;

        for (int i = 0; i < estadoVisible.length; i++) {
            if (estadoVisible[i] == true) {
                contadorDescubiertas++;
            }
        }

        return contadorDescubiertas == 14;
    }

    public static void main(String[] args) {
        inicializarTablero();
        boolean juegoActivo = true;

        System.out.println("¡Bienvenido al Buscaminas! Tienes que encontrar las 14 casillas seguras.");

        while (juegoActivo) {
            mostrarTablero();
            System.out.print("Elige una posición (1-20): ");
            int input = scanner.nextInt();
            int index = input - 1;
            if (index < 0 || index >= 20) {
                System.out.println("Posición fuera de rango. Intenta de nuevo.");
                continue;
            }

            if (contenido[index].equals("*")) {
                System.out.println("¡BOOM! Había una mina. Has perdido la partida.");
                juegoActivo = false;
            }
            else {
                if (estadoVisible[index]) {
                    System.out.println("Esa casilla ya está revelada.");
                } else {
                    estadoVisible[index] = true;

                    if (comprobarVictoria()) {
                        mostrarTablero();
                        System.out.println("¡FELICIDADES! Has encontrado todas las casillas seguras.");
                        juegoActivo = false;
                    }
                }
            }
        }
    }
}