package exercicio;

import static java.lang.Math.PI;

public class AreaGeometrica {

    public static int areaDoQuadrado(int num1, int num2) {
        int multiplicaLados = num1 * num2;
        System.out.println("A Area do Quadrado equivale a (lado x lado) " + num1 + " x " + num2 + " = " + multiplicaLados);
        return multiplicaLados;
    }

    public static int areadoRetangulo(int comprimento, int largura) {
        int area = comprimento * largura;
        System.out.println("A Area do Retangulo Equivale a (comprimento x largura) " + comprimento + " x " + largura + " = " + area);
        return area;
    }

    public static int areadoTriangulo(int base, int altura, int num3) {
        int areaTri = base * altura / num3;
        System.out.println("A Area do Triangulo Equivale a (base x altura / 2) " + base + " x " + altura + " / " + num3 + " = " + areaTri);
        return areaTri;
    }

    public static double areadoCirculo(int raio) {
        double pi = 3.14;
        double areaCirculo = pi * raio * raio;
        System.out.println("A área do círculo com raio " + raio + " é: " + areaCirculo);
        return areaCirculo;
    }

}



