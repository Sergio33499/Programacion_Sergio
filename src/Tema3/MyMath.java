package Tema3;

import java.security.PublicKey;
import java.util.Scanner;

public class MyMath {

    public static double squarePerimeter(double lado){
        return 4 * lado;
    }

    public static double squareArea(double lado){
        return lado * lado;
    }

    public static double rectanglePerimeter(double base,double altura){
        return 2 * (base + altura);
    }

    public static double rectangleArea(double base, double altura){
        return base * altura;
    }

    public static double circlePerimeter(double radius){
        return 2 * 3.14 * radius;
    }

    public static double circleArea(double radius){
        return 3.14 * radius * radius;
    }

    public static boolean esPrimo (int num){
        boolean esPrimo = true;
        if (num < 2){
            esPrimo = false;
        }else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        return esPrimo;
    }

    public static boolean noEsPrimo (int num){
        return !esPrimo(num);
    }

    public static int numeroDigitos(int num){
        if (num == 0){
            return 1;
        }
        int contador = 0;
        num = Math.abs(num);
        while (num > 0){
            num /= 10;
            contador ++;
        }
        return contador;
    }

    public static int numeroDigitosPares(int num){
        num = Math.abs(num);
        if (num == 0){
            return 1;
        }
        int contador = 0;
        while (num > 0){
            int digito = num % 10;

            if (digito % 2 == 0){
                contador ++;
            }
            num /= 10;
        }
        return contador;
    }

    public static int numeroDigitosImpares(int num){
        num = Math.abs(num);
        if (num == 0){
            return 0;
        }
        int contador = 0;
        while (num > 0){
            int digito = num % 10;

            if (digito % 2 != 0){
                contador ++;
            }
            num /= 10;
        }
        return contador;
    }

    public static int factorialNum(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialNumRecursiva(int num){
        if (num < 0){
            return -1;
        }
        if (num == 0){
            return 1;
        }else{
            return num * factorialNumRecursiva(num -1);
        }
    }

    public static void main(String[] args){




    }
}
