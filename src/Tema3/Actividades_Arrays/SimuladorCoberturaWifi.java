package Tema3.Actividades_Arrays;

import java.util.Scanner;

public class SimuladorCoberturaWifi{

    public static int pedirHabitacion(){
        Scanner scanner = new Scanner(System.in);
        int habitacion = -1;

        while (habitacion > 20 || habitacion < 1){
            System.out.println("Dime un numero de habitacion del 1-20: ");
            habitacion = scanner.nextInt();

            if (habitacion < 1 || habitacion > 20){
                System.out.println("ERROR. Introduce un valor valido: ");
            }
        }


        return habitacion;
    }

    public static int pedirPotencia(){
        Scanner scanner = new Scanner(System.in);
        int potencia = -1;

        while (potencia > 6 || potencia < 1){
            System.out.println("Dime un numero del 1-6: ");
            potencia = scanner.nextInt();

            if (potencia < 1 || potencia > 6){
                System.out.println("ERROR. Introduce un valor valido: ");
            }
        }
        return potencia;
    }

    public static int[] calcularCobertura(int habitacion,int potencia){
        int [] hotel = new int[20];

        int posicionRouter = habitacion - 1;

        for (int i = 0; i < hotel.length; i++) {
            int distancia = Math.abs(i - posicionRouter);
            int senal = potencia - distancia;

            if (senal < 0){
                hotel[i] = 0;
            }else{
                hotel[i] = senal;
            }
        }
        return hotel;
    }

    public static void imprimirHotel(int[] hotel){
        for (int i = 0; i < hotel.length; i++) {
            System.out.print(hotel[i]);
        }
        System.out.println();
    }


    public static void main(String[]args){
        int habitacion = pedirHabitacion();
        int potencia = pedirPotencia();

        int[] hotelConSenal = calcularCobertura(habitacion,potencia);

        imprimirHotel(hotelConSenal);
    }
}
