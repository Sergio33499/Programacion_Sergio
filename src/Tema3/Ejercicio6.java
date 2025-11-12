package Tema3;

public class Ejercicio6 {

    public static void mostrarTabla(int num){
        System.out.println("Tabla de multiplicar del " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        System.out.println();
    }

    public static void tablasDel1Al10() {
        for (int num = 1; num <= 10; num++) {
            mostrarTabla(num);
        }
    }
    public static void main(String[] args){
        tablasDel1Al10();
    }
}
