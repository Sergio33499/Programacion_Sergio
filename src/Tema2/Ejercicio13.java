package Tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una hora (0-23)");
        int hora = scanner.nextInt();

        System.out.println("Introduce los minuto (0-59)");
        int minuto = scanner.nextInt();

        System.out.println("Introduce los segundo (0-59)");
        int segundo = scanner.nextInt();

        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            System.out.println("Datos incorrectos. Programa terminado.");
            return;
        }

        segundo++;

        if (segundo == 60){
            segundo = 0;
            minuto++;
        }

        if (minuto == 60){
            minuto = 0;
            hora = 0;
        }

        if (hora == 24){
            hora = 0;
        }

        System.out.printf("La hora con un segundo más es: %02d:%02d:%02d\n", hora, minuto, segundo);
    }
}
