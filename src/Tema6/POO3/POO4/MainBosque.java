package Tema6.POO3.POO4;

import java.util.Random;

public class MainBosque {
    public static void main(String[] args) {
        Random random = new Random();
        boolean huyendo = false;

        System.out.println("Es de noche y se escuchan ruidos...");

        while (!huyendo){
            try {
                Thread.sleep(1000);
                Animal animal;
                if (random.nextBoolean()){
                    animal = new Lobo();
                }else{
                    animal = new Serpiente();
                }
                System.out.println(animal.getNombre() + " aparece y hace: ");
                animal.hacerRuido();

                int probabilidad = random.nextInt(100);
                if (probabilidad < 5){
                    System.out.println("El animal te ataca! CORRE!!");
                    huyendo = true;
                }else {
                    System.out.println("El animal se ha quedado dormido por ahora...");
                }
            }catch (InterruptedException e){
                System.out.println("Error en la simulacion.");
            }
        }
        System.out.println("Simulacion finalizada.");
    }
}
