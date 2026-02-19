package Tema5.ActividadesColecciones.Colecciones2;

public abstract class Avistamiento {
    int hora;

    public Avistamiento(int hora){
        this.hora = hora;
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public abstract String toString();
}