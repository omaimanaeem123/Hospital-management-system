/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import Hospitals.Hospital;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

// class login for login to the main page and implement the abstract function
public class Login extends JFrame implements AbstractLogin{
        // private fields for components 
	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtPassword;
	private JTextField txtLoginSystem;
	private JTextField txtHospitalManagementSystem;
	private JTextField txtHospitalName;
	private JTextField textField;
        private static Login frame2;
        int atm=0;
        private JFrame frame1;
        private JPasswordField textField_1;
	
	/**
	 * Create the frame.
	 */
        @Override
        // abstract method body
        public void Login_user(){
	
                //for window Title
                //frame1= new JFrame("login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //setBounds for window
		setBounds(100, 100,1183 ,795);
                //set contentpane for Border
		contentPane = new JPanel();
                //for Background color
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
                //using JPanel for borderText
		JPanel panel = new JPanel();
                //set  line border color
		panel.setBorder(new LineBorder(Color.WHITE, 3));
                //set background color
		panel.setBackground(Color.BLACK);
                //set bounds
		panel.setBounds(10, 11, 1150, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
                //textfeild for hospital management system
		txtHospitalManagementSystem = new JTextField();
                //set background color
		txtHospitalManagementSystem.setBackground(Color.WHITE);
                //set text color background events
		txtHospitalManagementSystem.setForeground(Color.BLUE);
                //set text
		txtHospitalManagementSystem.setText("HOSPITAL MANAGEMENT SYSTEM");
                //set Alignment text for center
		txtHospitalManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
                // set font style and size
		txtHospitalManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 35));
                // set columns
		txtHospitalManagementSystem.setColumns(50);
                // set bounds 
		txtHospitalManagementSystem.setBounds(11, 11, 1123, 77);
		panel.add(txtHospitalManagementSystem);
		
                // create panel 1 for borderText 
		JPanel panel_1 = new JPanel();
                // set line Border color
		panel_1.setBorder(new LineBorder(Color.WHITE, 3));
                // set background color
		panel_1.setBackground(Color.BLACK);
                // set bounds 
		panel_1.setBounds(10, 639, 1143, 99);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
                //textfeild  for hospital name
		txtHospitalName = new JTextField();
                // set hospital name
		txtHospitalName.setText("CARE AND CURE HOSPITAL");
                // set alignment center for text
		txtHospitalName.setHorizontalAlignment(SwingConstants.CENTER);
                // set text color backround events
		txtHospitalName.setForeground(Color.BLUE);
                // set font style and size
		txtHospitalName.setFont(new Font("Times New Roman", Font.BOLD, 35));
                // set columns
		txtHospitalName.setColumns(10);
                // set background color for border text
		txtHospitalName.setBackground(Color.WHITE);
                // set bounds
		txtHospitalName.setBounds(11, 11, 1123, 77);
		panel_1.add(txtHospitalName);
                
		// create panel 2 for login system
		JPanel panel_2 = new JPanel();
                // set line border color
		panel_2.setBorder(new LineBorder(Color.WHITE, 3));
                // set background color
		panel_2.setBackground(Color.BLACK);
                // set bounds
		panel_2.setBounds(209, 201, 792, 339);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
                
		// create textfeild for username
		txtLogin = new JTextField();
                // set background color for username
		txtLogin.setBackground(Color.WHITE);
                // set alignment center for text
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
                // set font and size
		txtLogin.setFont(new Font("Lucida Fax", Font.BOLD, 25));
                // set text as Username
		txtLogin.setText("USERNAME");
                // set bounds
		txtLogin.setBounds(95, 119, 224, 48);
		panel_2.add(txtLogin);
		txtLogin.setColumns(10);
		
                // create textfeild for password
		txtPassword = new JTextField();
                // set background color for password
		txtPassword.setBackground(Color.WHITE);
                 // set text as password
		txtPassword.setText("PASSWORD");
                // set alignment center for text
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
                // set font and size
		txtPassword.setFont(new Font("Lucida Fax", Font.BOLD, 25));
		txtPassword.setColumns(10);
		txtPassword.setBounds(95, 193, 224, 48);
		panel_2.add(txtPassword);
                
                // text field for write password
                textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Lucid Fax", Font.BOLD, 25));
		textField_1.setBounds(467, 200, 215, 41);
		panel_2.add(textField_1);
                
		// create text field for login system name
		txtLoginSystem = new JTextField();
                // set background color 
		txtLoginSystem.setBackground(Color.WHITE);
                // set text color
		txtLoginSystem.setForeground(Color.BLUE);
                // set text as login system
		txtLoginSystem.setText("LOGIN SYSTEM");
                // set alignment center for text
		txtLoginSystem.setHorizontalAlignment(SwingConstants.CENTER);
                // set font and size
		txtLoginSystem.setFont(new Font("Lucida Fax", Font.BOLD, 35));
		txtLoginSystem.setBounds(190, 25, 419, 64);
		panel_2.add(txtLoginSystem);
		txtLoginSystem.setColumns(10);
                
		// text field for write username
		textField = new JTextField();
		textField.setFont(new Font("Lucida Fax", Font.BOLD, 20));
		textField.setBounds(467, 119, 215, 41);
		panel_2.add(textField);
		textField.setColumns(10);
		
                // create button clear for clear the text field
		JButton btnNewButton = new JButton("CLEAR");
                // using actionlistener to perform action on button
		btnNewButton.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
                // set font for button text
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 25));
		btnNewButton.setBounds(324, 265, 150, 48);
		panel_2.add(btnNewButton);
		
                // create button for login
		JButton button = new JButton("LOGIN");
		button.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
			String username=textField.getText();
			String password=textField_1.getText();
                        // condition for username and password
			if(username.contains("123") && password.contains("123")) {
				frame2.setVisible(false);
                                // create object for hospital class to open main page
				Hospital I=new Hospital();
				I.setVisible(true);
			}
			else if(!(username.contains("123") && password.contains("123"))) {
				textField.setText("");
				textField_1.setText("");
				atm+=1;
				if(atm==3) {
                                        // using joption for show dialog box message if we enter 3 times wrong password
					JOptionPane.showMessageDialog(frame1, "InValid Login", "u attempt 3 Time", JOptionPane.CANCEL_OPTION);
					System.exit(0);
				}
			}
			}
		});
		button.setFont(new Font("Lucida Fax", Font.BOLD, 25));
		button.setBounds(112, 265, 150, 48);
		panel_2.add(button);
                
		// create button for exit the program 
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                        frame1 =new JFrame();
	               if(JOptionPane.showConfirmDialog(frame2, "Confirm if U Want To Exit" , "Hospital Management System", 
                       JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
	               System.exit(0);	
    }
                        }
                });
		btnExit.setFont(new Font("Lucida Fax", Font.BOLD, 25));
		btnExit.setBounds(532, 265, 150, 48);
		panel_2.add(btnExit);
}
        
        /**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
                // run method
		EventQueue.invokeLater(() -> {
                    try {
                        frame2 = new Login();
                        frame2.Login_user();
                        frame2.setVisible(true);
                    } 
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                });
	}

}

