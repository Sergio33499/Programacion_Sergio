package Tema5.ActividadesColecciones.POO3;

public class AtaqueBolaFuego implements AtaqueAvanzado{

    @Override
    public void lanzar(){
        System.out.println("Ataque lanzado con exito!");
    }

    @Override
    public int[] coste(){
        int[] c = {30,14};
        return c;
    }

    public int[] danoInflingido(){
        int[] d = {35,56};
        return d;
    }
}
