package br.com.senaigo.TesteEx02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.senaigo.TesteEx02.Jogador;
import br.com.senaigo.TesteEx02.Jogo;

public class JogoTest {
	private Jogo jogo;
	
	@Before
	public void inicializa() {
		Jogador jogador1 = new Jogador("Primeiro");
		Jogador jogador2 = new Jogador("Segundo");
		Jogador jogador3 = new Jogador("Terceiro");
		jogo = new Jogo(10, jogador1, jogador2, jogador3);
	}
	
	@Test
	public void testVericaSeExisteJogadores() {
		assertNotNull(jogo.getJogadores());
		assertNotNull(jogo.getJogadores()[0]);
		assertNotNull(jogo.getJogadores()[1]);
	}

	@Test
	public void testMostrarVencedor() {
		jogo.iniciar(3);
		assertEquals(true, jogo.mostrarVencedor());
	}
	
	@Test
	public void testSortearIniciante() {
		Jogador[] vetor = new Jogador[50];
		for (int i = 0; i < 50; i++) {
			vetor[i] = new Jogador("jogador " + i);
		}
		jogo = new Jogo(10, vetor);
		assertEquals(vetor.toString(), jogo.getJogadores().toString());
		jogo.sortearIniciante();
		assertNotEquals(vetor.toString(), jogo.getJogadores().toString());
	}
}
