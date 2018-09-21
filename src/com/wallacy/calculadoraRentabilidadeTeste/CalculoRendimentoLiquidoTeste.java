package com.wallacy.calculadoraRentabilidadeTeste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wallacy.calculadoraRentabilidade.CalculadoraRentabilidade;

public class CalculoRendimentoLiquidoTeste {

    @Test
    public void testCalculoRendimentoLiquido() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(60, 1000.0f, 8.5f);
	assertEquals(calculadoraRentabilidade.getRendimentoLiquido(), 1.0829f, 0.05f);
    }

}
