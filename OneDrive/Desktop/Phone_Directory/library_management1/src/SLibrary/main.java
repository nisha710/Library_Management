package SLibrary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	JFrame mainn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.mainn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}
	//static boolean isVisible = true;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainn = new JFrame();
		mainn.setBounds(100, 100, 718, 548);
		mainn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainn.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(65, 44, 576, 429);
		mainn.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Category");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Category c=new Category();
				c.Categoryy.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(200, 29, 135, 21);
		panel.add(btnNewButton);
		
		JButton btnAuthor = new JButton("Author");
		btnAuthor.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAuthor.setBounds(200, 93, 135, 21);
		panel.add(btnAuthor);
		
		JButton btnPublisher = new JButton("Publisher");
		btnPublisher.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPublisher.setBounds(200, 170, 135, 21);
		panel.add(btnPublisher);
	}

	
}
