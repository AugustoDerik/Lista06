package questao3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel3 extends JPanel {

	public Painel3() {
		setLayout(new FlowLayout());
		JTextField texto = new JTextField(null,5);
		add(texto);
		Botao3 b = new Botao3("ENVIAR");
		add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, texto.getText());

			}
		});

	}

}
