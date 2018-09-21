package com.wallacy.calculadoraRentabilidadeTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wallacy.calculadoraRentabilidade.CalculadoraRentabilidade;

public class RendimentoBrutoTeste {

    @Test
    public void TestecalculaRendimentoBruto() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(60, 1000f, 8.5f);
	assertEquals(13.97f, calculadoraRentabilidade.getRendimentoBruto(), 1.0f);
    }

    @Test
    public void testeCalculaRendimentoBrutoOutro() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(120, 500f, 8.0f);
	assertEquals(13.15f, calculadoraRentabilidade.getRendimentoBruto(), 1.0f);
    }

}
