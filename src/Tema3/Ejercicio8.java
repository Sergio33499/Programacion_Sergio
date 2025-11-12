package Tema3;

import java.util.Scanner;

public class Ejercicio8 {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int diasEnMes(int mes,int anio){

        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (esBisiesto(anio)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static boolean esFechaValida(int dia, int mes, int anio){
        if (mes < 1 || mes > 12) return false;
        int diasMax = diasEnMes(mes,anio);
        return dia >= 1 && dia <= diasMax;
    }

    public static void comprobarFecha(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un dia:");
        int dia = scanner.nextInt();

        System.out.println("Dime un mes:");
        int mes = scanner.nextInt();

        System.out.println("Dime un año");
        int anio = scanner.nextInt();

        boolean valida = esFechaValida(dia,mes,anio);

        if (valida){
            System.out.println("La fecha es valida.");
        }else{
            System.out.println("La fecha no es valida");
        }
    }

    public static void main(String[]args){

        comprobarFecha();

    }
}
