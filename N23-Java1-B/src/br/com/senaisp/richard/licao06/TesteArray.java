package br.com.senaisp.richard.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Definindo um vetor (array de uma dimensão)
		double[] medias;
		// criando o vetor
		medias = new double[4];
		// Solicitando as médias
		for (int i = 0; i < medias.length; i++) {
			//inicio do bloco do do
			do {
				System.out.println("Digite a média " + (i + 1) + ":");
				try {
					medias[i] = sc.nextDouble();
					int x = sc.nextInt();
					int xvalor = 1 / x;
					//simulando uma divisão por zero$$
					System.out.println(xvalor);
					//Fazendo o tratamento para entrada com letras
				} catch (InputMismatchException e) {
					sc.nextLine();
					medias[i] = -1;
					System.out.println("Valor deve ser numérico! Redigite.");
					//fazendo o tratamento geral (se passar do específico, vem para o geral)
				} catch (Exception e) {
					sc.nextLine();
					medias[i] = -1;
					e.printStackTrace();
					System.out.println("Valor inválido! Redigite.");
				}
			} while (medias[i] < 0 | medias[i] > 10);
			//fim do bloco do do
		}
		System.out.println("Listando as médias:\n");
		for (int i = 0; i < medias.length; i++) {
			System.out.println("Média " + (i + 1) + ": " + medias[i]);
		}
		sc.close();
	}

}
