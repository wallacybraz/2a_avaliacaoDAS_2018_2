package com.wallacy.calculadoraRentabilidadeTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wallacy.calculadoraRentabilidade.CalculadoraRentabilidade;

public class CalculoImpostoRendaTeste {

    @Test
    public void testeCalculaImpostoRenda() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(60, 1000.0f, 8.5f);
	assertEquals(calculadoraRentabilidade.getImpostoRenda(), 3.14f, 0.05f);
    }

    @Test
    public void testeCalculaImpostoRendaOutro() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(120, 500.0f, 8.0f);
	assertEquals(calculadoraRentabilidade.getImpostoRenda(), 2.96f, 0.05f);
    }

}
