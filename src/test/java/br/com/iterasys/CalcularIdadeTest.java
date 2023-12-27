package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcularIdadeTest {

    @Test
    public void calcularIdade(){
        double AnoAtual = 2023;
        double AnoNascimento = 1993;
        double resultadoEsperado = 30;

        double resultadoAtual = CalcularIdade.calcularIdade(AnoAtual, AnoNascimento);

        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}
