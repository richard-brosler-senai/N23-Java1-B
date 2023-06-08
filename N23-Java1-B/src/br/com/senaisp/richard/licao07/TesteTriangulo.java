package br.com.senaisp.richard.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteTriangulo {

	public static void main(String[] args) {
		JOptionPane janela = new JOptionPane();
		JDialog dlg = janela.createDialog("Exemplo de Triangulo");
		dlg.setSize(600, 400);
		Triangulo trg = new Triangulo();
		dlg.setContentPane(trg);
		dlg.setVisible(true);
		
	}

}
