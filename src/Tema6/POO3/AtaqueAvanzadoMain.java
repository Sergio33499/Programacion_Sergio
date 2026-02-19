package Tema6.POO3;

public class AtaqueAvanzadoMain {
    public static void main(String[] args) {
        AtaqueAvanzado bola = new AtaqueBolaFuego();
        AtaqueAvanzado espada = new AtaqueEspadazo();

        espada.lanzar();

        int[] danios = espada.danoInflingido();
        System.out.println("Daño Mágico: " + danios[0]);
        System.out.println("Daño Físico: " + danios[1]);

        int totalDano = danios[0] + danios[1];
        System.out.println("El daño total es: " + totalDano);
    }
}
