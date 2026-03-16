package Tema6.POO3.POO4;

import java.util.ArrayList;
import java.util.Random;

public class BattleRoyale {
    public static void main(String[] args) {
        ArrayList<Combatiente> luchadores = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            int suerte = rand.nextInt(3);
            if (suerte == 0){
                luchadores.add(new Berserker());
            } else if (suerte == 1) {
                luchadores.add(new Mago());
            }else {
                luchadores.add(new Bardo());
            }
        }

        while (luchadores.size() > 1){
            int indiceAtacante = rand.nextInt(luchadores.size());
            int indiceVictima = 0;

            while (indiceAtacante == indiceVictima){
                indiceVictima = rand.nextInt(luchadores.size());
            }
            Combatiente atacante = luchadores.get(indiceAtacante);
            Combatiente victima = luchadores.get(indiceVictima);

            System.out.println(atacante.getClass().getSimpleName() + " ataca a " + victima.getClass().getSimpleName());
            victima.defender(atacante.atacar());

            if (!victima.estaVivo()){
                luchadores.remove(indiceVictima);
                System.out.println("¡K.O.! Quedan " + luchadores.size() + " combatientes.");
            }
        }
        System.out.println("\n==============================");
        System.out.println("EL VENCEDOR ES: " + luchadores.get(0).getClass().getSimpleName());
        System.out.println("==============================");
    }
}
