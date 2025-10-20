package Tema2;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe -salir- para terminar ");

        String operacion;

        while (true){
            System.out.println("Primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Operación (+, -, *, /, %): ");
            operacion = scanner.next();
            if (operacion.equals("salir")) break;

            System.out.println("Segundo numero: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operacion){
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/": resultado = num1 / num2; break;
                case "%": resultado = num1 % num2; break;
                default:
                    System.out.println("Operacion no valida");
                    continue;
            }
            System.out.println("Resultado: " + resultado + "\n");
        }
        System.out.println("Calculadra finalizada");

    }
}
