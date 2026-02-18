package Tema6.POO3;

public class AtaqueAvanzadoMain {
    public static void main(String[] args) {
        AtaqueAvanzado bola = new AtaqueBolaFuego();
        AtaqueAvanzado espada = new AtaqueEspadazo();

        // Lanzamos el ataque
        espada.lanzar();

        // Accedemos a los datos del array
        int[] danios = espada.danoInflingido();
        System.out.println("Daño Mágico: " + danios[0]); // El primer valor
        System.out.println("Daño Físico: " + danios[1]); // El segundo valor

        int totalDano = danios[0] + danios[1];
        System.out.println("El daño total es: " + totalDano);
    }
}
