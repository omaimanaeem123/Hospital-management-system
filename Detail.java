/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Detail;

import Hospitals.Hospital;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;


public class Detail extends JFrame {
        // private fields for components 
	private JPanel contentPane;
	static Detail Detail_hospital;
	/**
	 * Create the frame.
	 */
	public Detail() {
                 //for window Title
                super("Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //setBounds for window
		setBounds(100, 100, 586, 432);
                // create panel 
		contentPane = new JPanel();
                // set background color
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
                // create panel 
		JPanel panel = new JPanel();
                // set background color
		panel.setBackground(Color.WHITE);
                // set bounds
		panel.setBounds(10, 11, 550, 319);
		contentPane.add(panel);
		panel.setLayout(null);
                
		// create labrl for hospital name
		JLabel lblNewLabel = new JLabel("Care and Cure HOSPITAL");
                // set text color
		lblNewLabel.setForeground(Color.BLUE);
                //set Alignment text to center
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                // set font style and size
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
                // set bounds
		lblNewLabel.setBounds(10, 11, 530, 77);
		panel.add(lblNewLabel);
                
		// create label for OWNER
		JLabel label_Owner = new JLabel("OWNER: ");
                // set text color
		label_Owner.setForeground(Color.RED);
                //set Alignment text to center
		label_Owner.setHorizontalAlignment(SwingConstants.CENTER);
                // set font style and size
		label_Owner.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
                // set bounds
		label_Owner.setBounds(20, 99, 187, 59);
		panel.add(label_Owner);
		
                // create label for DR NAME
		JLabel lblNewLabel_1 = new JLabel("DR.Aisha");
                //set Alignment text to center
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
                // set font style and size
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
                // set bounds
		lblNewLabel_1.setBounds(227, 99, 313, 59);
		panel.add(lblNewLabel_1);
                
		// create label for CO FOUNDER
		JLabel label_CoFounder = new JLabel("CO FOUNDER: ");
                //set Alignment text to center
		label_CoFounder.setHorizontalAlignment(SwingConstants.CENTER);
                // set text color
		label_CoFounder.setForeground(Color.RED);
                // set font style and size
		label_CoFounder.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
                 // set bounds
		label_CoFounder.setBounds(30, 169, 187, 59);
		panel.add(label_CoFounder);
		
                // create label for DR NAME
		JLabel label_Doctor1 = new JLabel("DR.Omiama");
                //set Alignment text to center
		label_Doctor1.setHorizontalAlignment(SwingConstants.CENTER);
                // set font style and size
		label_Doctor1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
                 // set bounds
		label_Doctor1.setBounds(227, 169, 313, 59);
		panel.add(label_Doctor1);
                
                // create label for CO FOUNDER
                JLabel label_CoFounder2 = new JLabel("CO FOUNDER 2: ");
                //set Alignment text to center
		label_CoFounder2.setHorizontalAlignment(SwingConstants.CENTER);
                 // set text color
		label_CoFounder2.setForeground(Color.RED);
                // set font style and size
		label_CoFounder2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
                // set bounds
		label_CoFounder2.setBounds(0, 200, 301, 80);
		panel.add(label_CoFounder2);
                
                // create label for DR NAME
                JLabel label_Doctor2 = new JLabel("DR.Ramla");
                 //set Alignment text to center
		label_Doctor2.setHorizontalAlignment(SwingConstants.CENTER);
                // set font style and size
		label_Doctor2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
                // set bounds
		label_Doctor2.setBounds(250, 200, 300, 80);
		panel.add(label_Doctor2);
		
                // reference label
		JLabel Refernce_Label = new JLabel("www.gbpechos.com");
                 //set Alignment text to center
		Refernce_Label.setHorizontalAlignment(SwingConstants.CENTER);
                  // set text color
		Refernce_Label.setForeground(Color.RED);
                // set font style and size
		Refernce_Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
                // set bounds
		Refernce_Label.setBounds(30, 239, 510, 90);
		panel.add(Refernce_Label);
		
        }
	public static void main(String[] args) {
               // run method
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					Detail_hospital= new Detail();
					Detail_hospital.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
