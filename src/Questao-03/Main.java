package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as medidas dos lados do triângulo X:");
        System.out.print("Lado a: ");
        double aX = scanner.nextDouble();
        System.out.print("Lado b: ");
        double bX = scanner.nextDouble();
        System.out.print("Lado c: ");
        double cX = scanner.nextDouble();

        Triangulo trianguloX = new Triangulo(aX, bX, cX);

        System.out.println("Digite as medidas dos lados do triângulo Y:");
        System.out.print("Lado a: ");
        double aY = scanner.nextDouble();
        System.out.print("Lado b: ");
        double bY = scanner.nextDouble();
        System.out.print("Lado c: ");
        double cY = scanner.nextDouble();
        
        Triangulo trianguloY = new Triangulo(aY, bY, cY);

        double areaX = trianguloX.calcularArea();
        double areaY = trianguloY.calcularArea();

        System.out.printf("Área do triângulo X: %.2f%n", areaX);
        System.out.printf("Área do triângulo Y: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triângulo X possui a maior área.");
        } else if (areaY > areaX) {
            System.out.println("O triângulo Y possui a maior área.");
        } else {
            System.out.println("Os dois triângulos possuem a mesma área.");
        }

        scanner.close();
    }
}



