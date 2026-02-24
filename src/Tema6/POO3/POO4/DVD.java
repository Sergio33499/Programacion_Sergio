package Tema6.POO3.POO4;

public class DVD extends Biblioteca{
    String director;
    String genero;

    public DVD(String titulo, String id, String director, String genero){
        super(titulo, id);
        this.director = director;
        this.genero = genero;
    }

    public DVD(){
        this.director = "Paco";
        this.genero = "Comedia";
    }

    @Override
    public String toString() {
        return "[DVD] ID: " + id + " | Título: " + titulo + " | Director: " + director + " | Género: " + genero;
    }
}
