package Tema5.ActividadesColecciones.Colecciones2;

public class ManadaLobos extends Avistamiento
{
    int cantidadLobos;
    String observaciones;

    public ManadaLobos(int hora, int cantidadLobos, String observaciones){
        super(hora);
        this.cantidadLobos = cantidadLobos;
        this.observaciones = observaciones;
    }

    @Override
    public String toString(){
        return "Cantidad de lobos: " + cantidadLobos + ", Hora: " + hora + ", Observaciones:" + observaciones;
    }
}
