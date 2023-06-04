import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.multi.MultiButtonUI;

public class Calculator implements ActionListener{
	
	JFrame jf; //global declaration
	JLabel displayLabel;
	
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,dotButton,zeroButton;
	
	JButton plusButton,minusButton,multiButton,divButton,equalButton,clearButton;
	
	
	public Calculator() {
		jf = new JFrame("Calculator"); //frame with name on top
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(400,150); //set default location
		
		displayLabel= new JLabel(); //label for display
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		displayLabel.setForeground(Color.white);
		
		
		
		sevenButton= new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton .addActionListener(this);
		sevenButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(sevenButton);
		
		eightButton= new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton .addActionListener(this);
		eightButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(eightButton);
		
		nineButton= new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton .addActionListener(this);
		nineButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(nineButton);
		
		
		
		fourButton= new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton .addActionListener(this);
		fourButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(fourButton);
		
		fiveButton= new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton .addActionListener(this);
		fiveButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(fiveButton);
		
		sixButton= new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton .addActionListener(this);
		sixButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(sixButton);
		
		
		
		oneButton= new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(oneButton);
		
		twoButton= new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(twoButton);
		
		threeButton= new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(threeButton);
		
		
		
		dotButton= new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(dotButton);
		
		zeroButton= new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(zeroButton);
		
		equalButton= new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(equalButton);
		
		
		divButton= new JButton("÷");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(divButton);
		
		multiButton= new JButton("×");
		multiButton.setBounds(330, 230, 80, 80);
		multiButton .addActionListener(this);
		multiButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(multiButton);
		
		minusButton= new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(minusButton);
		
		plusButton= new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(plusButton);
		
		clearButton= new JButton("Clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			displayLabel.setText(displayLabel.getText() +"7");
		}else if(e.getSource()==eightButton) {
			displayLabel.setText(displayLabel.getText() + "8");
		}else if(e.getSource()==nineButton) {
			displayLabel.setText(displayLabel.getText() +"9");
		}else if(e.getSource()==fourButton) {
			displayLabel.setText(displayLabel.getText() +"4");
		}else if(e.getSource()==fiveButton) {
			displayLabel.setText(displayLabel.getText() +"5");
		}else if(e.getSource()==sixButton) {
			displayLabel.setText(displayLabel.getText() +"6");
		}else if(e.getSource()==oneButton) {
			displayLabel.setText(displayLabel.getText() +"1");
		}else if(e.getSource()==twoButton) {
			displayLabel.setText(displayLabel.getText() +"2");
		}else if(e.getSource()==threeButton) {
			displayLabel.setText(displayLabel.getText() +"3");
		}else if(e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText() +"0");
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText() +".");
		}else if(e.getSource()==divButton) {
			
		}else if(e.getSource()==multiButton) {
			
		}else if(e.getSource()==minusButton) {
			
		}else if(e.getSource()==plusButton) {
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		
		
	}
}
