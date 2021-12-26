/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;
import Hospitals.Hospital;
import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Login.Login;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.*;

// class for doctor detail
public class Doctor extends JFrame {
         // private fields for components 
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public Doctor() {
                //for window Title
                super("Doctor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //setBounds for window
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
                // create panel
		JPanel panel = new JPanel();
                // set backgroung color 
		panel.setBackground(Color.WHITE);
                // set panel bounds
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
                
		// create label for doctor name
		JLabel label_for_Doctor = new JLabel("DR.Aisha Khan");
                //set Alignment text for center
		label_for_Doctor.setHorizontalAlignment(SwingConstants.CENTER);
                 // set font style and size
		label_for_Doctor.setFont(new Font("Times New Roman", Font.BOLD, 35));
                // Set text color
		label_for_Doctor.setForeground(Color.BLUE);
		label_for_Doctor.setBounds(0, 11, 404, 83);
		panel.add(label_for_Doctor);
		
                // create label for doctor2 name
		JLabel label_for_Doctor2 = new JLabel("DR.Omaima");
                //set Alignment text for center
		label_for_Doctor2.setHorizontalAlignment(SwingConstants.CENTER);
                // Set text color
		label_for_Doctor2.setForeground(Color.BLUE);
                 // set font style and size
		label_for_Doctor2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		label_for_Doctor2.setBounds(0, 60, 404, 83);
		panel.add(label_for_Doctor2);
                
                // create label for doctor3 name
                JLabel label_for_Doctor3 = new JLabel("DR.Ramla");
                //set Alignment text for center
		label_for_Doctor3.setHorizontalAlignment(SwingConstants.CENTER);
                // Set text color
		label_for_Doctor3.setForeground(Color.BLUE);
                 // set font style and size
		label_for_Doctor3.setFont(new Font("Times New Roman", Font.BOLD, 35));
		label_for_Doctor3.setBounds(0, 100, 404, 83);
		panel.add(label_for_Doctor3);
                
		try{
                // create button for doctor login    
		JButton btnNewButton = new JButton("Doctor login");
		btnNewButton.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                                // create object of hospital class
                                Hospital I=new Hospital();
				I.setVisible(true);
                              
			}
                        
                        
		});
                
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(100, 175, 250, 40);
		panel.add(btnNewButton);
                }
                catch (Exception e){
                    System.out.println(e);
                }
        }
        /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
                // run method
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
                                    Doctor frame = new Doctor();
                                    
                                    frame.setVisible(true);
                                } 
                                catch (Exception e) {
				e.printStackTrace();
				}
			}
		});
	}

}

