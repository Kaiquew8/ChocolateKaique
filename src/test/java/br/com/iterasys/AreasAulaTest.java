package br.com.iterasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreasAulaTest {

    @Test
    public void testarCalcularQuadrado(){
        //Configura
        double lado = 3;
        double resultadoEsperado = 9;

        //Executa
        double resultadoAtual = AreasAula.calcularQuadrado(lado);
        //Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarCalcularRetangulo(){
        // Configura
        double largura = 4;
        double comprimento = 5;
        double resultadoEsperado = 20;

        // Executa
        double resultadoAtual = AreasAula.calcularRetangulo(largura, comprimento);

        // Valida
        Assert.assertEquals(resultadoEsperado, resultadoAtual, 0.0001);
    }

    @Test
    public void testarCalcularTriangulo(){
        // Configura
        double largura = 4;
        double comprimento = 3;
        double resultadoEsperado = 6;

        // Executa
        double resultadoAtual = AreasAula.calcularTriangulo(largura, comprimento);

        // Valida
        Assert.assertEquals(resultadoEsperado, resultadoAtual, 0.0001);
    }

    @Test
    public void testarCalcularCirculo(){
        // Configura
        double raio = 3;
        double resultadoEsperado = Math.PI * 3 * 3; // Área do círculo = π * raio^2

        // Executa
        double resultadoAtual = AreasAula.calcularCirculo(raio);

        // Valida
        Assert.assertEquals(resultadoEsperado, resultadoAtual, 0.0001);
    }

}
