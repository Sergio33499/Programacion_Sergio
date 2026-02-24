package Tema6.POO3.POO4;

public class Bardo implements Combatiente{
    private int vida = 80;
    private int vidaMax = 80;

    public Bardo(int vida, int vidaMax){
        this.vida = vida;
        this.vidaMax = vidaMax;
    }

    public Bardo(){
        this.vida = 80;
        this.vidaMax = 100;
    }

    @Override
    public Ataque2 atacar(){
        if (Math.random() < 0.10){
            System.out.println("Critico del Bardo!");
            return new Ataque2(999,999,"Magico");
        }
        String tipo;
        if (Math.random() < 0.50) {
            tipo = "Cuerpo a cuerpo";
        } else {
            tipo = "A distancia";
        }
        return new Ataque2(15,15,tipo);
    }

    @Override
    public void defender(Ataque2 ataque) {
        int danioTotal = (int) ((ataque.getDanioFisico() + ataque.getDanioMagico()) * 1.2);

        this.vida -= danioTotal;
        if (this.vida < 0) this.vida = 0;

        System.out.println("Bardo recibe " + danioTotal + " de daño. Vida: " + this.vida);
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
