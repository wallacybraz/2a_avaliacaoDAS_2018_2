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
public class RendimentoBrutoTeste {

    @Parameters
    public static Collection<Object[]> getParameters() {

	Object[] parametro1 = new Object[] { 60, 1000.0f, 8.5f, 13.07f };

	Object[] parametro2 = new Object[] { 120, 500.0f, 8.0f, 13.15f };

	Object[] parametro3 = new Object[] { 240, 3000.0f, 9.0f, 177.0f };

	return Arrays.asList(new Object[][] { parametro1, parametro2, parametro3 });

    }

    public RendimentoBrutoTeste(int diasEntrada, float aplicacaoInicialEntrada, float taxaJurosEntrada,
	    float rendimentoBrutoEsperado) {
	this.diasEntrada = diasEntrada;
	this.aplicacaoInicialEntrada = aplicacaoInicialEntrada;
	this.taxaJurosEntrada = taxaJurosEntrada;
	this.rendimentoBrutoEsperado = rendimentoBrutoEsperado;
    }

    private int diasEntrada;

    private float aplicacaoInicialEntrada;

    private float taxaJurosEntrada;

    private float rendimentoBrutoEsperado;

    @Test
    public void testeCalculadoraRendimentoBruto() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(diasEntrada,
		aplicacaoInicialEntrada, taxaJurosEntrada);
	assertEquals(rendimentoBrutoEsperado, calculadoraRentabilidade.getRendimentoBruto(), 1f);
    }

}
