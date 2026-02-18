package Tema5.ActividadesColecciones.POO3;

public class Circulo extends Figura2D{
    double radio;
    double pi = Math.PI;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    void area(){
        double area = pi * (radio * radio);
        System.out.println("El area del circulo es: " + area);
    }

    @Override
    void perimetro(){
        double perimetro = 2 * pi * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    public String toString(){
        return "Circulo con radio de: " + radio;
    }
}
