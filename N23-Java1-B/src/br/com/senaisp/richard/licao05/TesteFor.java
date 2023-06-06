package br.com.senaisp.richard.licao05;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor para fatorial:");
		int vlr = sc.nextInt();
		System.out.println("O fatorial é " + fatorial(vlr));
		sc.close();
	}
	public static int fatorial(int value) {
		int retorno = 1;
		//Ciclo de repetição iniciando pelo valor passado
		//vai decrescendo enquanto i>1
		//  inicializador;condição;setando valores
		
		for(int i = value; i>1 ; i--) {
			retorno *= i; //retorno = retorno * i
		}
		
		//for(int i = value; i>1 ; retorno *= i--);
		//retornando o valor
		return retorno;
	}

}
