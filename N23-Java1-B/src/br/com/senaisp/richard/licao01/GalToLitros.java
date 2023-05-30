package br.com.senaisp.richard.licao01;

public class GalToLitros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int galoes = 10;
		float litros = 0;
		float litrosPorGalao = 3.785f;
		//fazendo a conta
		litros = galoes * litrosPorGalao;
		System.out.println(
		  "A quantidade de litros resultante é " + litros );
	}

}
