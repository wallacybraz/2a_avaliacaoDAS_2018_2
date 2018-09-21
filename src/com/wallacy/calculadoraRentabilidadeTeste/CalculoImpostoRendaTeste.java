package com.wallacy.calculadoraRentabilidadeTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wallacy.calculadoraRentabilidade.CalculadoraRentabilidade;

public class CalculoImpostoRendaTeste {

    @Test
    public void testeCalculaImpostoRenda() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(60, 1000.0f, 8.5f);
	assertEquals(calculadoraRentabilidade.getImpostoRenda(), 3.14f, 1f);
    }

}
