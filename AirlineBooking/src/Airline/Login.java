package Airline;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3;
	GridBagLayout gb1;
	GridBagConstraints gbc;
	Font f1,f2;
	
	Login()
	{  
		super("Login");
		
		setBackground(Color.CYAN);
		f1 = new Font("TimeRoman",Font.BOLD,20);
		f2 = new Font("TimeRoman", Font.BOLD,15 );
		
		gb1  = new GridBagLayout();
		gbc = new GridBagConstraints();
		setLayout(gb1);
		
		l1 = new Label("Username");
		l1.setFont(f1);
		
		 l2 = new Label("Password");
	     l2.setFont(f1);
		
	     t1 = new TextField(15);
	     t2 = new TextField(15);
	     t2.setEchoChar('*'); // replace the input by *
	     
	     
	     b1=new Button("Submit");
	     b1.setFont(f2);
	     
	     b2=new Button("Reset");
	     b2.setFont(f2);
	     
	     b3=new Button("close");
	     b3.setFont(f2);
	     
	     gbc.gridx = 0;
	     gbc.gridy = 0;
	     gb1.setConstraints(l1, gbc);
	     add(l1);
	     
	     gbc.gridx = 2;
	     gbc.gridy = 0;
	     gb1.setConstraints(t1, gbc);
	     add(t1);
	     
	     gbc.gridx = 0;
	     gbc.gridy = 2;
	     gb1.setConstraints(l2, gbc);
	     add(l2);
	     
	     gbc.gridx = 2;
	     gbc.gridy = 2;
	     gb1.setConstraints(t2, gbc);
	     add(t2);
	     
	     
	     gbc.gridx = 0;
	     gbc.gridy = 12;
	     gb1.setConstraints(b1, gbc);
	     add(b1);
	     
	     gbc.gridx = 2;
	     gbc.gridy = 12;
	     gb1.setConstraints(b2, gbc);
	     add(b2);
	     
	     gbc.gridx = 4;
	     gbc.gridy = 12;
	     gb1.setConstraints(b3, gbc);
	     add(b3);
	     
	     
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    
	    
	    setVisible(true);   
        setSize(400,250); 
        setLocation(400,200);  
        
	}
	 public void actionPerformed(ActionEvent ae)
	{
					
					if(ae.getSource()==b1)
					{
						try {
						String a = t1.getText();
						String b = t2.getText();
								
								conn c = new conn();
								
						String q = "select * from login where username = '"+a+"' and password = '"+b+"'";
						
						ResultSet rs = c.s.executeQuery(q);
						
						if(rs.next())
						{
							new Mainframe();
							
							setVisible(false);
						}
						else {
						
						JOptionPane.showMessageDialog(null, "invalid Username or password");
						setVisible(false);
						
						}
					}catch(Exception e) {	}
				}
			 
					else if(ae.getSource()==b2)
					{
						t1.setText("");
						t2.setText("");
					}
					else if(ae.getSource()==b3)
					{
						System.exit(0);
					}
			
			
		
	}
	 
	 public static void main(String[] args)
	 {
		 new Login();
		 
	 }

}
