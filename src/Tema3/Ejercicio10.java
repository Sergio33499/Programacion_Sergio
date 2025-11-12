package Tema3;

import java.util.Scanner;

import static Tema3.Ejercicio1.numberSign;

public class Ejercicio10 {

    public static void showMenu(){
            System.out.println("----- MENÚ -----");
            System.out.println("a) Signo de un número");
            System.out.println("b) Mayor de edad");
            System.out.println("c) Área y perímetro de un círculo");
            System.out.println("d) Conversor euros/dólares");
            System.out.println("e) Tabla de multiplicar de un número");
            System.out.println("f) Tablas del 1 al 10");
            System.out.println("g) Comprobador de números primos");
            System.out.println("h) Comprobador de fechas");
            System.out.println("i) Dibujar triángulos");
            System.out.println("x) Salir");
            System.out.print("Elige una opción: ");


        }
    }

    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);


        char opcion = scanner.next().charAt(0);

        if (opcion == 'a'){
            System.out.println("Dime un numero entero: ");
            int numero = scanner.nextInt();

            int result = numberSign(numero);

            if (result == 1){
                System.out.println(result);
            }else if (result == -1){
                System.out.println(result);
            }else {
                System.out.println(result);
            }
        } else if (opcion == 'b') {
            System.out.println("Introduce tu edad: ");
            int edad = scanner.nextInt();

            if(Ejercicio2.isAdult(edad)){
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("No eres mayor de edad.");
            }
        } else if (opcion == 'c') {
            Ejercicio3.circleMenu();
        } else if (opcion == 'd') {
            Ejercicio4.currencyMenu();
        } else if (opcion == 'e') {
            Ejercicio5.tablaMenu();
        } else if (opcion == 'f') {
            Ejercicio6.tablasDel1Al10();
        } else if (opcion == 'g') {
            Ejercicio7.comprobarPrimos();
        } else if (opcion == 'h') {
            Ejercicio8.comprobarFecha();
        } else if (opcion == 'i') {
            Ejercicio9.trianguloMenu();
        }

    }
}
