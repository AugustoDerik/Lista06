package questao5;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class OptionsFrame extends JFrame {
	
	public OptionsFrame() {
		setTitle("Questao 5");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		pack();
		Box box = new Box();
		box.setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
