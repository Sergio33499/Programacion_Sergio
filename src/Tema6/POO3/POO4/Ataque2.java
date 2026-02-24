package Tema6.POO3.POO4;

public class Ataque2{

    private int danioFisico = 0;
    private int danioMagico = 0;
    private String tipo = "";

    public Ataque2(int danioFisico, int danioMagico, String tipo){
        this.danioFisico = danioFisico;
        this.danioMagico = danioMagico;
        this.tipo = tipo;
    }

    public Ataque2(){
        this.danioFisico = 41;
        this.danioMagico = 0;
        this.tipo = "Cuerpo a cuerpo.";
    }

    public int getDanioFisico(){
        return this.danioFisico;
    }

    public int getDanioMagico(){
        return this.danioMagico;
    }

    public String getTipo(){
        return this.tipo;
    }
}
