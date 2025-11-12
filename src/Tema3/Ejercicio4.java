package Tema3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void showMenu() {
        System.out.println("---CONVERSOR DE MONEDA---");
        System.out.println("1. Convertir euros a dólares.");
        System.out.println("2. Convertir dólares a euros.");
        System.out.println("3. Salir.");
    }

    public static double euro2Dollar(double euro){
        double tasaCambio = 1.16;
        return euro * tasaCambio;
    }

    public static double dollar2Euro(double dollar){
        double tasaCambio = 1.16;
        return dollar / tasaCambio;
    }

    public static void currencyMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double cantidad;

        while (opcion != 3) {
            showMenu();
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.print("Introduce la cantidad en euros: ");
                cantidad = scanner.nextDouble();
                System.out.println(cantidad + " euros son " + euro2Dollar(cantidad) + " dólares.");
            } else if (opcion == 2){
                System.out.print("Introduce la cantidad en dólares: ");
                cantidad = scanner.nextDouble();
                System.out.println(cantidad + " dólares son " + dollar2Euro(cantidad) + " euros.");
            } else if (opcion == 3){
                System.out.println("Saliendo del conversor...");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){

        currencyMenu();
    }
}
