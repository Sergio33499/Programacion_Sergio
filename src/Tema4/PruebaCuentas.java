package Tema4;

import java.util.Scanner;

public class PruebaCuentas {

    private static Scanner scanner = new Scanner(System.in);
    private static Persona2[] personas = new Persona2[10];
    private static int contadorPersonas = 0;

    public static void main(String[] args) {
        int op = -1;

        while (op != 0) {
            System.out.println("\n--- MENÚ GESTIÓN BANCARIA ---");
            System.out.println("1. Instanciar objeto Persona");
            System.out.println("2. Instanciar Cuenta y asociarla a persona");
            System.out.println("3. Mostrar datos de una persona (DNI)");
            System.out.println("4. Recibir nómina (DNI + Cuenta)");
            System.out.println("5. Realizar pago (DNI + Cuenta)");
            System.out.println("6. Realizar transferencia");
            System.out.println("7. Imprimir personas morosas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    instanciarPersona();
                    break;
                case 2:
                    instanciarCuenta();
                    break;
                case 3:
                    mostrarPersona();
                    break;
                case 4:
                    recibirNomina();
                    break;
                case 5:
                    realizarPago();
                    break;
                case 6:
                    realizarTransferencia();
                    break;
                case 7:
                    imprimirMorosos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static Persona2 buscarPersona(String dniBuscado) {
        for (int i = 0; i < contadorPersonas; i++) {
            if (personas[i].dni.equals(dniBuscado)) {
                return personas[i];
            }
        }
        System.out.println("Persona no encontrada");
        return null;
    }

    public static void instanciarPersona() {
        if (contadorPersonas >= personas.length) {
            System.out.println("ERROR. No cabe mas gente");
        } else {
            System.out.print("Introduce el DNI: ");
            String dni = scanner.nextLine();
            personas[contadorPersonas] = new Persona2(dni, null);
            contadorPersonas++;
        }
    }

    public static void instanciarCuenta() {
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        Persona2 p = buscarPersona(dni);
        if (p != null) {
            System.out.print("Introduce el numero de cuenta: ");
            String num = scanner.nextLine();
            System.out.print("Introduce el saldo inicial: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine();

            Cuenta nueva = new Cuenta(num, saldo);
            p.anadirCuentas(nueva);
        }
    }

    public static void mostrarPersona() {
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        Persona2 p = buscarPersona(dni);

        if (p != null) {
            System.out.println("DNI: " + p.dni);
            for (int i = 0; i < p.misCuentas.length; i++) {
                if (p.misCuentas[i] != null) {
                    System.out.println("Cuenta: " + p.misCuentas[i].numCuenta + " Saldo: " + p.misCuentas[i].consultarSaldo());
                }
            }
        }
    }

    public static void recibirNomina() {
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        Persona2 p = buscarPersona(dni);
        if (p != null) {
            System.out.print("Introduce el numero de cuenta: ");
            String numCuenta = scanner.nextLine();
            System.out.print("Importe: ");
            double importe = scanner.nextDouble();
            scanner.nextLine();

            boolean encontrada = false;
            for (int i = 0; i < p.misCuentas.length; i++) {
                if (p.misCuentas[i] != null && p.misCuentas[i].numCuenta.equals(numCuenta)) {
                    p.misCuentas[i].abonar(importe);
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) System.out.println("Cuenta no encontrada");
        }
    }

    public static void realizarPago() {
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        Persona2 p = buscarPersona(dni);
        if (p != null) {
            System.out.print("Introduce el numero de cuenta: ");
            String numCuenta = scanner.nextLine();
            System.out.print("Importe: ");
            double importe = scanner.nextDouble();
            scanner.nextLine();

            boolean encontrada = false;
            for (int i = 0; i < p.misCuentas.length; i++) {
                if (p.misCuentas[i] != null && p.misCuentas[i].numCuenta.equals(numCuenta)) {
                    p.misCuentas[i].pagar(importe);
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) System.out.println("Cuenta no encontrada");
        }
    }

    public static void realizarTransferencia() {
        System.out.print("DNI Origen: ");
        Persona2 emisor = buscarPersona(scanner.nextLine());
        System.out.print("DNI Destino: ");
        Persona2 receptor = buscarPersona(scanner.nextLine());

        if (emisor != null && receptor != null) {
            System.out.print("Cuenta Origen: ");
            String c1 = scanner.nextLine();
            System.out.print("Cuenta Destino: ");
            String c2 = scanner.nextLine();
            System.out.print("Cantidad: ");
            double cant = scanner.nextDouble();
            scanner.nextLine();

            Cuenta origen = null, destino = null;
            for (Cuenta c : emisor.misCuentas) if (c != null && c.numCuenta.equals(c1)) origen = c;
            for (Cuenta c : receptor.misCuentas) if (c != null && c.numCuenta.equals(c2)) destino = c;

            if (origen != null && destino != null) {
                origen.pagar(cant);
                destino.abonar(cant);
            } else {
                System.out.println("Cuentas no validas");
            }
        }
    }

    public static void imprimirMorosos(){
        for (int i = 0; i < contadorPersonas; i++) {
            if (personas[i].esMoroso()){
                System.out.println("Moroso DNI: " + personas[i].dni);
            }
        }
    }

}