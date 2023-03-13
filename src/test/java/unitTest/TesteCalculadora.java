package unitTest;// Bibliotecas

import br.com.iterasys.Calculadora;
import org.junit.jupiter.api.Test;
import br.com.iterasys.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Classe
public class TesteCalculadora {
//Atributos

//Funções e Métodos

    @Test
    public void testSomarDoisNumeros() {
        // Configura
        // Valores de entrada
        double num1 = 7;
        double num2 = 5;
        // Valores de saída
        double resultadoEsperado = 12;

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(num1, num2);

        // Valida
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "7,5,12.0",
            "56,44,100.0",
            "10,0,10.0",
            "15,-5,10.0",
            "-8,-6,-14.0",
    }, delimiter = ',')
    public void testSomarDoisNumerosLendoLista(String txtNum1, String txtNum2, String resultadoEsperado) {
        // Configura
        // Valores de entrada
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado),resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test/resources/csv/massaSomar.csv", numLinesToSkip = 1, delimiter = ',')
    public void testSomarDoisNumerosLendoArquivo(String txtNum1, String txtNum2, String resultadoEsperado) {
        // Configura
        // Valores de entrada
        // Os dados de entrada e o resultado esperado vem da lista

        // Executa
        double resultadoAtual = Calculadora.somarDoisNumeros(Integer.valueOf(txtNum1), Integer.valueOf(txtNum2));

        // Valida
        assertEquals(Double.valueOf(resultadoEsperado),resultadoAtual);
    }
    @Test
    public void testarSutbtrairDoisNumeros() {
        //Configura
        //Valores de entrada
        double num1 = 8;
        double num2 = 3;
        // Valores de saída
        double resultadoEsperado = 5;

        // Executa
        double resultadoAtual = Calculadora.subtrairDoisNumeros(num1, num2);

        //Valida
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarMultiplicarDoisNumeros() {
        //Configura
        //Valores de entrada
        double num1 = 10;
        double num2 = 2;
        // Valores de saída
        double resultadoEsperado = 20;

        // Executa
        double resultadoAtual = Calculadora.multiplicarDoisNumeros(num1, num2);

        //Valida
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testeDividirDoisNumerosInteiros() {
        //Configura
        //Valores de entrada
        int numA = 8;
        int numB = 0;
        // Valores de saída
        String resultadoEsperado = "Não é possível dividir por zero";

        // Executa
        String resultadoAtual = Calculadora.dividirDoisNumerosInteiros(numA, numB);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }
}

