package Tema2;

public class Ejercicio21 {
    public static void main(String[] args){
        int suma = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 2 == 0){
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
