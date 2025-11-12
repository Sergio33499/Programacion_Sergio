    package Tema3;

    import java.util.Scanner;

    import static Tema3.Ejercicio1.numberSign;

    public class Ejercicio10 {

        public static void showMenu() {
            System.out.println("----- MENÚ -----");
            System.out.println("a) Signo de un número");
            System.out.println("b) Mayor de edad");
            System.out.println("c) Área y perímetro de un círculo");
            System.out.println("d) Conversor euros/dólares");
            System.out.println("e) Tabla de multiplicar de un número");
            System.out.println("f) Tablas del 1 al 10");
            System.out.println("g) Comprobador de números primos");
            System.out.println("h) Comprobador de fechas");
            System.out.println("i) Dibujar triángulos");
            System.out.println("x) Salir");
            System.out.print("Elige una opción: ");
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char opcion = ' ';

            while (opcion != 'x') {
                showMenu();
                opcion = scanner.next().charAt(0);

                if (opcion == 'a') {
                    System.out.println("Dime un numero entero: ");
                    int numero = scanner.nextInt();

                    int result = numberSign(numero);

                    if (result == 1) {
                        System.out.println(result);
                    } else if (result == -1) {
                        System.out.println(result);
                    } else {
                        System.out.println(result);
                    }
                } else if (opcion == 'b') {
                    System.out.println("Introduce tu edad: ");
                    int edad = scanner.nextInt();

                    if (Ejercicio2.isAdult(edad)) {
                        System.out.println("Eres mayor de edad.");
                    } else {
                        System.out.println("No eres mayor de edad.");
                    }
                } else if (opcion == 'c') {
                    System.out.print("Introduce un radio válido (Mayor a 0): ");
                    double radius = scanner.nextDouble();

                    if (!Ejercicio3.validRadius(radius)) {
                        System.out.println("ERROR: El radio introducido no es válido.");
                    } else {
                        double perimeter = Ejercicio3.calculateCirclePerimeter(radius);
                        double area = Ejercicio3.calculateCircleArea(radius);

                        System.out.println("\nRESULTADOS:");
                        System.out.println("RADIO: " + radius);
                        System.out.println("PERIMETRO: " + perimeter);
                        System.out.println("AREA: " + area);
                    }
                } else if (opcion == 'd') {
                    System.out.println("---CONVERSOR DE MONEDA---");
                    System.out.println("1. Convertir euros a dólares.");
                    System.out.println("2. Convertir dólares a euros.");
                    System.out.print("Selecciona una opción: ");
                    int subOpcion = scanner.nextInt();

                    System.out.print("Introduce la cantidad: ");
                    double cantidad = scanner.nextDouble();

                    if (subOpcion == 1) {
                        System.out.println(cantidad + " euros son " + Ejercicio4.euro2Dollar(cantidad) + " dólares.");
                    } else if (subOpcion == 2) {
                        System.out.println(cantidad + " dólares son " + Ejercicio4.dollar2Euro(cantidad) + " euros.");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                } else if (opcion == 'e') {
                    int num = 0;

                    while (num < 1 || num > 10) {
                        System.out.print("Introduce un número del 1-10: ");
                        num = scanner.nextInt();

                        if (num < 1 || num > 10) {
                            System.out.println("Número inválido. Intenta de nuevo.");
                        }
                    }

                    Ejercicio5.mostrarTabla(num);
                } else if (opcion == 'f') {
                    for (int num = 1; num <= 10; num++) {
                        Ejercicio6.mostrarTabla(num);
                    }
                } else if (opcion == 'g') {
                    int num = -1;
                    System.out.println("Introduce una serie de números enteros positivos (0 para terminar)");

                    while (num != 0) {
                        System.out.print("Número: ");
                        num = scanner.nextInt();

                        if (num < 0) {
                            System.out.println("Por favor, introduce solo números positivos");
                        } else if (num != 0) {
                            if (Ejercicio7.esPrimo(num)) {
                                System.out.println(num + " es primo");
                            } else {
                                System.out.println(num + " no es primo");
                            }
                        }
                    }

                    System.out.println("Comprobación de primos terminada");
                } else if (opcion == 'h') {
                    System.out.print("Dime un día: ");
                    int dia = scanner.nextInt();

                    System.out.print("Dime un mes: ");
                    int mes = scanner.nextInt();

                    System.out.print("Dime un año: ");
                    int anio = scanner.nextInt();

                    boolean valida = Ejercicio8.esFechaValida(dia, mes, anio);

                    if (valida) {
                        System.out.println("La fecha es válida.");
                    } else {
                        System.out.println("La fecha no es válida.");
                    }
                } else if (opcion == 'i') {
                    System.out.print("Introduce el carácter del triángulo: ");
                    char c = scanner.next().charAt(0);

                    System.out.print("Introduce el número de líneas: ");
                    int n = scanner.nextInt();

                    if (n <= 0) {
                        System.out.println("El número de líneas debe ser mayor a 0.");
                    } else {
                        Ejercicio9.dibujarTriangulo(c, n);
                    }
                }
            }
        }
    }

