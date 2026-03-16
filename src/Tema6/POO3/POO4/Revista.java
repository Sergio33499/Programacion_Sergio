package Tema6.POO3.POO4;

public class Revista extends Biblioteca{
    int numEdicion;
    int anioPublicacion;

    public Revista(String titulo, String id, int numEdicion, int anioPublicacion){
        super(titulo,id);
        this.numEdicion = numEdicion;
        this.anioPublicacion = anioPublicacion;
    }

    public Revista(){
        this.numEdicion = 4;
        this.anioPublicacion = 2014;
    }

    @Override
    public String toString() {
        return "[Revista] ID: " + id + " | Título: " + titulo + " | Edición: " + numEdicion + " | Año: " + anioPublicacion;
    }
}
