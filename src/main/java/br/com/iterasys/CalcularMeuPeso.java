package br.com.iterasys;

public class CalcularMeuPeso {

    public static double calcularMeuPeso(double altura, double IMC){
        return Math.pow(altura, 2) * IMC;
    }
}
