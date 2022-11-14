package questao2;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MudarTexto extends JFrame {
	
	public MudarTexto() {
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		orgalizarLayout();
		setVisible(true);
	}
	
	public void orgalizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(200,100));
		add(display, BorderLayout.NORTH);
		
		Painel2 painel = new Painel2(display);
		add(painel, BorderLayout.CENTER);
	}
}
