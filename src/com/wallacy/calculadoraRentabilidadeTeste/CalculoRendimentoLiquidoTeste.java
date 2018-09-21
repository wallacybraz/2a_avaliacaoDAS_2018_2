package com.wallacy.calculadoraRentabilidadeTeste;

import org.junit.Test;

import com.wallacy.calculadoraRentabilidade.CalculadoraRentabilidade;

public class CalculoRendimentoLiquidoTeste {

    @Test
    public void testCalculoRendimentoLiquido() {
	CalculadoraRentabilidade calculadoraRentabilidade = new CalculadoraRentabilidade(60, 1000.0f, 8.5f);
	calculadoraRentabilidade.getRendimentoLiquido();
    }

}
