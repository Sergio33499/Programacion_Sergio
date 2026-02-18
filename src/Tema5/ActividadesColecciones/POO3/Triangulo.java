package Tema5.ActividadesColecciones.POO3;

public class Triangulo extends Figura2D{
    double base;
    double altura;
    double lado1,lado2,lado3;

    public Triangulo(int base, int altura, int lado1, int lado2, int lado3){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    void area(){
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    @Override
    void perimetro(){
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es: " + perimetro);
    }

    public String toString(){
        return "Triangulo de base: " + base + " y altura: " + altura;
    }
}
