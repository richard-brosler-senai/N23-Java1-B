package br.com.senaisp.richard.licao04;

public class TesteIncremento {

	public static void main(String[] args) {
		//incremento ou decremento
		int valor = 10;
		int valor2 = valor++; //pós incremento
		int valor3 = ++valor;
		System.out.println(valor); //12 
		System.out.println(valor2); //10
		System.out.println(valor3); //12
		//usando o decremento
		valor2 = valor--;
		valor3 = --valor;
		
		System.out.println(valor); //10
		System.out.println(valor2); //12
		System.out.println(valor3); //10
	}

}