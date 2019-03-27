package br.com.senaigo.TesteEx02;

import java.util.Random;

public class Dado {
	private int numeroDeLados;
	private Random gerador;

	public Dado() {
		gerador = new Random();
	}
	public Dado(int numeroDeLados) {
		this();
		this.numeroDeLados = numeroDeLados;
	}

	public int jogarDados() {
		if(numeroDeLados < 2) return numeroDeLados;
		int pos = 1 + gerador.nextInt(numeroDeLados);
		return pos;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}
	public void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}
}
