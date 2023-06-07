package br.com.senaisp.richard.licao06;

import java.util.Random;

public class Baralho {
	//Matriz tridimensional 1º naipe, 2º carta, 3º usado ou não
	private CartaBaralho[][] baralhoCartas;
	private Random rnd;
	private boolean[][] cartaUtilizada;
	//constructor
	public Baralho() throws Exception {
		//Dimensionando a matriz
		baralhoCartas = new CartaBaralho[4][13];
		cartaUtilizada = new boolean[4][13];
		rnd = new Random(); //criando o meu gerador de random
		//Criando as cartas
		for(int np=0;np<4;np++) { //0-3
			//percorrendo os números
			for(int nm=0;nm<13;nm++) { //0-12
				baralhoCartas[np][nm] = 
						new CartaBaralho(np+1, nm+1);
				cartaUtilizada[np][nm] = false;
			}
		}
	}
	
	public CartaBaralho getCartaBaralho() {
		int naipe, numero;
		CartaBaralho ret = null;
		//logica para sorteio
		do {
			naipe = rnd.nextInt(4);
			numero = rnd.nextInt(13);
			if (!cartaUtilizada[naipe][numero]) {
				//Setando o retorno
				ret = baralhoCartas[naipe][numero];
				
				//Marcando a carta (foi utilizada)
				cartaUtilizada[naipe][numero] = true;
			}
		} while(ret==null);
		return ret;
	}
	
}
