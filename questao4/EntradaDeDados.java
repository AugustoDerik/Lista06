package questao4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntradaDeDados extends JPanel {
	
	public JLabel label = new JLabel();
	public ArrayList<String> lista = new ArrayList();
	
	public EntradaDeDados() {
		setLayout(new FlowLayout());
		label = new JLabel();
		label.setForeground(Color.WHITE);
		label.setText("Digite um número:");
		JTextField texto = new JTextField(null,5);
		add(texto);
		JButton b = new JButton("OK");
		add(b);
		b.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				lista.add(texto.getText());
			}
		});
		
		
	}
}
