package sixth_assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringUtility extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("String Utility");   
		frame.setSize(350, 300);   
		frame.setLocation(500, 400);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 	frame.setLayout(null);     
		JButton btnCount = new JButton("Count Letters"); 
	 	btnCount.setBounds(10, 80, 150, 25);   
		frame.add(btnCount);  
	   	JButton btnReverse = new JButton("Reverse Letters"); 
	 	btnReverse.setBounds(10, 120, 150, 25);  
	 	frame.add(btnReverse);      
		JButton btnRemove = new JButton("Remove Duplicates"); 
	  	btnRemove.setBounds(10, 160, 150, 25);   
		frame.add(btnRemove);    
	  	JLabel lblInput = new JLabel("Input");  
	 	lblInput.setBounds(180, 80, 80, 25);  
	 	frame.add(lblInput);    
	  	JTextField txtInput = new JTextField(20); 
	  	txtInput.setBounds(180, 100, 80, 25);  
	 	frame.add(txtInput);       
	  	JLabel lblOutput = new JLabel("Output");   
		lblOutput.setBounds(180, 120, 80, 25);   
		frame.add(lblOutput);   
	   	JTextField txtOutput = new JTextField(20);  
	 	txtOutput.setBounds(180, 140, 80, 25); 
	  	frame.add(txtOutput); 
	  	
	  	btnCount.addActionListener(new ActionListener() {  
	 			public void actionPerformed(ActionEvent e) { 
	 				String str=txtInput.getText();
	 				if(str.length()==0 ||str==null) {
	 					txtOutput.setText(String.format("%d", 0));
	 				}else {
	 					int count=str.length();
	 					txtOutput.setText(String.format("%d",count));
	 				}
	 				
	 			}
	  	});
	  	btnReverse.addActionListener(new ActionListener() {  
 			public void actionPerformed(ActionEvent e) { 
 				String str=txtInput.getText();
 				String rev="";
 				if(str.length()>0) {
 					for(int i=str.length()-1;i>=0;i--) {

 						rev+=str.charAt(i);
 					}
 					
 				}

					txtOutput.setText(rev);
 				
 			}
	  	});
	  	btnRemove.addActionListener(new ActionListener() {  
 			public void actionPerformed(ActionEvent e) {
 				String str=txtInput.getText();
 				String removeDups="";
 				for(int i=0;i<str.length();i++) {
 					if(removeDups.indexOf(str.charAt(i))==-1) {
 						removeDups+=str.charAt(i);
 					}
 				}
 				txtOutput.setText(removeDups);
 				
 			}
	  	});
	  	frame.setVisible(true);   
	  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
