package Tema6.POO3;

public class Camion extends Vehiculo{
    int pesoMax;
    boolean mercanciaEsPeligrosa;

    public Camion(String matricula, String marca, String modelo,int anoMatriculacion,int pesoMax, boolean mercanciaEsPeligrosa){
        super(matricula,marca,modelo,anoMatriculacion);
        this.pesoMax = pesoMax;
        this.mercanciaEsPeligrosa = mercanciaEsPeligrosa;
    }
}
