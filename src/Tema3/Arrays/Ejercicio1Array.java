package Tema3.Arrays;

public class Ejercicio1Array {

    public static void printArray(int [] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[]args){
        int[] array = new int[]{0,2,4,6,8,10,12,14,16,18};
       printArray(array);
    }
}
