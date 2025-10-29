package Tema2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCombate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int velocidadJ1 = 0, ataqueJ1 = 0, defensaJ1 = 0, vidaJ1 = 0, criticoJ1 = 0, regeneracionJ1 = 0;
        int velocidadJ2 = 0, ataqueJ2 = 0, defensaJ2 = 0, vidaJ2 = 0, criticoJ2 = 0, regeneracionJ2 = 0;
        int suma1, suma2;
        boolean valido1 = false, valido2 = false;
        double factorAtaque, factorDefensa;
        int daño1, daño2;
        int turno = 1;
        int vidaMax1, vidaMax2;
        int accionJ1, accionJ2;

        System.out.println("----->EMPIEZA EL COMBATE<-----");

        //---JUGADOR 1---
        while (!valido1) {
            System.out.println("¿Quieres introducir los atributos del Jugador 1 manualmente (1) o generarlos aleatoriamente (0)?");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                // Generar aleatoriamente
                do {
                    velocidadJ1 = rand.nextInt(200) + 1;
                    ataqueJ1 = rand.nextInt(200) + 1;
                    defensaJ1 = rand.nextInt(200) + 1;
                    vidaJ1 = rand.nextInt(200) + 1;
                    suma1 = velocidadJ1 + ataqueJ1 + defensaJ1 + vidaJ1;
                } while (suma1 > 500);

                criticoJ1 = rand.nextInt(101); // 0-100
                regeneracionJ1 = rand.nextInt(21) + 5; // 5–25

                System.out.println("Atributos aleatorios del Jugador 1:");
                System.out.println("Velocidad: " + velocidadJ1);
                System.out.println("Ataque: " + ataqueJ1);
                System.out.println("Defensa: " + defensaJ1);
                System.out.println("Vida: " + vidaJ1);
                System.out.println("Crítico: " + criticoJ1);
                System.out.println("Regeneración: " + regeneracionJ1);

                valido1 = true;
            } else {
                // Introducir manualmente
                System.out.println("Introduce los datos del Jugador1 (1-200)");
                System.out.print("Velocidad: ");
                velocidadJ1 = scanner.nextInt();
                System.out.print("Ataque: ");
                ataqueJ1 = scanner.nextInt();
                System.out.print("Defensa: ");
                defensaJ1 = scanner.nextInt();
                System.out.print("Vida: ");
                vidaJ1 = scanner.nextInt();
                System.out.print("Crítico (0-100): ");
                criticoJ1 = scanner.nextInt();
                System.out.print("Regeneración: ");
                regeneracionJ1 = scanner.nextInt();

                suma1 = velocidadJ1 + ataqueJ1 + defensaJ1 + vidaJ1;

                if (velocidadJ1 < 1 || ataqueJ1 < 1 || defensaJ1 < 1 || vidaJ1 < 1
                        || velocidadJ1 > 200 || ataqueJ1 > 200 || defensaJ1 > 200 || vidaJ1 > 200) {
                    System.out.println("ERROR: Los atributos tienen que estar entre 1-200");
                    scanner.nextLine();
                } else if (suma1 > 500) {
                    System.out.println("ERROR: La suma de los atributos no puede superar 500");
                    scanner.nextLine();
                } else {
                    valido1 = true;
                }
            }
        }

        vidaMax1 = vidaJ1;

        //---JUGADOR 2---
        while (!valido2) {
            System.out.println("¿Quieres introducir los atributos del Jugador 2 manualmente (1) o generarlos aleatoriamente (0)?");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                // Generar aleatoriamente
                do {
                    velocidadJ2 = rand.nextInt(200) + 1;
                    ataqueJ2 = rand.nextInt(200) + 1;
                    defensaJ2 = rand.nextInt(200) + 1;
                    vidaJ2 = rand.nextInt(200) + 1;
                    suma2 = velocidadJ2 + ataqueJ2 + defensaJ2 + vidaJ2;
                } while (suma2 > 500);

                criticoJ2 = rand.nextInt(101);
                regeneracionJ2 = rand.nextInt(21) + 5;

                System.out.println("Atributos aleatorios del Jugador 2:");
                System.out.println("Velocidad: " + velocidadJ2);
                System.out.println("Ataque: " + ataqueJ2);
                System.out.println("Defensa: " + defensaJ2);
                System.out.println("Vida: " + vidaJ2);
                System.out.println("Crítico: " + criticoJ2);
                System.out.println("Regeneración: " + regeneracionJ2);

                valido2 = true;
            } else {
                // Introducir manualmente
                System.out.println("Introduce los datos del Jugador2 (1-200)");
                System.out.print("Velocidad: ");
                velocidadJ2 = scanner.nextInt();
                System.out.print("Ataque: ");
                ataqueJ2 = scanner.nextInt();
                System.out.print("Defensa: ");
                defensaJ2 = scanner.nextInt();
                System.out.print("Vida: ");
                vidaJ2 = scanner.nextInt();
                System.out.print("Crítico (0-100): ");
                criticoJ2 = scanner.nextInt();
                System.out.print("Regeneración: ");
                regeneracionJ2 = scanner.nextInt();

                suma2 = velocidadJ2 + ataqueJ2 + defensaJ2 + vidaJ2;

                if (velocidadJ2 < 1 || ataqueJ2 < 1 || defensaJ2 < 1 || vidaJ2 < 1
                        || velocidadJ2 > 200 || ataqueJ2 > 200 || defensaJ2 > 200 || vidaJ2 > 200) {
                    System.out.println("ERROR: Los atributos tienen que estar entre 1-200");
                    scanner.nextLine();
                } else if (suma2 > 500) {
                    System.out.println("ERROR: La suma de los atributos no puede superar 500");
                    scanner.nextLine();
                } else {
                    valido2 = true;
                }
            }
        }

        vidaMax2 = vidaJ2;

        //---COMBATE---
        System.out.println("¡COMIENZA EL COMBATE!");

        while (vidaJ1 > 0 && vidaJ2 > 0) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Validar acción Jugador 1
            accionJ1 = 0;
            while (accionJ1 != 1 && accionJ1 != 2) {
                System.out.println("Jugador 1: Elige acción (1=Atacar, 2=Curarse)");
                accionJ1 = scanner.nextInt();
                if (accionJ1 != 1 && accionJ1 != 2) {
                    System.out.println("ERROR: Tienes que introducir 1 o 2");
                }
            }

            // Validar acción Jugador 2
            accionJ2 = 0;
            while (accionJ2 != 1 && accionJ2 != 2) {
                System.out.println("Jugador 2: Elige acción (1=Atacar, 2=Curarse)");
                accionJ2 = scanner.nextInt();
                if (accionJ2 != 1 && accionJ2 != 2) {
                    System.out.println("ERROR: Tienes que introducir 1 o 2");
                }
            }

            //Decidir quien ataca primero por el que tenga mayor velocidad
            if (velocidadJ1 >= velocidadJ2) {
                // Jugador 1 primero
                if (accionJ1 == 2) {
                    vidaJ1 += regeneracionJ1;
                    if (vidaJ1 > vidaMax1) vidaJ1 = vidaMax1;
                    System.out.println("Jugador 1 se cura " + regeneracionJ1 + " PV.");
                } else {
                    factorAtaque = 0.6 + rand.nextDouble() * 0.4;
                    factorDefensa = 0.2 + rand.nextDouble() * 0.4;
                    daño1 = (int) Math.round((ataqueJ1 * factorAtaque) - (defensaJ2 * factorDefensa));
                    if (daño1 < 1) daño1 = 1;
                    if (rand.nextInt(100) < criticoJ1) {
                        daño1 *= 2;
                        System.out.println("¡Golpe crítico de Jugador 1!");
                    }
                    vidaJ2 -= daño1;
                    if (vidaJ2 < 0) vidaJ2 = 0;
                    System.out.println("Jugador 1 ataca e inflinge " + daño1 + " de daño.");
                }

                // Jugador 2 actúa si sigue vivo
                if (vidaJ2 > 0) {
                    if (accionJ2 == 2) {
                        vidaJ2 += regeneracionJ2;
                        if (vidaJ2 > vidaMax2) vidaJ2 = vidaMax2;
                        System.out.println("Jugador 2 se cura " + regeneracionJ2 + " PV.");
                    } else {
                        factorAtaque = 0.6 + rand.nextDouble() * 0.4;
                        factorDefensa = 0.2 + rand.nextDouble() * 0.4;
                        daño2 = (int) Math.round((ataqueJ2 * factorAtaque) - (defensaJ1 * factorDefensa));
                        if (daño2 < 1) daño2 = 1;
                        if (rand.nextInt(100) < criticoJ2) {
                            daño2 *= 2;
                            System.out.println("¡Golpe crítico de Jugador 2!");
                        }
                        vidaJ1 -= daño2;
                        if (vidaJ1 < 0) vidaJ1 = 0;
                        System.out.println("Jugador 2 ataca e inflinge " + daño2 + " de daño.");
                    }
                }

            } else {
                // Jugador 2 primero
                if (accionJ2 == 2) {
                    vidaJ2 += regeneracionJ2;
                    if (vidaJ2 > vidaMax2) vidaJ2 = vidaMax2;
                    System.out.println("Jugador 2 se cura " + regeneracionJ2 + " PV.");
                } else {
                    factorAtaque = 0.6 + rand.nextDouble() * 0.4;
                    factorDefensa = 0.2 + rand.nextDouble() * 0.4;
                    daño2 = (int) Math.round((ataqueJ2 * factorAtaque) - (defensaJ1 * factorDefensa));
                    if (daño2 < 1) daño2 = 1;
                    if (rand.nextInt(100) < criticoJ2) {
                        daño2 *= 2;
                        System.out.println("¡Golpe crítico de Jugador 2!");
                    }
                    vidaJ1 -= daño2;
                    if (vidaJ1 < 0) vidaJ1 = 0;
                    System.out.println("Jugador 2 ataca e inflinge " + daño2 + " de daño.");
                }

                // Jugador 1 actúa si sigue vivo
                if (vidaJ1 > 0) {
                    if (accionJ1 == 2) {
                        vidaJ1 += regeneracionJ1;
                        if (vidaJ1 > vidaMax1) vidaJ1 = vidaMax1;
                        System.out.println("Jugador 1 se cura " + regeneracionJ1 + " PV.");
                    } else {
                        factorAtaque = 0.6 + rand.nextDouble() * 0.4;
                        factorDefensa = 0.2 + rand.nextDouble() * 0.4;
                        daño1 = (int) Math.round((ataqueJ1 * factorAtaque) - (defensaJ2 * factorDefensa));
                        if (daño1 < 1) daño1 = 1;
                        if (rand.nextInt(100) < criticoJ1) {
                            daño1 *= 2;
                            System.out.println("¡Golpe crítico de Jugador 1!");
                        }
                        vidaJ2 -= daño1;
                        if (vidaJ2 < 0) vidaJ2 = 0;
                        System.out.println("Jugador 1 ataca e inflinge " + daño1 + " de daño.");
                    }
                }
            }

            // Mostrar barra de vida
            System.out.print("Jugador1: [");
            int barra1 = (int) ((vidaJ1 * 20.0) / vidaMax1);
            for (int i = 0; i < 20; i++) {
                if (i < barra1) System.out.print("★");
                else System.out.print(" ");
            }
            System.out.println("] " + vidaJ1 + "/" + vidaMax1 + " PV");

            System.out.print("Jugador2: [");
            int barra2 = (int) ((vidaJ2 * 20.0) / vidaMax2);
            for (int i = 0; i < 20; i++) {
                if (i < barra2) System.out.print("★");
                else System.out.print(" ");
            }
            System.out.println("] " + vidaJ2 + "/" + vidaMax2 + " PV");

            turno++;
        }

        //Resultado final
        System.out.println("\n--- RESULTADO FINAL ---");
        if (vidaJ1 <= 0 && vidaJ2 <= 0) {
            System.out.println("¡EMPATE! ambos jugadores han muerto");
        } else if (vidaJ1 <= 0) {
            System.out.println("GANA EL JUGADOR 2");
        } else {
            System.out.println("GANA EL JUGADOR 1");
        }

    }
}
