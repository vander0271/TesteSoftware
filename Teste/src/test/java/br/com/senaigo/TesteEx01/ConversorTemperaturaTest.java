package br.com.senaigo.TesteEx01;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.senaigo.TesteEx01.ConversorTemperatura;

public class ConversorTemperaturaTest {
	ConversorTemperatura conversorTemperaturaTeste;
	
	@Test
	public void testeConverterCelsiusParaFahrenheit() {
		double saida = ConversorTemperatura.converterCelsiusParaFahrenheit(50);
		assertEquals(122.0, saida, 0.0001);
	}

	@Test
	public void testeConverterFahrenheitParaCelsius() {
		double saida = ConversorTemperatura.converterFahrenheitParaCelsius(50);
		assertEquals(10.0, saida, 0.0001);
	}

}
