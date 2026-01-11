package Tema3.Actividades_Arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {

    static int tamanoTablero = 15;

    public static int inicializarMosca(){
        Random random = new Random();
        return random.nextInt(tamanoTablero);
    }

    public static boolean verificarAdyacente(int posicionJugador, int posicionMosca){
        return posicionMosca == posicionJugador - 1 || posicionMosca == posicionJugador + 1;
    }

    public static int moverMosca(int posicionMosca, int posicionJugador){
        Random rand = new Random();

        int movimiento = rand.nextBoolean() ? -1 : 1;

        int nuevaPosicion = posicionMosca + movimiento;

        if (nuevaPosicion < 0) {
            nuevaPosicion = 1;
        } else if (nuevaPosicion >= tamanoTablero) {
            nuevaPosicion = tamanoTablero - 2;
        }

        return nuevaPosicion;
    }

    public static int jugar(int posicionJugador, int posicionMosca){
        if (posicionJugador == posicionMosca){
            return -1;
        }
        if (verificarAdyacente(posicionJugador, posicionMosca)){
            System.out.println("La mosca estaba cerca! Se movió");
            int newPos = moverMosca(posicionMosca, posicionJugador);
            return newPos;
        }else{
            System.out.println("La mosca no estaba cerca");
            return posicionMosca;
        }
    }


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int posicionMosca = inicializarMosca();
        boolean ganador = false;

        System.out.println("===== ATRAPA LA MOSCA (JUEGO OCULTO) =====");
        System.out.println("La mosca está en una posición secreta entre 1 y " + tamanoTablero + ".");

        while (!ganador){

            System.out.print("Elige una posición entre el 1-" + tamanoTablero + ": ");

            int posJugador;
            if (scanner.hasNextInt()) {
                posJugador = scanner.nextInt() - 1;
            } else {
                System.out.println("Entrada inválida. Por favor, introduce un número.");
                scanner.next();
                continue;
            }

            if (posJugador < 0 || posJugador >= tamanoTablero) {
                System.out.println("Posición fuera de rango. Debe ser entre 1 y " + tamanoTablero + ".");
                continue;
            }

            int result = jugar(posJugador, posicionMosca);

            if (result == -1){
                System.out.println("GANASTE!!! Atrapaste a la mosca!");
                ganador = true;
            }else {
                posicionMosca = result;
            }
        }
        scanner.close();
    }
}