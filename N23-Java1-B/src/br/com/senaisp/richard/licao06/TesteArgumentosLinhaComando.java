package br.com.senaisp.richard.licao06;

public class TesteArgumentosLinhaComando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Esse programa vai listar os "
				+ "argumentos passados para o programa");
		//For each
		for(String item : args) {
			System.out.println(item);
		}
	}

}
