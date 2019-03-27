package br.com.senaigo.TesteEx01;

public class ConversorTemperatura {
	public static double converterCelsiusParaFahrenheit(double celsius) {
		double fahrenheit = 1.8 * celsius + 32;
		return fahrenheit;
	}
	public static double converterFahrenheitParaCelsius(double fahrenheit) {
		double celsius = (5.0/9.0) * (fahrenheit - 32);
		return celsius;
	}
}
