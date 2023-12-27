package br.com.iterasys;

public class Calculadora {

    public static int somarInteiros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println("Soma de " + num1 + " + " + num2 + " = " + soma);
        return soma;

    }
    public static int subtrairInteiros(int num1, int num2){
        int subtrair = num1 - num2;
        System.out.println("Subtracao de " + num1 + " - " + num2 + " = " + subtrair);
        return subtrair;
    }
    public static int dividirInteiros(int num1, int num2){
        int divisao = num1 / num2;
        System.out.println("divisao de " + num1 + " / " + num2 + " = " + divisao);
        return divisao;
    }
    public static int multiplicarinteiros(int num1, int num2){
        int multiplicacao = num1 * num2;
        System.out.println("Multiplicacao de " + num1 + " x " + num2 + " = " + multiplicacao);
        return multiplicacao;
    }
}
