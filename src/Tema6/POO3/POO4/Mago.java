package Tema6.POO3.POO4;

public class Mago implements Combatiente{
    private int vida = 80;
    private int vidaMax = 80;

    public Mago(int vida, int vidaMax){
        this.vida = vida;
        this.vidaMax = vidaMax;
    }

    public Mago(){
        this.vida = 40;
        this.vidaMax = 80;
    }

    @Override
    public Ataque2 atacar(){
        int danioMagico = this.vida / 2;
        String  tipoAtaque;

        if (Math.random() < 0.90){
            tipoAtaque = "A distancia";
        }else {
            tipoAtaque = "Cuerpo a cuerpo";
        }
        return new Ataque2(0, danioMagico, tipoAtaque);
    }

    @Override
    public void defender(Ataque2 ataque){
        if (Math.random() < 0.15){
            System.out.println("El Mago ha esquivado el golpe!");
            return;
        }
        int danioFinal = 0;

        if (ataque.getTipo().equalsIgnoreCase("Cuerpo a cuerpo")){
            danioFinal = (int) (ataque.getDanioFisico() * 1.5);
        }else {
            danioFinal = ataque.getDanioFisico();
        }
        danioFinal += ataque.getDanioMagico();
        this.vida -= danioFinal;
        if (this.vida < 0){
            this.vida = 0;
        }
        System.out.println("Mago recibe " + danioFinal + " de daño. Vida restante: " + this.vida);
    }

    public boolean estaVivo(){
        boolean vivo = false;
        if (this.vida > 0){
            vivo = true;
        }else {
            vivo = false;
            System.out.println("El Mago esta fuera de combate.");
        }
        return vivo;
    }
}
