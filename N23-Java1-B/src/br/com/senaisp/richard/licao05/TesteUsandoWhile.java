package br.com.senaisp.richard.licao05;

import java.util.Scanner;

public class TesteUsandoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definindo variáveis
		int idade = 0;
		//Iniciando programa
		while (idade < 1) {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			if (idade<1) {
				System.out.println("Idade inválida! Redigite!");
			}
		}
		System.out.println("Fim do programa");
		sc.close();
	}

}
