package Tema2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las notas de los alumnos:");
        double nota;
        int aprobados = 0;
        int suspendidos = 0;

        nota = scanner.nextDouble();

        while (nota != 0){

            if (nota >= 5){
                aprobados++;
            }else {
                suspendidos++;
            }
            nota = scanner.nextDouble();

        }
        System.out.println("Hay " + aprobados + " alumnos aprobados y " + suspendidos + " alumnos suspendidos");




    }
}
