package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcularDivisaoTest {

    @Test
    public void calcularDivisao(){
        double num1 = 100;
        double num2 = 25;
        double resultadoEsperado = 4;

        double resultadoAtual = CalcularDivisao.calcularDivisao(num1, num2);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}
