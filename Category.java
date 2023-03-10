package SLibrary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class Category {

	JFrame Categoryy;
	private JTextField txtcategory;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Category window = new Category();
					window.Categoryy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	static boolean isVisible = true;
	/**
	 * Create the application.
	 */
	public Category() {
		initialize();
		Connect();
		Category_load() ;
		//table_load();
	}
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JTable table_1;
	//private JTable table_3;
	public void Connect()
    {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/SLibrary","root","");
        }
        catch (ClassNotFoundException ex)
        {
          ex.printStackTrace();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
 
    }
	public void Category_load() {
		int c;
		try {
			String query="select * from Category";
	        pst=con.prepareStatement(query);
	        rs = pst.executeQuery();
////	        ResultSetMetaData rsd=rs.getMetaData();
//	        c=rsd.getColumnCount();
////	        DefaultTableModel d=(DefaultTableModel)jTablel.getModel();
//		pst=con.prepareStatement("select * from Category");
//		rs=pst.executeQuery();
		table_1.setModel(DbUtils.resultSetToTableModel(rs));
		//30
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Categoryy = new JFrame();
		Categoryy.setBounds(100, 100, 949, 522);
		Categoryy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Categoryy.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 49, 826, 394);
		Categoryy.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Category");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(126, 41, 129, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Category Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(21, 107, 137, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Status");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(21, 145, 137, 28);
		panel.add(lblNewLabel_1_1);
		
		txtcategory = new JTextField();
		txtcategory.setBounds(177, 114, 96, 19);
		panel.add(txtcategory);
		txtcategory.setColumns(10);
		
		JComboBox txtstatus = new JComboBox();
		txtstatus.setModel(new DefaultComboBoxModel(new String[] {"Active", "DeActive"}));
		txtstatus.setBounds(177, 152, 96, 21);
		panel.add(txtstatus);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String category=txtcategory.getText();
				String status=txtstatus.getSelectedItem().toString();
				try {
				pst=con.prepareStatement("insert into Category(catname,status)values(?,?)");
				pst.setString(1, category);
				pst.setString(2, status);
				int k=pst.executeUpdate();
				if(k==1) {
					JOptionPane.showMessageDialog(null, "Category created");
					Category_load();
					txtcategory.setText("");
					txtstatus.setSelectedIndex(-1);
					txtcategory.requestFocus();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Error!!!!!!!!");
				}
				
				
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(56, 250, 85, 21);
		panel.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpdate.setBounds(177, 250, 85, 21);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(56, 286, 85, 21);
		panel.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(177, 286, 85, 21);
		panel.add(btnCancel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(402, 37, 388, 315);
		panel.add(scrollPane);
		
		
		
		
		
		
//		table_3 = new JTable();
//		scrollPane.setViewportView(table_3);
		
		JScrollPane table_2 = new JScrollPane();
		//scrollPane.setViewportView(table);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_1 = new JTable();
		table_2.setViewportView(table_1);
	}
}
