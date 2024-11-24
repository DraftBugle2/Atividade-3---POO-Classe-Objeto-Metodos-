package Questao03;

public class Triangulo {
    double a;
    double b;
    double c;

    Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calcularArea() {
        double s = (a + b + c) / 2.0; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    double getB() {
        return b;
    }

    void setB(double b) {
        this.b = b;
    }

    double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }
}

