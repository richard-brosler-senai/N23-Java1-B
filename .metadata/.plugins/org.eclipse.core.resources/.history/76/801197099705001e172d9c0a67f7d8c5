package br.com.senaisp.richard.licao07;

public class ConectorDados {
	//Design pattern Singleton
	private static ConectorDados instancia;
	//Campo de instância / field
	private String conexaoString;
	//
	private ConectorDados() {
		instancia = null;
	}
	
	public static ConectorDados getInstance() {
		if (instancia == null) {
			instancia = new ConectorDados();
		}
		return instancia;
	}

	public String getConexaoString() {
		return conexaoString;
	}

	public void setConexaoString(String conexaoString) {
		this.conexaoString = conexaoString;
	}
}
