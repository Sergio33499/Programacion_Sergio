package Tema5.ActividadesColecciones.POO3;

public class PublicacionVideo implements PublicacionConReaccion,AbrirPublicacion{

    @Override
    public void publicar(){
        System.out.println("Publicando video...");
    }

    @Override
    public void compartir(){
        System.out.println("Video compartido.");
    }

    @Override
    public void comentar() {
        System.out.println("Comentario publicado.");
    }

    @Override
    public void abrir(){
        System.out.println("Se ha descargado el video para abrir.");
    }
}
