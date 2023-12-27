// 1 - Pacote
package br.com.iterasys;
// 2 - Importacao de Bibliotecas


// 3 - Classe
public class Encomenda {
    // 3.1 Atributos

    // 3.2 Funcoes e Metodos
    public static int calcularBarrasDeChocolatesPorCaixa(int barras){
        byte quantidadePorCaixa = 12;
        int caixas = barras / quantidadePorCaixa;
        int unidades = barras % quantidadePorCaixa;
        System.out.println("Quantidade de Caixas: " + caixas);
        System.out.println("unidades: " + unidades);
        return barras;
    } // fim do calcular barras de chocolate
} // fim da classe Encomenda
