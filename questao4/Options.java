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

	public Options(EntradaDeDados dados) {
		this.dados = dados;
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();
		setLayout(new GridLayout(3, 3));
		l1.setText("Maior >>>");
		l5.setText("Menor >>>");
		l6.setText("Media >>>");

		JButton b = new JButton("Exibir");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l2.setText("maior: " + dados.maior(dados.lista));
				l3.setText("menor: " + dados.menor(dados.lista));
				l4.setText("media: " + dados.media(dados.lista));
			}
		});
		add(l1);
		add(l5);
		add(l6);
		add(l2);
		add(l3);
		add(l4);
		add(b);
	}

}
