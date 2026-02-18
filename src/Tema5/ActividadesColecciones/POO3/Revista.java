package Tema5.ActividadesColecciones.POO3;

public class Revista extends Ficha{
    int numPublicacion;
    int anio;

    public Revista(int numero, String titulo, int numPublicacion, int anio){
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anio = anio;
    }

    public String toString(){
        return "Revista: " + titulo + ", Numero de publicacion: " + numPublicacion + ", Año: " + anio;
    }
}
