package br.com.iterasys;


import juntos.Calculadora2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalcularIMC {

    @Test
    public void calcularIMC(){
        double peso = 113;
        double altura = 1.79;
        double resultadoEsperado = 35;

        double resultadoAtual = CalcularIMC.calcularIMC(peso, altura);

        Assert.assertEquals(resultadoAtual, resultadoEsperado, 0.3);
    }
}
