package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcularMeuPesoTest {
    @Test
    public void calcularMeuPeso(){
        double altura = 1.79;
        double IMC = 35.4;
        double resultadoEsperado = 113;

        double resultadoAtual = CalcularMeuPeso.calcularMeuPeso(altura, IMC);
        Assert.assertEquals(resultadoAtual, resultadoEsperado, 0.5);

    }
}
