package Tema5.ActividadesColecciones.POO3;

abstract class Figura2D {
    abstract void area();
    abstract void perimetro();
    public abstract String toString();
}

class Rectangulo extends Figura2D{
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

class Cuadrado extends Rectangulo{

    public Cuadrado(int lado){
        super(lado,lado);
    }

    @Override
    public String toString(){
        return "Cuadrado de base: " + base + " y altura: " + altura;
    }
}

class Triangulo extends Figura2D{
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

class Circulo extends Figura2D{
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