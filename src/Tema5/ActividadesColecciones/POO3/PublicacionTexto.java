package Tema5.ActividadesColecciones.POO3;

public class PublicacionTexto implements PublicacionConReaccion{

    @Override
    public void publicar(){
        System.out.println("Publicando texto...");
    }

    @Override
    public void comentar() {
        System.out.println("Comentario publicado.");
    }

    @Override
    public void compartir(){
        System.out.println("Comentario compartido.");
    }
}
