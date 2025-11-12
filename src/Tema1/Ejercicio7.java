package Tema1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leer cara del dado");
        int caraDado = scanner.nextInt();
        if (caraDado < 0 && caraDado > 6){
            System.out.println("Numero no valido");
        }else{
            int opuesto = 7 - caraDado;
            System.out.println(opuesto);
        }
    }
}


