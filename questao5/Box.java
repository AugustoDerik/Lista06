package questao5;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Box extends JPanel  {
	
	public JTextField t;
	
	public Box() {
		JPanel pn = new JPanel();
		JComboBox cb = new JComboBox();
		t = new JTextField(null, 20);
		pn.add(t);
		pn.add(cb);
		Botao b = new Botao("Action");
		add(b);
		
	}

//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}
