package br.com.senaisp.richard.licao04;

public class TesteEstudante {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.setId(15);
		estudante.setNome("Richard Brosler");
		estudante.setCpf("123.456.789-00");
		estudante.setMedia(8.5);
		
		System.out.println(estudante.toString());
	}
}
