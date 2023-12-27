package exercicio;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaGeometricaTest {

    @Test
    public void TesteareaDoQuadrado(){
        int num1 = 4;
        int num2 = 4;

        int resultadoEsperado = 16;

        int resultadoAtual = AreaGeometrica.areaDoQuadrado(num1, num2);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
    @Test
    public void TesteareadoRetangulo(){
        int comprimento = 10;
        int largura = 5;

        int resultadoEsperado = 50;
        int resultadoAtual = AreaGeometrica.areadoRetangulo(comprimento, largura);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }
    @Test
    public void TesteareadoTriangulo(){
        int base = 6;
        int altura = 10;
        int num3 = 2;

        int resultadoEsperado = 30;
        int resultadoAtual = AreaGeometrica.areadoTriangulo(base, altura, num3);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void TesteareadoCirculo(){
        int raio = 4;
        double resultadoEsperado = 50.24;
        double resultadoAtual = AreaGeometrica.areadoCirculo(raio);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

}
