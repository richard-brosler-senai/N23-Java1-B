package br.com.senaisp.richard.licao05;

import java.util.Scanner;

public class TesteOperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Definindo variáveis
		int idade;
		String texto;
		//Inicio do programa
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		//Montando o texto
		texto = ( idade >= 18 && idade <= 90 ? "Pode dirigir" : 
				"Não pode dirigir" ) + " um ônibus"; 
		System.out.println(texto);
		
		int horasTrabalhadas;
		System.out.print("Digite suas horas trabalhadas hoje: ");
		horasTrabalhadas = sc.nextInt();
		
		int totHoras = ( horasTrabalhadas > 8 ? 
					horasTrabalhadas * 2 : 
						horasTrabalhadas ) * 50;
		
		System.out.println("Total a pagar de horas = " + 
						totHoras);
		sc.close();
	}

}
