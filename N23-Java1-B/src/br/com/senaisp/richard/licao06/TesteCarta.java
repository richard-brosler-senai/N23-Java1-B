package br.com.senaisp.richard.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		try {
			CartaBaralho carta = new CartaBaralho(1, 9);
			System.out.println(carta.getCartaAscii());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
