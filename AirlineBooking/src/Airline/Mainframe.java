package Airline;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Mainframe extends JFrame{

	
	
	
	Mainframe()
	{
		super("AIRLINE RESERVATION SYSTEM");
		
		setForeground(Color.BLACK);
		setLayout(null);
		
		//add image on frame
		
		JLabel l1 = new JLabel("");
		
		l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Airline/icon/airplane.jpg")));
		
	    l1.setBounds(100, 100, 1000,700);
		
		add(l1);
		
		
		JLabel title = new JLabel("WELCOME TO AIR INDIA");
		title.setForeground(Color.BLACK);
		title.setFont(new Font("Tahoma", Font.PLAIN,36));
		title.setBounds(700, 60, 1000, 55);
	    l1.add(title);
	    
	    
	    JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    
	    JMenu AirlineSystem = new JMenu("Airline System");
	    AirlineSystem.setForeground(Color.BLUE);
	    menuBar.add(AirlineSystem);
	    
	    JMenuItem FlightDetails = new JMenuItem("Flight Details");
	    AirlineSystem.add(FlightDetails);
	    
	    JMenuItem ReservationDetails = new JMenuItem("Reservation Details");
	    AirlineSystem.add(ReservationDetails);
	    
	    JMenuItem PassengerDetails =  new JMenuItem("Passenger Details");
	    AirlineSystem.add(PassengerDetails);
	    
	    JMenuItem SectorDetails_1 = new JMenuItem("Payment Details");
	    AirlineSystem.add(SectorDetails_1);
	    
	    JMenuItem Cancellation = new JMenuItem("CANCELLATION");
	    AirlineSystem.add(Cancellation);
	    
	    
	    JMenu Ticket = new JMenu("TICKET");
	    Ticket.setForeground(Color.BLUE);
	    menuBar.add(Ticket);
	    
	    JMenu List = new JMenu("LIST");
        List.setForeground(Color.BLUE);
	    menuBar.add(List);
		
	    JMenu Misc = new JMenu("MISC");
        Misc.setForeground(Color.RED);
	    menuBar.add(Misc);
	    
	    FlightDetails.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{
	    		new Flight_Info();
	    		
	    	}
	    });
	    
	    
	    ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		          } catch (Exception e) {
                    e.printStackTrace();
		             } 
              }
	    });
	  
	    PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
	    
	    SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});  
	    
	    
	    Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	}); 
	    
	    setSize(1950,1090);
		setVisible(true);
	
	}
	
	
	public static void main(String[] args)
	{
		new Mainframe();
	}
}
