package com.wallacy.calculadoraRentabilidade;

public class CalculadoraRentabilidade {

    private int dias;

    private float aplicacaoInicial;

    private float taxaJuros;

    public CalculadoraRentabilidade(int dias, float aplicacaoInicial, float taxaJuros) {
	this.dias = dias;
	this.aplicacaoInicial = aplicacaoInicial;
	this.taxaJuros = taxaJuros;
    }

    public float getRendimentoBruto() {
	float rendimentoBruto = converteDiasParaAno(dias) * aplicacaoInicial * (taxaJuros / 100);
	return rendimentoBruto;
    }

    private float converteDiasParaAno(int dias) {
	return dias / 365.0f;
    }

    public float getImpostoRenda() {
	float rendimento = getRendimentoBruto();
	float aliquota = getAliquotaImposto();
	float impostoRenda = (aliquota / 100.0f) * rendimento;
	return impostoRenda;
    }

    private float getAliquotaImposto() {
	float aliquota = 0.0f;
	if (dias <= 180) {
	    aliquota = 22.5f;
	} else if (dias > 180 && dias <= 360) {
	    aliquota = 20.0f;
	} else if (dias > 361 && dias < 720) {
	    aliquota = 17.5f;
	} else if (dias > 720) {
	    aliquota = 15.0f;
	}
	return aliquota;
    }

}
