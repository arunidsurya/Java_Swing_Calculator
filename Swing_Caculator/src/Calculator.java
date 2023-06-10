import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	boolean isResult=false;
	
	JFrame jf; //global declaration
	JLabel displayLabel;
	
	String oldValue;
	String operator;
	
	
	
	
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,dotButton,zeroButton;
	
	JButton plusButton,minusButton,multiButton,divButton,equalButton,clearButton;
	
	private String first = "";          
    private String result = ""; 
	ArrayList<Float> ee = new ArrayList<Float>();
	ArrayList<String> store = new ArrayList<String>();
	
	
	
	public Calculator() {
		jf = new JFrame("Calculator"); //frame with name on top
		jf.setLayout(null);
		jf.setSize(580,600);
		jf.setLocation(400,150); //set default location
		
		displayLabel= new JLabel("0"); //label for display
		displayLabel.setBounds(30, 50, 500, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		displayLabel.setForeground(Color.white);
		Font labelFont = displayLabel.getFont();
		String labelText= displayLabel.getText();
		int stringWidth = displayLabel .getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = displayLabel.getWidth();
		double widthRatio = (double)componentWidth / (double)stringWidth;
		int newFontSize = (int)(labelFont.getSize() * widthRatio);
		int componentHeight = displayLabel.getHeight();
		int fontSizeToUse = Math.min(newFontSize, componentHeight);
		displayLabel.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
		
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
		
		
		divButton= new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial" ,Font.BOLD,30));
		jf.add(divButton);
		
		multiButton= new JButton("*");
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
		
		clearButton= new JButton("C");
		clearButton.setBounds(430, 130, 100, 380);
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
		
		
		String str=e.getActionCommand();
		String read;
		
		try {
			if(str!="/" && str!="*" && str!="-" && str!="+" && str!="=") {
				
					displayLabel.setText(first);
					read=displayLabel.getText();
					first= read+str;
					System.out.println(first);
					displayLabel.setText(first);
				
				
			}
			if(str=="/" || str=="*" || str=="-" || str=="+" || str=="=") {
				
				ee.add(Float.parseFloat(first));
				first="";
				store.add(str);
			}
			if(str=="=") {
				
				
				float sum=ee.get(0);
				
				for (int a=0,h=1;a<ee.size();a++,h++) {
					int ve=store.size();
					
					if(ve>0) {
						ve--;
						
						if(store.get(a)=="+"){
							sum=sum + ee.get(h);
						}else if(store.get(a)=="-") {
							sum=sum - ee.get(h);
						}else if(store.get(a)=="*") {
							sum=sum * ee.get(h);
						}else if(store.get(a)=="/") {
								sum=sum/ee.get(h);
						}
					
					}
				}
				result=String.valueOf(sum);
				displayLabel.setText(result);
				displayLabel.getText();
				
			}
			if(str=="C") {
				first="";
				displayLabel.setText("0");
				ee.clear();
				store.clear();
				
			}
		}catch(Exception ex){
            displayLabel.setText("Error");  
            displayLabel.getText(); 
       }
		
		
	
	}
}
