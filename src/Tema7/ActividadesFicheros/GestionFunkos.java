package Tema7.ActividadesFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionFunkos {
    private List<Funko> listaFunkos;
    private String ruta;

    public GestionFunkos(String ruta) {
        this.ruta = ruta;
        this.listaFunkos = loadFunkos();
    }

    public List<Funko> loadFunkos() {
        List<Funko> lista = new ArrayList<>();
        File archivo = new File(ruta);

        if (!archivo.exists()) return lista;

        try (Scanner reader = new Scanner(archivo)) {
            //Saltamos la cabecera
            if (reader.hasNextLine()) {
                reader.nextLine();
            }

            while (reader.hasNextLine()) {
                String linea = reader.nextLine();
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(",");

                String nombre = datos[1];
                String modelo = datos[2];
                double precio = Double.parseDouble(datos[3]); //para parsear el texto y convertirlo en numero

                // Extraemos solo el año del String
                int año = Integer.parseInt(datos[4].split("-")[0]);

                Funko f = new Funko(nombre, modelo, precio, año);
                lista.add(f);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
        return lista;
    }

    public void saveFunkos(List<Funko> lista, String ruta) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ruta))) {
            for (Funko f : lista) {
                writer.println(f.toCSV());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void añadirFunko(Funko f) {
        listaFunkos.add(f);
        saveFunkos(this.listaFunkos, this.ruta);
        System.out.println("Funko guardado con éxito.");
    }

    public boolean borrarFunko(String nombre) {
        boolean eliminado = listaFunkos.removeIf(f -> f.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            saveFunkos(this.listaFunkos, this.ruta);
        }

        return eliminado;
    }

    public void mostrarTodos() {
        if (listaFunkos.isEmpty()) {
            System.out.println("No hay Funkos en el registro.");
        } else {
            for (Funko f : listaFunkos) {
                System.out.println(f);
            }
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
