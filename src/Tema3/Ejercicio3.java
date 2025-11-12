package Tema3;

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean validRadius(double radius){
        return radius > 0;
    }

    public static double calculateCircleArea(double radius){
        return 3.14 * radius * radius;
    }

    public static double calculateCirclePerimeter(double radius){
        return 2 * 3.14 * radius;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un radio válido (Mayor a 0): ");
        double radius = scanner.nextDouble();

        if (!validRadius(radius)) {
            System.out.println("ERROR: El radio introducido no es válido.");
        } else {
            double perimeter = calculateCirclePerimeter(radius);
            double area = calculateCircleArea(radius);

            System.out.println("\nRESULTADOS:");
            System.out.println("RADIO: " + radius);
            System.out.println("PERIMETRO: " + perimeter);
            System.out.println("AREA: " + area);
        }
    }
}
