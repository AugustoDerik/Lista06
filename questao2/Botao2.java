package questao2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao2 extends JButton {

	public Botao2(String texto) {
		setText(texto);
		setFont(new Font("arial", Font.BOLD, 20));
		setOpaque(true);
		setBackground(Color.cyan);
		setForeground(Color.black);
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
	}
}
