package br.com.senaisp.richard.projeto;
/**
 * Classe Produto para projeto Eclipse
 * @author Richard Brosler
 * @version 2023-05-31
 * 
 */
public class Produto {
	//Campos de instância / Fields
	private int numItem;
	private String nomeItem;
	private int qtdeItem;
	private double precoItem;
	//constructors
	  //padrão sem parâmetros
	public Produto() {
		numItem = 0;
		nomeItem = "Sem nome";
		qtdeItem = 0;
		precoItem = 0;//conversão implícita de inteiro para double
	}
	//construtor com parametros
	public Produto(int nIt, String nomIt, int qtdIt, double prcIt)
	{
		setNumItem(nIt);
		setNomeItem(nomIt);
		setQtdeItem(qtdIt);
		setPrecoItem(prcIt);
	}
	//Getters e Setters
	public int getNumItem() {
		return numItem;
	}
	public void setNumItem(int numItem) {
		if (numItem<1) {
			System.out.println("Código inválido!");
		}
		this.numItem = numItem;
	}
	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public int getQtdeItem() {
		return qtdeItem;
	}
	public void setQtdeItem(int qtdeItem) {
		this.qtdeItem = qtdeItem;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	@Override
	//modificador de acesso
	// |     Tipo de retorno
	// |      |    Nome do método
	// |      |     |
	public String toString() {
		return "Número do item: " + getNumItem() + 
			   "\nNome do item: " + getNomeItem() + 
			   "\nQtde do item: " + getQtdeItem() + 
			   "\nPreço do item: R$ " + getPrecoItem();
	}
}
