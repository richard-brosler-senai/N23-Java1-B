package br.com.senaisp.richard.licao04;

public class TesteVariaveis {
	public static int _idade; //variável global
	public static void main(String[] args) {
		_idade=50;
		int idade = 15; //a partir daqui idade é local
		int idade2=20;
		if (idade == 15) {
			int _idade = 30;
			idade2 = 20;
			System.out.println("Idade 2 " + idade2);
			System.out.println(_idade);
		}
		System.out.println(_idade);
		System.out.println("Idade 1 " + idade);
		System.out.println("Idade 2 " + idade2);
	}
	public void outroMetodo()
	{
		System.out.println(_idade);
	}

}
