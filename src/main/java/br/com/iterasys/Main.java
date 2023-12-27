package br.com.iterasys;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ola Mundo!");
        chamarEncomenda();
        Calculadora.somarInteiros(5,7);
        Calculadora.subtrairInteiros(7,2);
        Calculadora.dividirInteiros(20,5);
        Calculadora.multiplicarinteiros(3,7);
    }
public static void chamarEncomenda(){
    int barras = 40;
    Encomenda.calcularBarrasDeChocolatesPorCaixa(barras);
    }
}
