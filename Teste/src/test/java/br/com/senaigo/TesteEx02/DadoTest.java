package br.com.senaigo.TesteEx02;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import br.com.senaigo.TesteEx02.Dado;

public class DadoTest {

	@Test
	public void testVerificaSeOsLadosDoDadoEstaoCorretos() {
		Dado dado = new Dado(1);
		assertNotEquals(0, dado.jogarDados());
		assertNotEquals(2, dado.jogarDados());
		assertEquals(1, dado.jogarDados());
		Set<Integer> lista = new TreeSet<Integer>();
		dado = new Dado(3);
		do {
			lista.add(dado.jogarDados());
		} while (lista.size() < 3);
		for(Integer x : lista){
			assertTrue(x > 0 && x < 4);
		}
	}

}
