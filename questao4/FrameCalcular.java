package questao4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import questao2.Display;
import questao2.Painel2;

public class FrameCalcular extends JFrame {

	public FrameCalcular() {
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		orgalizarLayout();
		setVisible(true);
	}

	private void orgalizarLayout() {
		setLayout(new BorderLayout());

		EntradaDeDados display = new EntradaDeDados();
		display.setPreferredSize(new Dimension(400, 100));
		add(display, BorderLayout.NORTH);

		Options painel = new Options(display);
		add(painel, BorderLayout.CENTER);
	}

}
