package br.com.senaigo.TesteEx01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.senaigo.TesteEx01.TemperaturaCelsius;

public class TemperaturaCelsiusTest {
	private TemperaturaCelsius temperaturaCelsiusTeste;

	@Before
	public void init() {
		temperaturaCelsiusTeste = new TemperaturaCelsius(0);
	}

	@Test
	public void testeConverterCelsiusParaFahrenheit() {
		double saida = temperaturaCelsiusTeste.converterCelsiusParaFahrenheit();
		assertEquals(32.0, saida, 0.0001);
	}

}
