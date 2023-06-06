package br.com.senaisp.richard.licao05;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definindo variáveis
		String nome;
		//Começando o programa
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Olá," + nome + " !");
		
		System.out.println("Digite seu endereço: ");
		String endereco = sc.nextLine();
		
		sc.close();
		//Vou reaproveitar a variável do scanner
		//Fazendo com que o scanner leia o conteúdo da
		//variável e não o teclado (System.in)
		
		sc = new Scanner(endereco);
		//Indicando para o scanner que ele use o 
		//delimitador de , ao invés de branco
		sc.useDelimiter(",");
		
		System.out.println("Primeira parte do endereço: " + 
							sc.next());
		//Aqui estou tratando se há uma outra parte 
		if (sc.hasNext())
			System.out.println("Segunda parte do endereço: " +
								sc.next());
		
		sc.close();
		
		
	}

}
