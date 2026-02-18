package Tema5.ActividadesColecciones.POO3;

public class Rectangulo extends Figura2D{
    int base;
    int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    void area(){
        int area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }

    @Override
    void perimetro(){
        int perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public String toString(){
        return "Rectangulo de base: " + base + " y altura: " + altura;
    }
}
