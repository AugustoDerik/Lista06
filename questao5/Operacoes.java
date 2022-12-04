package questao5;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Operacoes {

	public float numero = 0;

	public float fatorial(int n) {
		numero = n;
		float fat = n;

		while (n > 1) {
			fat *= (n - 1);
			n--;
		}
		return fat;
	}
	
	public JPanel criarPainel() {
		JPanel p = new JPanel();
		p.add(new JTextField(">>>LISTA 6<<<"));
		return p;
	}
	

}
