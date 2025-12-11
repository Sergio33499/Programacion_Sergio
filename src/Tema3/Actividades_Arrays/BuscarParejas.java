package Tema3.Actividades_Arrays;

import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {

    public static String[] tablero;
    public static boolean[] estadoVisible;
    public static Scanner scanner;

    public static String[] generarParejas(){
        String[] elementosUnicos = {"LEON", "TIGRE", "MONO", "CEBRA", "OSO", "PEZ", "RANA", "LOBO", "PERRO", "GATO"};
        String[] tableroContenido = new String[20];

        for (int i = 0; i < elementosUnicos.length; i++) {
            tableroContenido[i * 2] = elementosUnicos[i];

            tableroContenido[i * 2 + 1] = elementosUnicos[i];
        }
        return tableroContenido;
    }

    public static void mezclarArray(String[] array){
        Random rand = new Random();

        for (int i = 0; i < array.length - 1; i++) {
            int j = i + rand.nextInt(array.length - i);
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static boolean[] inicializarEstado(int tamaño){
        boolean[] estado = new boolean[tamaño];
        return estado;
    }

    public static void mostrarTablero(String[] contentido,boolean[] estado){
        String simboloOculto = "***";

        System.out.println("\n================ TABLERO ================");
        for (int i = 0; i < contentido.length; i++) {
            String valorAMostrar;
            if (estado[i] == true){
                valorAMostrar = contentido[i];
            }else {
                valorAMostrar = simboloOculto;
            }
            System.out.printf("[%2d:%-5s]", i + 1, valorAMostrar);
            if ((i +1) % 5 == 0){
                System.out.println();
            }
        }
        System.out.println("=========================================");
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static boolean comprobarVictoria() {
        for (int i = 0; i < estadoVisible.length; i++) {
            if (estadoVisible[i] == false) {
                return false;
            }
        }

        return true;
    }

    public static int obtenerPosicionValida(String mensaje) {
        int posicionUsuario;

        while (true) {
            System.out.print(mensaje);

            if (scanner.hasNextInt()) {
                posicionUsuario = scanner.nextInt();
                scanner.nextLine();

                if (posicionUsuario >= 1 && posicionUsuario <= 20) {
                    int indice = posicionUsuario - 1;

                    if (estadoVisible[indice] == true) {
                        System.out.println("Esa posición ya está visible. Elige otra.");
                    } else {
                        return indice;
                    }
                } else {
                    System.out.println("Posición inválida. Debe ser entre 1 y 20.");
                }
            } else {
                System.out.println("Entrada inválida. Introduce un número.");
                scanner.nextLine();
            }
        }
    }


    public static void main(String[]args){

        scanner = new Scanner(System.in);
        tablero = generarParejas();
        mezclarArray(tablero);
        estadoVisible = inicializarEstado(tablero.length);

        System.out.println("¡Bienvenido a Buscar Parejas!");

        while (!comprobarVictoria()) {
            mostrarTablero(tablero, estadoVisible);

            int pos1 = obtenerPosicionValida("Selecciona la primera posición (1-20): ");
            estadoVisible[pos1] = true;
            mostrarTablero(tablero, estadoVisible);

            int pos2 = obtenerPosicionValida("Selecciona la segunda posición (1-20): ");
            estadoVisible[pos2] = true;
            mostrarTablero(tablero, estadoVisible);

            if (tablero[pos1].equals(tablero[pos2])) {
                System.out.println("¡Pareja encontrada: " + tablero[pos1] + "!");
            } else {
                System.out.println("No coinciden. Presiona Enter para continuar...");
                scanner.nextLine();

                estadoVisible[pos1] = false;
                estadoVisible[pos2] = false;
                limpiarPantalla();
            }
        }

        mostrarTablero(tablero, estadoVisible);
        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
        scanner.close();
    }
}