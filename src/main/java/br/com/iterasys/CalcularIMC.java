package br.com.iterasys;

public class CalcularIMC {

    public static double calcularIMC(double peso, double altura){
        return peso / Math.pow(altura, 2);
    }
}
