package labs.lab9;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
//
//import javax.swing.*;



public class EmailSystem {
	
	static JFrame f;
	
	
	
	 
		public static String OptionPaneExample(){  
		    f=new JFrame();   
		    boolean bol = false;
		    String name = "";
		    while (bol == false) {
		    name=JOptionPane.showInputDialog(f,"Username: ");
		    if (!name.isBlank()) {
		    	bol = true;
		    }
		    
		    }
		    
		    return name;
		}  
	
	public static void main(String[] args) {
		
//		System.out.println(OptionPaneExample());
		String username = OptionPaneExample();
		EmailPage emailPage = new EmailPage(username);
		emailPage.setVisible(true);
//		list.add("Robert Navarro");
//		LoginPage initialLogin = new LoginPage();
//		initialLogin.setVisible(true);

		
		
	
	
	
	}
	
	
	
	
	
	
	
	
}