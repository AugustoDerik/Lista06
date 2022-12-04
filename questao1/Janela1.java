package questao1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela1 extends JFrame {

	public Janela1() {

		Painel1 p = new Painel1();
		add(p);

		setSize(300, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
