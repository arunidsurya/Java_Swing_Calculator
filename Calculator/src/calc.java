import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class calc  implements ActionListener
{     /*from w  ww  .ja  v  a  2  s  .co  m*/
     JFrame frame;  
     JTextField textfield; 
     JTextField textfield2;
     JPanel inputpanel; 
     JPanel textpanel;  
     JButton JBu;
     JMenuBar menuBar;
     JMenu menu;
     JMenu menu2;
     JMenu menu3;
     String[] strGrid={"7","8","9","/","4","5","6","*","1","2","3","-" ,"0","C","+","=" };
     
     private String first = "";          
     private String result = "";         
     ArrayList<Integer> ee = new ArrayList<Integer>();   
     ArrayList<String> store = new ArrayList<String>();  

     
     public calc(){
          frame=new JFrame("");
          menuBar=new JMenuBar();
          
          menu=new JMenu("(V)");
          menu.setFont(new Font("Sans-serif", 0, 12));
          
          menu2=new JMenu("(E)");
          menu2.setFont(new Font("Sans-serif", 0, 12));
          
          menu3=new JMenu("(H)");
          menu3.setFont(new Font("Sans-serif", 0, 12));
          
          inputpanel=new JPanel();
          textpanel=new JPanel();
          
          textfield=new JTextField("0"); 
          textfield2=new JTextField(""); 
     }
          

     public void gui(){     
          menuBar.add(menu);          
          menuBar.add(menu2);     
          menuBar.add(menu3);
          
          textfield.setHorizontalAlignment(JTextField.RIGHT); 
          textfield.setEditable(false);          
          
          textfield2.setHorizontalAlignment(JTextField.RIGHT);
          textfield2.setEditable(false); 
          
          textpanel.setLayout(new BorderLayout());             
          textpanel.add(BorderLayout.NORTH,textfield2);  
          textpanel.add(BorderLayout.CENTER,textfield);
          
          inputpanel.setLayout(new GridLayout(4, 4));          

          for(int i=0; i<strGrid.length; i++){
               JBu=new JButton(strGrid[i]);                    
               JBu.addActionListener(this);                    
               inputpanel.add(JBu);                              
          }
          
     
          frame.add(BorderLayout.NORTH,textpanel); 
          frame.add(BorderLayout.CENTER,inputpanel);      
          frame.setJMenuBar(menuBar); 
          frame.setSize(220,310);                                
          frame.setVisible(true);                                
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     }
     
     
     public void actionPerformed(ActionEvent e){
          String str=e.getActionCommand();
          String read;                    
          
          try{     
               if(str!="/" && str!= "*"&& str!= "-"&& str!= "+"&& str!= "C"&& str!= "="){
                    textfield.setText(first);      
                    textfield.getText();           
                    textfield2.setText("");        
                    textfield2.getText();          
                    
                    read=textfield.getText();         
                    first = read+str;
                    textfield.setText(first);         
                    textfield.getText();              
               }
               
               if(str=="/" || str== "*"|| str== "-"|| str== "+"|| str== "="){
                    textfield2.setText(str);          
                    textfield2.getText();             
                    
                    ee.add(Integer.parseInt(first));  
                    first="";                         
                    
                    store.add(str);                   
               }
               
               if(str=="="){
                    int sum=0;
                    sum=ee.get(0);         
                    
                    for(int a=0,h=1; a<ee.size(); a++,h++){ 
                         int ve=store.size();                  
                         if(ve>0){                                 
                              ve--;               
                           
                              if(store.get(a)=="+"){            
                                   sum=sum+ee.get(h);             
                              }else if(store.get(a)=="-"){  
                                   sum=sum-ee.get(h);     
                              }else if(store.get(a)=="*"){
                                   sum=sum*ee.get(h);
                              }else if(store.get(a)=="/"){
                                   try{                    
                                        sum=sum/ee.get(h);
                                   }catch(Exception exc){        
                                        sum=0;
                                   }
                              }               
                         }
                    }
                    result=sum+"";                         
                    textfield.setText(result);        
                    textfield.getText();                    
               }
               
               if(str=="C"){ 
                    first="";
                    textfield.setText("0");              
                    textfield.getText();                 
                    textfield2.setText("");     
                    textfield2.getText(); 
                    ee.clear();                         
                    store.clear();                     
               }
          }catch(Exception ex){
               textfield.setText("Error");  
               textfield.getText(); 
          }
     
     }
     

     public static void main(String[] args) 
     {
          calc cal=new calc();
          cal.gui();
     }
}