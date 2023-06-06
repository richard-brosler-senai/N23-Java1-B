package br.com.senaisp.richard.licao04;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		//criando objeto para capturar valores no teclado
		Scanner sc = new Scanner(System.in);//.useLocale(Locale.US);
		//Definindo variáveis
		double op01, op02, resultado;
		String operador;
		//Começando o programa
		System.out.println("Digite o primeiro operando: ");
		op01 = sc.nextDouble(); //solicitando valor fracionário

		System.out.println("Digite o segundo operando: ");
		op02 = sc.nextDouble(); //solicitando valor fracionário
		//retira o enter do buffer do teclado quando o scanner
		//anterior é número, caso contrário, perderemos o scanner
		sc.nextLine(); 
		
		System.out.println("Digite o operador: ");
		operador = sc.nextLine(); //solicitando o operador (texto)
		//Lógica do programa
		resultado = 0;
		/*
		if ( operador.charAt(0) == '+' ) {
			resultado = op01 + op02;
		} else if ( operador.charAt(0) == '-') {
			resultado = op01 - op02;
		} else if ( operador.charAt(0) == '*') {
			resultado = op01 * op02;
		} else if ( operador.charAt(0) == '/') {
			resultado = op01 / op02;
		} else {
			System.out.println("Operador inválido!!");
		}
		*/
		//Testando usando o switch
		/*
		switch(operador.charAt(0)) {
		case '+': 
			resultado = op01 + op02; 
			break;
		case '-': resultado = op01 - op02; break;
		case '*': resultado = op01 * op02; break;
		case '/': resultado = op01 / op02; break;
		default : System.out.println("Operador inválido!");
		}
		*/
		//Outra versão do switch
		switch(operador.charAt(0)) {
		case '+' -> { //vários comandos necessita da chave
			resultado = op01 + op02; 
			System.out.println("Estou fazendo a soma");
		} 
		case '-' -> { resultado = op01 - op02; }
		case '*' -> resultado = op01 * op02; //somente um comando
		case '/' -> resultado = op01 / op02; 
		default -> System.out.println("Operador inválido!");
		}
		
		//Mostrando resultado
		System.out.println("O resultado é "+ resultado);
		sc.close();
	}

}
