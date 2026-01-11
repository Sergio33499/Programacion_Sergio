package Tema3;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCombateModular {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    static int velocidadJ1, ataqueJ1, defensaJ1, vidaJ1, criticoJ1, regeneracionJ1, vidaMax1;
    static int velocidadJ2, ataqueJ2, defensaJ2, vidaJ2, criticoJ2, regeneracionJ2, vidaMax2;

    public static void main(String[] args) {
        System.out.println("-----> EMPIEZA EL COMBATE <-----");
        readPlayerStats(1);
        readPlayerStats(2);
        simularCombate();
    }

    public static void readPlayerStats(int num) {
        boolean valido = false;
        while (!valido) {
            System.out.println("\nJUGADOR " + num);
            System.out.println("(1) Manual o (0) Aleatorio?");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                generarDatosAleatorios(num);
                valido = true;
            } else {
                leerDatosManuales(num);
                valido = areValidPlayerStats(num);
            }
        }
        asignarVidaMax(num);
    }

    public static boolean areValidPlayerStats(int num) {
        int v, a, d, vi;

        if (num == 1) {
            v = velocidadJ1; a = ataqueJ1; d = defensaJ1; vi = vidaJ1;
        } else {
            v = velocidadJ2; a = ataqueJ2; d = defensaJ2; vi = vidaJ2;
        }

        if (v < 1 || a < 1 || d < 1 || vi < 1 || v > 200 || a > 200 || d > 200 || vi > 200) {
            System.out.println("ERROR: Los atributos deben estar entre 1 y 200.");
            return false;
        }
        if ((v + a + d + vi) > 500) {
            System.out.println("ERROR: La suma de atributos no puede superar 500.");
            return false;
        }
        return true;
    }

    public static void simularCombate() {
        int turno = 1;
        while (vidaJ1 > 0 && vidaJ2 > 0) {
            System.out.println("\n**** RONDA " + turno + " ****");
            updateLife();

            int acc1 = pedirAccion(1);
            int acc2 = pedirAccion(2);

            makeTurn(acc1, acc2);

            System.out.println("Introduce cualquier carácter para continuar...");
            scanner.next();

            turno++;
        }
        mostrarResultadoFinal();
    }

    public static void makeTurn(int acc1, int acc2) {
        if (velocidadJ1 >= velocidadJ2) {
            ejecutarAccion(1, acc1);
            if (vidaJ2 > 0) {
                ejecutarAccion(2, acc2);
            }
        } else {
            ejecutarAccion(2, acc2);
            if (vidaJ1 > 0) {
                ejecutarAccion(1, acc1);
            }
        }
    }

    public static int calculateDamage(int atk, int def, int crit) {
        double factorAtaque = 0.6 + rand.nextDouble() * 0.4;
        double factorDefensa = 0.2 + rand.nextDouble() * 0.4;

        int daño = (int) Math.round((atk * factorAtaque) - (def * factorDefensa));

        if (rand.nextInt(100) < crit) {
            System.out.print("¡GOLPE CRÍTICO! ");
            daño = daño * 2;
        }

        if (daño < 1) {
            daño = 1;
        }
        return daño;
    }

    private static void ejecutarAccion(int jugador, int accion) {
        if (accion == 2) {
            if (jugador == 1) {
                vidaJ1 = vidaJ1 + regeneracionJ1;
                if (vidaJ1 > vidaMax1) {
                    vidaJ1 = vidaMax1;
                }
                System.out.println("Jugador 1 se cura.");
            } else {
                vidaJ2 = vidaJ2 + regeneracionJ2;
                if (vidaJ2 > vidaMax2) {
                    vidaJ2 = vidaMax2;
                }
                System.out.println("Jugador 2 se cura.");
            }
        } else {
            atacar(jugador);
        }
    }

    private static void atacar(int atacante) {
        int daño;
        if (atacante == 1) {
            daño = calculateDamage(ataqueJ1, defensaJ2, criticoJ1);
            vidaJ2 = vidaJ2 - daño;
            if (vidaJ2 < 0) {
                vidaJ2 = 0;
            }
            System.out.println("Jugador 1 golpea con " + daño + " de daño.");
        } else {
            daño = calculateDamage(ataqueJ2, defensaJ1, criticoJ2);
            vidaJ1 = vidaJ1 - daño;
            if (vidaJ1 < 0) {
                vidaJ1 = 0;
            }
            System.out.println("Jugador 2 golpea con " + daño + " de daño.");
        }
    }

    public static void updateLife() {
        dibujarBarra("J1", vidaJ1, vidaMax1);
        dibujarBarra("J2", vidaJ2, vidaMax2);
    }

    private static void leerDatosManuales(int n) {
        System.out.println("Introduce Velocidad, Ataque, Defensa, Vida:");
        if (n == 1) {
            velocidadJ1 = scanner.nextInt(); ataqueJ1 = scanner.nextInt();
            defensaJ1 = scanner.nextInt(); vidaJ1 = scanner.nextInt();
            System.out.println("Introduce Crítico (0-100) y Regeneración:");
            criticoJ1 = scanner.nextInt(); regeneracionJ1 = scanner.nextInt();
        } else {
            velocidadJ2 = scanner.nextInt(); ataqueJ2 = scanner.nextInt();
            defensaJ2 = scanner.nextInt(); vidaJ2 = scanner.nextInt();
            System.out.println("Introduce Crítico (0-100) y Regeneración:");
            criticoJ2 = scanner.nextInt(); regeneracionJ2 = scanner.nextInt();
        }
    }

    private static void generarDatosAleatorios(int n) {
        int v, a, d, vi;
        do {
            v = rand.nextInt(200) + 1; a = rand.nextInt(200) + 1;
            d = rand.nextInt(200) + 1; vi = rand.nextInt(200) + 1;
        } while ((v + a + d + vi) > 500);

        if (n == 1) {
            velocidadJ1 = v; ataqueJ1 = a; defensaJ1 = d; vidaJ1 = vi;
            criticoJ1 = rand.nextInt(20);
            regeneracionJ1 = rand.nextInt(15) + 5;
        } else {
            velocidadJ2 = v; ataqueJ2 = a; defensaJ2 = d; vidaJ2 = vi;
            criticoJ2 = rand.nextInt(20);
            regeneracionJ2 = rand.nextInt(15) + 5;
        }
    }

    private static void asignarVidaMax(int n) {
        if (n == 1) {
            vidaMax1 = vidaJ1;
        } else {
            vidaMax2 = vidaJ2;
        }
    }

    private static int pedirAccion(int id) {
        System.out.println("Acción J" + id + ": (1) Atacar (2) Curar");
        return scanner.nextInt();
    }

    private static void dibujarBarra(String etiqueta, int vida, int max) {
        System.out.print(etiqueta + ": [");
        int bloques = (int) ((vida * 20.0) / max);
        for (int i = 0; i < 20; i++) {
            if (i < bloques) {
                System.out.print("#");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("] " + vida + "/" + max);
    }

    private static void mostrarResultadoFinal() {
        if (vidaJ1 <= 0) {
            System.out.println("\n¡EL JUGADOR 2 HA GANADO EL COMBATE!");
        } else {
            System.out.println("\n¡EL JUGADOR 1 HA GANADO EL COMBATE!");
        }
    }
}