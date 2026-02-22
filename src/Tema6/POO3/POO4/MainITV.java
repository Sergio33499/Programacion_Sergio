package Tema6.POO3.POO4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainITV {
    public static MedioTransporte generarTransporteRandom(Random random){
        int tipo = random.nextInt(5);

        if (tipo == 0) {
            return new Turismo("MAT-T" + random.nextInt(1000));
        } else if (tipo == 1) {
            return new Camion("MAT-C" + random.nextInt(1000));
        } else if (tipo == 2) {
            return new Ciclomotor("MAT-M" + random.nextInt(1000));
        } else if (tipo == 3) {
            return new Avion("AIR-" + random.nextInt(1000));
        } else {
            return new Barco("SEA-" + random.nextInt(1000));
        }
    }

    public static void registrarEntrada(MedioTransporte mt, List<RegistroITV> lista){
        RegistroITV nuevoRegistro = new RegistroITV(mt);
        lista.add(nuevoRegistro);

        System.out.println("Registrado: " + mt.getClass().getSimpleName() +
                " con ID: " + mt.getIdentificador());
    }

    public static void main(String[] args){
        List<RegistroITV> registro = new ArrayList<>();
        Random rd = new Random();
        int segundosSimulacion = 10;
        for (int i = 0; i < segundosSimulacion; i++) {
            try {
                MedioTransporte v = generarTransporteRandom(rd);
                registrarEntrada(v, registro);

                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n--- LISTADO DE LA ITV ---");
        for (RegistroITV r : registro) {
            System.out.println(r.toString());
        }
    }
}
