package Tema6.POO3;

public class AtaqueEspadazoEncantado implements AtaqueAvanzado{

    @Override
    public void lanzar(){
        System.out.println("Ataque lanzado con exito!");
    }

    @Override
    public int[] coste(){
        int[] c = {20,30};
        return c;
    }

    public int[] danoInflingido(){
        int[] d = {45,56};
        return d;
    }
}
