package javaswingexamples;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandlingDemo extends JFrame {
	 JButton button;
	public static void main(String[] args) {
		EventHandlingDemo ob = new EventHandlingDemo();

	}
	public EventHandlingDemo() {
		      button=new JButton("Click");
	                add(button);
	                button.addActionListener( e -> button.setText("Button Clicked"));
	                		
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200);
	        setTitle("Event Handling");
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	

}
