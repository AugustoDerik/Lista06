package questao3;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao3 extends JButton {
	public Botao3(String texto) {
		setText(texto);
		setFont(new Font("arial", Font.BOLD, 15));
		setOpaque(true);
		setBackground(Color.lightGray);
		setForeground(Color.black);
		setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
	}
}
