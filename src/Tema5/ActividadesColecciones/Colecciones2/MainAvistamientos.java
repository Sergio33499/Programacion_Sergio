package Tema5.ActividadesColecciones.Colecciones2;

import java.util.ArrayList;
import java.util.List;

public class MainAvistamientos {
    public static void main(String[] args) {
        List<Avistamiento> misAvistamientos = new ArrayList<>();
        GestionParque gestor = new GestionParque();

        gestor.anadirAvistamiento(misAvistamientos, new Serpiente(10, 1.5, "Víbora Hocicuda"));
        gestor.anadirAvistamiento(misAvistamientos, new Serpiente(2, 0.8, "Culebra de agua"));

        gestor.anadirAvistamiento(misAvistamientos, new Pajaro(7, 0.450, "Halcón Peregrino"));
        gestor.anadirAvistamiento(misAvistamientos, new Pajaro(15, 0.025, "Gorrión"));

        gestor.anadirAvistamiento(misAvistamientos, new ManadaLobos(22, 5, "Cerca del río Duero"));
        gestor.anadirAvistamiento(misAvistamientos, new ManadaLobos(4, 3, "Aullando en la colina"));

        System.out.println("========================================");
        gestor.avistamiendosDesdeLasOcho(misAvistamientos);

        System.out.println("\n========================================");
        gestor.mostrarAvistamientosNocturnos(misAvistamientos);

        System.out.println("\n========================================");
        gestor.mostrarSerpientes(misAvistamientos);

        System.out.println("\n========================================");
        gestor.mostrarPajaros(misAvistamientos);

        System.out.println("\n========================================");
        gestor.mostrarManadaLobos(misAvistamientos);
    }
}
