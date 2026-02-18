package Tema5.ActividadesColecciones.POO3;

public class AtaqueMagico implements Ataque{

    @Override
    public void lanzar(){
        System.out.println("El ataque ha sido lanzdo con exito!");
    }

    @Override
    public int coste(){
        return 30;
    }

    @Override
    public int danoInflingido(){
        return 50;
    }
}
