package br.com.senaisp.richard.licao05;

import java.util.Scanner;

public class TesteDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definindo variáveis
		int idade;
		//Iniciando programa
		do{
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			//Se o usuário digitou -18 eu forço
			//a saída do while
			if (idade == -18) {
				break;
			}
			//Forço o salto para o teste
			if (idade == -20) {
				continue;
			}
			if (idade<1) {
				System.out.println("Idade inválida! Redigite!");
			}
		}while (idade < 1);
		
		System.out.println("Fim do programa");
		sc.close();
	}

}
