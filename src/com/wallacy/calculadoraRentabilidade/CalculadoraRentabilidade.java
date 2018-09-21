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

}
