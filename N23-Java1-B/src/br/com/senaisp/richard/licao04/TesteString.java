package br.com.senaisp.richard.licao04;

import java.util.Scanner;

public class TesteString {

	public static void main(String[] args) {
		Scanner scn;
		String nome1 = "Maria";
		char letra = 'R';
		String nome2 = new String("Maria");
		String nome3 = nome2; //atribuindo o endereço de memória da nome2 p/ nome3
		nome2 = "Roberval";
		System.out.println(nome3);
		nome3 = nome2;
		System.out.println(nome3);
		//comparando endereço de memória
		if ( nome1 == nome2 ) {
			System.out.println("Endereços de memória Iguais!");
		} else {
			System.out.println("Endereços de memória Diferentes");
		}
		//Para comparar conteúdo, tenho que usar equals
		if ( nome1.equals(nome2)) {
			System.out.println("Nomes Iguais!");
		} else {
			System.out.println("Nomes Diferentes");
		}
		// > 0  ==> nome1 é maior que nome2
		// == 0 ==> nome1 é igual a nome2
		// < 0  ==> nome1 é menor que nome2
		nome1 = "Rute";
		if (nome1.compareTo(nome2)>0) {
			System.out.println("Nome 1 é maior que nome 2");
		} else {
			System.out.println("Nome 1 é menor ou igual que nome 2");
		}
		System.out.println(nome1.compareTo(nome2));
		letra=65;
		String nomex = ""+(char)65+(char)65;
		System.out.println(nomex);
		//Caracter na posição 0 - início da string
		System.out.println(nome1.charAt(0));
		//Tamanho da string
		System.out.println(nome2.length());
		//parte da string
		System.out.println(nome2.substring(3));
		//parte inicio e fim
		System.out.println(nome2.substring(3,5));
		//indexof
		System.out.println(nome2.indexOf('o'));
		System.out.println(nome2.indexOf('O')); //Não encontra = -1
		//double - convertendo double para float explicitamente
		double variavel = 100_000_000_000.00;
		//inteiro - convertendo int para float implicitamente
		float variavel2 = 10; 

	}

}
