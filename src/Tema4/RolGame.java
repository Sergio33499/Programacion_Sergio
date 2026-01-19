package Tema4;

import java.util.Random;

public class RolGame {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        Hero jugador = new Hero("Elden Ring Player", 5, 200, 40, 20);
        int hordasSobrevividas = 0;

        System.out.println("--- ¡COMIENZA EL DESAFÍO! ---");

        while (jugador.getHealth() > 0) {
            hordasSobrevividas++;
            System.out.println("\n--- HORDA " + hordasSobrevividas + " ---");

            int numEnemigos = random.nextInt(3) + 1;
            Hero[] enemigos = new Hero[numEnemigos];

            for (int i = 0; i < enemigos.length; i++) {
                enemigos[i] = new Hero("Goblin " + (i + 1), 1, 40, 15, 5);
            }

            int enemigosVivos = numEnemigos;
            while (jugador.getHealth() > 0 && enemigosVivos > 0) {

                for (int i = 0; i < enemigos.length; i++) {
                    Hero enemigoActual = enemigos[i];

                    if (enemigoActual != null && enemigoActual.getHealth() > 0) {

                        if (random.nextDouble() < 0.10) {
                            System.out.println(enemigoActual.getName() + " ha huido de la pelea!");
                            enemigos[i] = null;
                            enemigosVivos--;
                            continue;
                        }

                        jugador.attack(enemigoActual);

                        if (enemigoActual.getHealth() <= 0) {
                            System.out.println(enemigoActual.getName() + " ha muerto.");
                            enemigos[i] = null;
                            enemigosVivos--;
                        }

                        if (enemigos[i] != null && jugador.getHealth() > 0) {
                            enemigoActual.attack(jugador);
                        }
                    }
                }
                Thread.sleep(1000);
            }

            if (jugador.getHealth() > 0) {
                if (random.nextDouble() < 0.001) {
                    jugador.rest();
                }
                if (random.nextDouble() < 0.10) {
                    jugador.drinkPotion();
                }
            }
        }

        System.out.println("\n===============================");
        System.out.println("GAME OVER - Has caído en la horda " + hordasSobrevividas);
        System.out.println("Sobreviviste a " + (hordasSobrevividas - 1) + " hordas completas.");
        System.out.println("===============================");
    }
}