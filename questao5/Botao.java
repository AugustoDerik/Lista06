package questao5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botao extends JButton implements ActionListener {
	
	public Box box  = new Box();
	public Operacoes op = new Operacoes();
	
	public Botao(String tittle) {
		setText(tittle);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		box.t.setText(op.fatorial(Integer.parseInt(box.t.getText()))+"");
		
	}

}
