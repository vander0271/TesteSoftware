package br.com.senaigo.TesteEx02;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Jogo {
	protected int objetivo;
	private Jogador[] jogadores;

	public Jogo(int objetivo, Jogador ...jogadores) {
		this.objetivo = objetivo;
		this.jogadores = jogadores;
	}

	public void sortearIniciante() {
		Map<Integer, Jogador> mapa = new TreeMap<Integer, Jogador>();
		Random random = new Random();
		for (int i = 0; i < jogadores.length; i++) {
			int p;
			do {
				p = random.nextInt(10000);
			} while (mapa.containsKey(p));

			mapa.put(p, jogadores[i]);
		}
		Jogador[] vet = new Jogador[jogadores.length];
		int i = 0;
		for(Integer key : mapa.keySet()) {
			vet[i] = mapa.get(key);
			i ++;
		}
		jogadores = vet;
	}
	
	public void iniciar(int ladosDado) {
		Dado dado = new Dado(ladosDado);
		do {
			sortearIniciante();
			Integer maior = 0;
			List<Jogador> campeoes = new LinkedList<Jogador>();
			Map<Jogador, Integer> rodada = new HashMap<Jogador, Integer>();
			for (int i = 0; i < jogadores.length; i++) {
				rodada.put(jogadores[i], dado.jogarDados());
				if(rodada.get(jogadores[i]) > maior) {
					maior = rodada.get(jogadores[i]);
					campeoes = new LinkedList<Jogador>();
					campeoes.add(jogadores[i]);
				}
				else if(rodada.get(jogadores[i]) == maior) {
					campeoes.add(jogadores[i]);
				}
			}
			for(Jogador jogador : campeoes) {
				jogador.aumentarPontos();
			}
			this.mostrarSituacao();
		} while (!mostrarVencedor());
	}

	public boolean mostrarVencedor() {
		for (int i = 0; i < jogadores.length; i++) {
			if(jogadores[i].jaGanhou()) {
				System.out.println("Ganhador == " + jogadores[i].nome);
				return true;
			}
		}
		System.out.println("N�o houve Ganhador");
		return false;
	}
	
	public void mostrarSituacao() {
		StringBuilder tudo = new StringBuilder("\n");
		for (int i = 0; i < jogadores.length; i++) {
			tudo.append("Jogador ").append(jogadores[i].nome).append(" pontos == ").append(jogadores[i].pontos).append("\n");
		}
		System.out.println(tudo.toString());
	}

	public int getObjetivo() {
		return objetivo;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public Jogador getJogadores(int pos) {
		return jogadores[pos];
	}
}
