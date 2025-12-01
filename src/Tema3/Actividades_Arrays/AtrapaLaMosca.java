package Tema3.Actividades_Arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {

    public static int inicializarMosca(){
        Random random = new Random();
        return random.nextInt(15);
    }

    public static boolean verificarAdyacente(int posicionJugador,int posicionMosca){
        if (posicionMosca == posicionJugador - 1 && posicionJugador > 0 || posicionMosca == posicionJugador + 1 && posicionJugador < 14){
            return true;
        }else {
            return false;
        }
    }

    public static int moverMosca(int posicionMosca, int posicionJugador){
        Random rand = new Random();
        if (posicionMosca == 0){
            return 1;
        } else if (posicionMosca == 14) {
            return 13;
        } else {
            int num = rand.nextInt(2);
            if (num == 0){
                return posicionMosca -1;
            }else{
                return posicionMosca +1;
            }
        }
    }

    public static int jugar(int posicionJugador, int posicionMosca){
        if (posicionJugador == posicionMosca){
            return -1;
        }
        if (verificarAdyacente(posicionJugador,posicionMosca)){
            System.out.println("La mosca estaba cerca! Se movió");
            int newPos = moverMosca(posicionMosca,posicionJugador);
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

        System.out.println("===== ATRAPA LA MOSCA =====");
        System.out.println("La mosca está en una posición entre 1 y 15");

        while (!ganador){
            System.out.println("Elige una posición entre el 1-15");
            int posJugador = scanner.nextInt() - 1;   //convierte a indice 0-14
            int result = jugar(posJugador,posicionMosca);

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
