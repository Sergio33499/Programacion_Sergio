package Tema5.ActividadesColecciones.Colecciones2;

public class Serpiente extends Avistamiento{
    private double longitud;
    private String especie;

    public Serpiente(int hora, double longitud, String especie){
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }


    @Override
    public String toString() {
        return "Longitud: " + longitud + ", Hora: " + hora + ", Especie:" + especie;
    }
}
