package questao3;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MostrarMensagem extends JFrame {
		
	public MostrarMensagem() {
		setSize(300, 200);
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Painel3 painel = new Painel3();
		add(painel);
		setVisible(true);
	}
	
	
	

}
