import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	
	public Calculator() {
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(400,150);
		
		JLabel displayLabel = new JLabel("Hello"); 
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		displayLabel.setForeground(Color.white);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new Calculator();
	}
}