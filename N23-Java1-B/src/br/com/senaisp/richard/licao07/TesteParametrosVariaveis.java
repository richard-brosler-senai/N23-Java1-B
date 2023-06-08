package br.com.senaisp.richard.licao07;

public class TesteParametrosVariaveis {

	public static void main(String[] args) {
		metodoParamVaria("Rosas","Bromelhas","Cravos","Lírios");
		String[] fl = {"Bananas", "Laranja", "Pera" };
		metodoParamVaria(fl);
		System.out.println("======================");
		metodoVetor(fl);
		//metodoVetor("aaa","bbb");
	}
	
	private static void metodoVetor(String[] fl) {
		for(String it: fl) {
			System.out.println(it);
		}
	}

	public static void metodoParamVaria(String ...flores) {
		//for each
		for(String it: flores) {
			System.out.println(it);
		}
	}
}
