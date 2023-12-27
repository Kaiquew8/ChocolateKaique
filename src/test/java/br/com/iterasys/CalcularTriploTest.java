package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcularTriploTest {
    @Test
    public void calcularTriplo(){
        double num1 = 7;
        double resultadoEsperado = 21;

        double resultadoAtual = CalcularTriplo.calcularTriplo(num1);

        Assert.assertEquals(resultadoAtual, resultadoEsperado );

    }
}
