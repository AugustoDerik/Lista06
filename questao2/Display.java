package questao2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel {
	
	public JLabel label;
	
	public Display() {
		this.setBackground(new Color(128, 128, 128));
		label = new JLabel();
		label.setForeground(Color.WHITE);
		label.setText("ATENÇÃO! Este texto irá mudar!");
		label.setFont(new Font("courier", Font.ITALIC, 20 ));
		setLayout(new FlowLayout(FlowLayout.CENTER, 4, 4));
		add(label);
		
	}

}
