package questao4;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Options extends JPanel {
	
	public EntradaDeDados dados;
	public JLabel label;
	
	public Options(EntradaDeDados dados) {
		this.dados=dados;
		label = new JLabel();
		setLayout(new GridLayout(3, 3));
		label.setText("Maior >>>\nMenor >>>\nMedia >>>");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		add(t1);
		add(t2);
		add(t3);
		add(label);
		JButton b = new JButton("Exibir");
		add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
	
}
