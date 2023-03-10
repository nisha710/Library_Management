package SLibrary;

import java.awt.EventQueue;
//import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_page {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField txtusername;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	//static boolean isVisible = true;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page window = new login_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_page() {
		initialize();
	}
//	public void hide() {
//		 visible = false;
//		 super.hide();
//		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIBRARY");
		lblNewLabel.setBounds(0, 0, 0, 0);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(641, 1, 1, 547);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "library", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 37, 79, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 140, 145, 33);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 43, 96, 19);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 149, 220, 19);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(150, 248, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBounds(312, 248, 85, 21);
		panel.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("LIBRARY");
		lblNewLabel_2.setBounds(0, 0, 0, 0);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 642, 1);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "library", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 37, 79, 27);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("PASSWORD");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(10, 140, 145, 33);
		panel_1.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 43, 96, 19);
		panel_1.add(textField_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(138, 149, 220, 19);
		panel_1.add(passwordField_1);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(150, 248, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel_1.setBounds(312, 248, 85, 21);
		panel_1.add(btnCancel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(36, 56, 527, 371);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Library");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(154, 42, 105, 36);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Username");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(36, 117, 105, 36);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Password");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(23, 185, 105, 36);
		panel_2.add(lblNewLabel_4_2);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//public void actionPerformed(java.awt.event.ActionEvent evt) {
				String Username=txtusername.getText();
				String Pass=txtpass.getText();
				
				if(Username.equals("John")&&Pass.equals("123"))
				{
					main m=new main();
					this.hide();
//					txtusername.hide();
//					txtpass.hide();
					m.mainn.setVisible(true);
					//m.setVisible(true);
					//The setVisible(true) method makes the frame appear on the screen. If 
					//you forget to do this, the frame object will exist as an object in memory, 
					//but no picture will appear on the screen.
				}
				else {
					JOptionPane.showMessageDialog(null, "Ysername or password do not match!!!");
					txtusername.setText("");
					txtpass.setText("");
					txtusername.requestFocus();
				}
			}

			private void hide() {
				// TODO Auto-generated method stub
				txtusername.setText("");
				txtpass.setText("");
				//Username.equals("John")&&Pass.equals("123")
			}

//			private void hide() {
//				// TODO Auto-generated method stub
//				boolean visible=true;
//			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(87, 278, 85, 21);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Close");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setBounds(244, 280, 85, 21);
		panel_2.add(btnNewButton_2_1);
		
		txtusername = new JTextField();
		txtusername.setBounds(187, 128, 131, 19);
		panel_2.add(txtusername);
		txtusername.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(174, 196, 144, 19);
		panel_2.add(txtpass);
	}
}
