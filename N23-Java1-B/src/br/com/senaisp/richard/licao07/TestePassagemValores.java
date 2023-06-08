package br.com.senaisp.richard.licao07;

import br.com.senaisp.richard.projeto.Produto;

public class TestePassagemValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prd = new Produto(1,"Lápis",100,2.30);
		System.out.println(prd.toString());
		System.out.println("----------------------");
		alteraProduto(prd,10);//$a01
		System.out.println(prd.toString());
	}
	
	public static void alteraProduto(Produto pr, int vlr) {
		System.out.println(vlr);
		vlr = 15;
		//pr = $a01.setNumItem(0);
		pr.setNumItem(0);
		System.out.println(vlr);//15
		pr = new Produto(2,"Caneta",100,6.3); //$a02
		//$a02.setPrecoItem(5.6)
		pr.setPrecoItem(5.6);
		
	}

}
