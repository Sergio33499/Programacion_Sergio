package Tema7.ActividadesFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionFunkosBinario {
    private List<Funko> listaFunkos;
    private String ruta;

    public GestionFunkosBinario(String ruta) {
        this.ruta = ruta;
        this.listaFunkos = loadFunkos();
    }

    @SuppressWarnings("unchecked")
    public List<Funko> loadFunkos() {
        File archivo = new File(ruta);
        if (!archivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (List<Funko>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el archivo binario: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void saveFunkos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(this.listaFunkos);
        } catch (IOException e) {
            System.out.println("Error al guardar en binario: " + e.getMessage());
        }
    }

    public void añadirFunko(Funko f) {
        listaFunkos.add(f);
        saveFunkos();
        System.out.println("Funko guardado (Serializado) con éxito.");
    }

    public boolean borrarFunko(String nombre) {
        boolean eliminado = listaFunkos.removeIf(f -> f.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            saveFunkos();
        }
        return eliminado;
    }

    public void mostrarTodos() {
        if (listaFunkos.isEmpty()) {
            System.out.println("No hay Funkos en el registro.");
        } else {
            for (Funko f : listaFunkos) System.out.println(f);
        }
    }

    public void mostrarMasCaro() {
        if (listaFunkos.isEmpty()) {
            System.out.println("No hay funkos para comparar.");
            return;
        }
        Funko caro = listaFunkos.get(0);
        for (Funko f : listaFunkos) {
            if (f.getPrecio() > caro.getPrecio()) {
                caro = f;
            }
        }
        System.out.println("El Funko más caro es: " + caro);
    }

    public void mostrarMediaPrecio() {
        if (listaFunkos.isEmpty()) {
            System.out.println("La media es 0€.");
            return;
        }
        double suma = 0;
        for (Funko f : listaFunkos) {
            suma += f.getPrecio();
        }
        double media = suma / listaFunkos.size();
        System.out.printf("La media de precio de los funkos es: %.2f€\n", media);
    }

    public void mostrarPorModelo() {
        if (listaFunkos.isEmpty()) {
            System.out.println("No hay funkos para agrupar.");
            return;
        }
        List<String> modelos = new ArrayList<>();
        for (Funko f : listaFunkos) {
            if (!modelos.contains(f.getModelo())) {
                modelos.add(f.getModelo());
            }
        }
        for (String m : modelos) {
            System.out.println("\nModelo: " + m);
            for (Funko f : listaFunkos) {
                if (f.getModelo().equals(m)) {
                    System.out.println(" - " + f.getNombre());
                }
            }
        }
    }

    public void mostrarFunkos2023() {
        boolean encontrado = false;
        System.out.println("--- Funkos del año 2023 ---");
        for (Funko f : listaFunkos) {
            if (f.getFecha() == 2023) {
                System.out.println(f);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron funkos del año 2023.");
        }
    }
}