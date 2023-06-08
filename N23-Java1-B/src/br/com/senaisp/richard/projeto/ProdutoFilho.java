package br.com.senaisp.richard.projeto;

public class ProdutoFilho extends Produto {
	public ProdutoFilho() {
		
	}
	public String getProdutoNomeAlterado() {
		return getNomeItem() + " Alterado";
	}
	
	public static int calcularSoma(int a, int b) {
		return a + b;
	}
}
