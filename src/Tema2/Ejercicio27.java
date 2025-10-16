package Tema2;

public class Ejercicio27 {
    public static void main(String[] args){

      int contador =  0;
      int num = 2;

      while (contador < 20){
         boolean esPrimo = true;

          for (int i = 2; i <= Math.sqrt(num); i++) {
              if (num % i == 0){
                  esPrimo = false;
                  break;
              }
          }
          if (esPrimo){
              System.out.println(num);
              contador ++;
          }
          num++;
      }

    }
}
