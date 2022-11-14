package questao1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Painel1 extends JPanel {

	public Painel1() {
		this.setBackground(Color.WHITE);

		setLayout(new FlowLayout());
		Botao1 b1 = new Botao1("yellow", Color.yellow);
		Botao1 b2 = new Botao1("blue", Color.cyan);
		Botao1 b3 = new Botao1("green", Color.green);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
				System.out.println("fui clicado");
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);
				System.out.println("tá na hora do jair embora");
			}
		});
		
		Random r = new Random();

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
				System.out.println("lula la");
			}
		});

		add(b1);
		add(b2);
		add(b3);
	}

}
