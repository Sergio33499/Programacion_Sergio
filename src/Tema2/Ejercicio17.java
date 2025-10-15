package Tema2;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Dime un numero del 0 al 2");

            int num = scanner.nextInt();

            if (num == 0){
                System.out.println("Dime el lado del cuadrado");
                int lado = scanner.nextInt();
                int area =  lado * lado;
                int perimetro = 4 * lado;

                System.out.println("El area del cuadrado es: " + area);
                System.out.println("El perimetro del cuadrado es: " + perimetro);
            } else if (num == 1) {
                System.out.println("Dime la base del rectangulo");
                int base = scanner.nextInt();
                System.out.println("Dime la altura del rectangulo");
                int altura = scanner.nextInt();

                int area = base * altura;

                int perimetro = 2 * (base + altura);

                System.out.println("El area del rectangulo es: " + area);
                System.out.println("El perimetro del rectangulo es: " + perimetro);
            } else if (num == 2) {
                System.out.println("Dime la base del triangulo");
                int base = scanner.nextInt();

                System.out.println("Dime la altura del triangulo");
                int altura = scanner.nextInt();

                int area = base * altura / 2;

                System.out.println("El area del triangulo es: " + area);
            }else{
                System.out.println("ERROR: Numero no valido");
            }
        }


    }
}