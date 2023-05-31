package br.com.senaisp.richard.licao04;

public class Estudante {
	//Campos de instância ou Variáveis de instância
	private int id;
	private String nome;
	private String cpf;
	private double media;
	
	@Override
	public String toString() {
		return  "Id : " + id + 
				"\nnome : " + nome + 
				"\ncpf : " + cpf +
				"\nmedia : " + media;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		//Exemplo de tratamento na entrada de dados
		if (cpf.equals("123.456.789-00"))
			System.out.println("CPF Inválido");
		this.cpf = cpf;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
}
