package Tema3.Modular3;

import java.util.Map;
import java.util.Scanner;

public class Utils {

    public static double miles2km(double millas){
        double km = 1.60945;

        return millas * km;
    }

    public static double getTaxes(double precio, double taxes){
        double valor = precio * (taxes / 100.0);

        double round = Math.round((valor * 100) / 100.0);

        return round;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las millas a convertir:");
        double millasAConvertir = scanner.nextDouble();

        double km = miles2km(millasAConvertir);

        System.out.printf(millasAConvertir + " millas son: " + km + " km.");
    }
}
