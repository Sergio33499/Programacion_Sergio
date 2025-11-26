package Tema3;

import java.util.Scanner;

public class Ejercicio10_2 {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        //1.Perimetro y area
        System.out.println("Dime el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        System.out.println("El perimetro es: " + MyMath.squarePerimeter(lado));
        System.out.println("El area es: " + MyMath.squareArea(lado));

        //2.Primo o no primo
        System.out.println("Dime un numero: ");
        int numPrimo = scanner.nextInt();
        System.out.println("¿El número " + numPrimo + " es primo? " + MyMath.esPrimo(numPrimo));
        System.out.println("¿El número " + numPrimo + " no es primo? " + MyMath.noEsPrimo(numPrimo));


        //3.Numero de digitos
        System.out.println("Dime un numero: ");
        int num = scanner.nextInt();
        System.out.println("El numero de digitos de " + num + " es: " + MyMath.numeroDigitos(num));

        //4.Digitos pares
        System.out.println("Dime un numero: ");
        num = scanner.nextInt();
        System.out.println("Los digitos pares de " + num + " son: " + MyMath.numeroDigitosPares(num));

        //5.Digitos impares
        System.out.println("Dime un numero: ");
        num = scanner.nextInt();
        System.out.println("Los digitos impares de " + num + " son: " + MyMath.numeroDigitosImpares(num));

        //6.Factorial iterativo
        System.out.println("Dime un numero: ");
        int numFactorial = scanner.nextInt();
        System.out.println("El factorial iterativo de " + numFactorial + " es: " + MyMath.factorialNum(numFactorial));

        //7.Factorial recursivo
        System.out.println("Dime un numero: ");
        numFactorial = scanner.nextInt();
        System.out.println("El factorial recursivo de " + numFactorial + " es: " + MyMath.factorialNumRecursiva(numFactorial));

        //8.Numero de soluciones ecuaciones
        System.out.println("Dime una ecuación de segundo grado: ax^2 + bx + c = 0");

        System.out.println("Introduce el valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Introduce el valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Introduce el valor de c: ");
        double c = scanner.nextDouble();

        int soluciones = MyMath.numeroDeSoluciones(a,b,c);

        System.out.println("El numero de soluciones es: " + soluciones);

        //9.Sumar digitos
        System.out.println("Dime un numero entero: ");
        int numEntero = scanner.nextInt();
        System.out.println("La suma de los digitos de " + numEntero + " es: " + MyMath.sumarDigitosEntero(numEntero));

        scanner.close();



    }
}
