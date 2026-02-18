package Tema5.ActividadesColecciones.POO3;

public class PublicacionFoto implements PublicacionConReaccion,AbrirPublicacion{

    @Override
    public void publicar(){
        System.out.println("Publicando foto...");
    }

    @Override
    public void compartir(){
        System.out.println("Foto compartido.");
    }

    @Override
    public void comentar() {
        System.out.println("Comentario publicado.");
    }

    @Override
    public void abrir(){
        System.out.println("Se ha descargado la foto para abrir.");
    }
}
