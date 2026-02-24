package Tema6.POO3.POO4;

public class Berserker implements Combatiente{
    private int vida;
    private int vidaMax = 100;

    public Berserker(int vida, int vidaMaxima){
        this.vida = vida;
        this.vidaMax = vidaMaxima;
    }

    public Berserker(){
        this.vida = 50;
        this.vidaMax = 100;
    }

    @Override
    public Ataque2 atacar(){
        int danioBase = 10;
        int danioExtra = 20 + (vidaMax - vida);

        if (Math.random() < 0.20){
            danioExtra = 0;
        }
        return new Ataque2(danioExtra, 0, "Cuerpo a cuerpo");
    }

    @Override
    public void defender(Ataque2 ataque){
        if (Math.random() < 0.15){
            System.out.println("El Berserker ha esquivado el golpe!");
            return;
        }
        int danioFinal = 0;

        if (ataque.getTipo().equalsIgnoreCase("Cuerpo a cuerpo")){
            danioFinal = (int) (ataque.getDanioFisico() * 0.4);
        }else {
            danioFinal = ataque.getDanioFisico();
        }
        danioFinal += ataque.getDanioMagico();
        this.vida -= danioFinal;
        if (this.vida < 0){
            this.vida = 0;
        }
        System.out.println("Berserker recibe " + danioFinal + " de daño. Vida restante: " + this.vida);
    }

    public boolean estaVivo(){
        boolean vivo = false;
        if (this.vida > 0){
            vivo = true;
        }else {
            vivo = false;
            System.out.println("El Berserker esta fuera de combate.");
        }
        return vivo;
    }

}
