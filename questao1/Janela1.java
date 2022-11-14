package questao1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela1 extends JFrame {

	public Janela1() {

		Painel1 p = new Painel1();

		setSize(300, 600);
		add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
