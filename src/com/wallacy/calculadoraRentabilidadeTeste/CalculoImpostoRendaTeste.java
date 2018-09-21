package com.wallacy.calculadoraRentabilidadeTeste;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.wallacy.calculadoraRentabilidade.CalculadoraRentabilidade;

@RunWith(Parameterized.class)
public class CalculoImpostoRendaTeste {

    @Parameters
    public static Collection<Object[]> getParameters() {

	Object[] parametro1 = new Object[] { 60, 1000.0f, 8.5f, 3.14f };

	Object[] parametro2 = new Object[] { 120, 500.0f, 8.0f, 2.96f };

	Object[] parametro3 = new Object[] { 240, 3000.0f, 9.0f, 35.51f };

	return Arrays.asList(new Object[][] { parametro1, parametro2, parametro3 });

    }

    public CalculoImpostoRendaTeste(int diasEntrada, float aplicacaoInicialEntrada, float taxaJurosEntrada,
	    float impostoEsperado) {
	this.diasEntrada = diasEntrada;
	this.aplicacaoInicialEntrada = aplicacaoInicialEntrada;
	this.taxaJurosEntrada = taxaJurosEntrada;
	this.impostoEsperado = impostoEsperado;
    }

    private int diasEntrada;

    private float aplicacaoInicialEntrada;

    private float taxaJurosEntrada;

    private float impostoEsperado;

    @Test
    public void testeCalculaImpostoRenda() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(diasEntrada,
		aplicacaoInicialEntrada, taxaJurosEntrada);
	assertEquals(calculadoraRentabilidade.getImpostoRenda(), impostoEsperado, 0.05f);
    }

}
