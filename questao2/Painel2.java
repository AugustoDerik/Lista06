package questao2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Painel2 extends JPanel {

	public Display display;

	public Painel2(Display display) {
		this.display = display;

		setBackground(Color.white);
		setLayout(new GridLayout(3, 2));

		criarBotoes("Marc Spector");
		criarBotoes("Higashikata Josuke");
		criarBotoes("Kira Yoshikage");
		criarBotoes("Albus Dumbledore");
		criarBotoes("Santos Dumont");
		criarBotoes("Red Hot Chili Peppers");
	}

	public void criarBotoes(String texto) {
		Botao2 b = new Botao2(texto);
		add(b);
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				display.label.setText(b.getText());
			}
		});
	}

}
