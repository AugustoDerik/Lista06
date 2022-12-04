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
	public ArrayList<Integer> lista = new ArrayList();

	public EntradaDeDados() {
		setLayout(new FlowLayout());
		label = new JLabel();
		label.setForeground(Color.BLACK);
		label.setText("Digite um número:");
		JTextField texto = new JTextField(null, 5);
		
		JButton b = new JButton("OK");
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(texto.getText());
				lista.add(num);
			}
		});
		add(label);
		add(texto);
		add(b);
	}

	public int maior(ArrayList<Integer> lista) {
		int maior = 0;
		for (int n : lista) {
			if (n > maior)
				maior = n;
		}
		return maior;
	}

	public int menor(ArrayList<Integer> lista) {
		int menor = 0;
		for (int n : lista) {
			if(n <= menor)
				menor = n;
		}
		return menor;
	}

	public float media(ArrayList<Integer> lista) {
		int total = 0;
		float media = 0;
		for (int i = 0; i < lista.size(); i++) {
			total += lista.get(i);
		}
		return media = (float) total / lista.size();
	}
}
