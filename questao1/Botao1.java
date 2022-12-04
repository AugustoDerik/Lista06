package questao1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botao1 extends JButton {

	public Botao1(String nome, Color cor) {
		this.setText(nome);
		this.setBackground(cor);
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("fui clicado no construtor");
				
			}
		});
	}
}
