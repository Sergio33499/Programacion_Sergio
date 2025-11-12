package Tema2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas personas son?");
        int persona = scanner.nextInt();

        System.out.println("Cuantos dias se quedan?");
        int dia = scanner.nextInt();

        int tarifaEstandar = 15;
        if (persona >= 5 && dia >= 7){
            int precioDescuento = (tarifaEstandar * persona) * 100 / 25;
            System.out.println("El precio de la reserva será: " + precioDescuento);
        }else{
            int precio = (15 * persona) * dia;
            System.out.println("El precio de la reserva será: " + precio);
        }

    }
}
