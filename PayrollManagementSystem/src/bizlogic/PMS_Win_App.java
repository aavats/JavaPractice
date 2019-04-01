package bizlogic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;



class PMSGUIApp implements ActionListener {
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet virtblrowptr;
	
	
	// CONTAINERS
	JFrame mainwindow;

	// SUB CONTAINER
	JPanel pnlcrud, pnlnavig;

	// CONTROLS FOR MAINWINDOW
	JLabel lblid, lblname, lblsal;
	JTextField txtid, txtname, txtsal;

	// CONTROLS FOR THE CRUD PANEL
	JButton btninsert, btnupdate, btndelete, btnsearch;

	// CONTROLS FOR THE NAVIAGTIONS PANEL
	JButton btnfirst, btnprev, btnnext, btnlast;

	JMenuBar menubar;

	JMenu menuFile, menuEdit;

	JMenuItem miNew, miOpen;

	JMenuItem miCopy, miPaste;

	public void CreateGUI() {
		
		// SWING AND AWT
		
		// Creating the main window
		mainwindow = new JFrame();
		mainwindow.setTitle("PMS Version 1.0");

		// Setting the background image to the frame

		// String imageloc = "C:\\Images\\pic.png";
		ImageIcon imageref = new ImageIcon("C:\\Images\\pic.png");
		JLabel hostimage = new JLabel(imageref);
		mainwindow.setContentPane(hostimage);

		// Work for the menu with menuitem begins
		menubar = new JMenuBar();

		menuFile = new JMenu();
		menuFile.setText("MyFile");

		miNew = new JMenuItem();
		miNew.setText("MyNew");
		miNew.addActionListener(this);
		
		miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.ALT_MASK));
		
		
		
		miOpen = new JMenuItem("MyOpen");
		miOpen.addActionListener(this);
		miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_MASK));
		
		
		
		menuFile.add(miNew);
		menuFile.add(miOpen);

		menubar.add(menuFile);

		// For Edit Menu

		menuEdit = new JMenu("MyEdit");

		miCopy = new JMenuItem();
		miCopy.setText("MyCopy");
		miCopy.addActionListener(this);
		
		
		
		miPaste = new JMenuItem("MyPaste");
		miPaste.addActionListener(this);
		
		menuEdit.add(miCopy);
		menuEdit.add(miPaste);

		menubar.add(menuEdit);

		mainwindow.setJMenuBar(menubar);

		// Creating the controls for JFrame
		lblid = new JLabel();
		lblid.setText("EMP ID : ");

		txtid = new JTextField(5);
		txtid.setEditable(false);

		lblname = new JLabel("EName :");
		txtname = new JTextField(20);

		lblsal = new JLabel("ESalary :");
		txtsal = new JTextField(20);

		// Put the controls into the frame
		mainwindow.add(lblid);
		mainwindow.add(txtid);

		mainwindow.add(lblname);
		mainwindow.add(txtname);

		mainwindow.add(lblsal);
		mainwindow.add(txtsal);

		// Creating the panel for crud in frame
		pnlcrud = new JPanel();

		pnlcrud.setBorder(BorderFactory.createTitledBorder("CRUD Support"));

		btninsert = new JButton("INSERT");
		// We need to register btninsert object with ActionListener 
		// interface; then only mem ref of btninsert will be passed
		// to the actionPerformed method of ActionListener
		btninsert.addActionListener(this);
		
		
		
		btnupdate = new JButton("UPDATE");
		btnupdate.addActionListener(this);
		
		
		btndelete = new JButton("DELETE");
		btndelete.addActionListener(this);
		
		
		btnsearch = new JButton("SEARCH");
		btnsearch.addActionListener(this);
		
		pnlcrud.add(btninsert);
		pnlcrud.add(btnupdate);
		pnlcrud.add(btndelete);
		pnlcrud.add(btnsearch);

		mainwindow.add(pnlcrud);

		// Creating the panel for navigation in frame
		pnlnavig = new JPanel();

		pnlnavig.setBorder(BorderFactory.createTitledBorder("Navigation Support"));

		btnfirst = new JButton("<<");
		btnfirst.addActionListener(this);
		
		
		
		btnprev = new JButton("<");
		btnprev.addActionListener(this);
		
		btnnext = new JButton(">");
		btnnext.addActionListener(this);
		
		btnlast = new JButton(">>");
		btnlast.addActionListener(this);
		
		
		pnlnavig.add(btnfirst);
		pnlnavig.add(btnprev);
		pnlnavig.add(btnnext);
		pnlnavig.add(btnlast);

		mainwindow.add(pnlnavig);

		// Setting the layout for the controls of frame

		FlowLayout dec = new FlowLayout();

		// GridLayout dec = new GridLayout(3,2);

		mainwindow.setLayout(dec);

		mainwindow.setSize(700, 500);
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainwindow.setVisible(true);

	}

	public void DatabaseOps() {
		
		// JDBC API : java.sql.*;
		// Step 1 : Driver Load
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Step 2 : Establish connectivity in between
		// front end with back end
		try {
		
			con = DriverManager.getConnection("jdbc:mysql://localhost/pmsdb","root","root");
		
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
			String msg = "select * from emp_det";
			
			virtblrowptr = stmt.executeQuery(msg);
			//virtblrowptr.next();
			
			//System.out.println(virtblrowptr.getInt("empid"));
			//System.out.println(virtblrowptr.getString("empname"));
			//System.out.println(virtblrowptr.getDouble("empsalary"));
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
				
		

	}
	
	public void FillTextBox()
	{
		
		String eid;
		try {
			eid = Integer.toString(virtblrowptr.getInt(1));
			txtid.setText(eid);
			txtname.setText(virtblrowptr.getString(2));
			txtsal.setText(Double.toString(virtblrowptr.getDouble(3)));
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent controlref) {

		if (controlref.getActionCommand() == "INSERT") {
			
			rcrinsert();
			

		} else if (controlref.getActionCommand() == "UPDATE") {
			rcrupdate();

		}
		 else if (controlref.getActionCommand() == "DELETE") {
				
			 rcrdelete();
				

			}
		 else if (controlref.getActionCommand() == "SEARCH") {
				rcrsearch();

			}

		 else if (controlref.getActionCommand() == "<<") {
				//System.out.println("FIRST button has recvd event from user");
			 	rcrfirst();
			}
		 else if (controlref.getActionCommand() == "<") {
				//System.out.println("PREV button has recvd event from user");
			 	rcrprev();
			}
		 else if (controlref.getActionCommand() == ">") {
				//System.out.println("NEXT button has recvd event from user");

			 rcrnext();
			 
			 
			 
			}
		 else if (controlref.getActionCommand() == ">>") {
				//System.out.println("LAST button has recvd event from user");
			 	rcrlast();
			 
			}
		 else if (controlref.getActionCommand() == "MyNew") {
				
			 
			 JFrame contactUs = new JFrame();
			 contactUs.setTitle("Contact Us Frame Of PMS");
			 
			 contactUs.setSize(400,400);
			 contactUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			 mainwindow.dispose();
			 
			 
			 contactUs.setVisible(true);
			 
			 

			}
		 else if (controlref.getActionCommand() == "MyOpen") {
				System.out.println("MI MyOpen has recvd event from user");

			}
		 else if (controlref.getActionCommand() == "MyCopy") {
				System.out.println("MI MyCopy has recvd event from user");

			}

		 else if (controlref.getActionCommand() == "MyPaste") {
				System.out.println("MI MyPaste has recvd event from user");

			}


	}

	private void rcrsearch() {
		// TODO Auto-generated method stub
		
		if(txtid.getText().trim().isEmpty())
		{
			JOptionPane.showMessageDialog(mainwindow, "We need id for search to work!!");
		}else
		{
			try {
				pstmt = con.prepareStatement("select * from emp_det where empid = ?");
				
				int eid =Integer.parseInt(txtid.getText());
				
				pstmt.setInt(1, eid);
				
				virtblrowptr = pstmt.executeQuery();
				
				
				if(virtblrowptr.next())
				{
					FillTextBox();
				}else
				{
					JOptionPane.showMessageDialog(mainwindow, eid+" not in our record!!");
					
					
				}
				
				
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

	private void rcrupdate() {
		
		
		try {
			int neweid = Integer.parseInt(txtid.getText());
			String newname = txtname.getText();
			double newsal =Double.parseDouble(txtsal.getText());

			virtblrowptr.updateInt(1, neweid);
			virtblrowptr.updateString(2, newname);
			virtblrowptr.updateDouble(3, newsal);

			virtblrowptr.updateRow();
			JOptionPane.showMessageDialog(mainwindow, "Record got UPDATED!!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	private void rcrdelete() {
		
		try {
			virtblrowptr.deleteRow();
			JOptionPane.showMessageDialog(mainwindow, "Record got Deleted!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void rcrinsert() {
		// TODO Auto-generated method stub
		
		try {
			
			virtblrowptr.moveToInsertRow();
			
			int neweid = Integer.parseInt(txtid.getText());
			String newname = txtname.getText();
			double newsal =Double.parseDouble(txtsal.getText());
			
			virtblrowptr.updateInt(1, neweid);
			virtblrowptr.updateString(2, newname);
			virtblrowptr.updateDouble(3, newsal);

			virtblrowptr.insertRow();
			JOptionPane.showMessageDialog(mainwindow, "Record got insertede!!");
			
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	private void rcrlast() {
		// TODO Auto-generated method stub
		try {
			virtblrowptr.last();
			FillTextBox();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private void rcrnext() {
		try {
			if(virtblrowptr.next())
			{
				FillTextBox();
			}else
			{
				virtblrowptr.previous();
				JOptionPane.showMessageDialog(mainwindow, "You are at the last record");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void rcrprev() {
		// TODO Auto-generated method stub
		try {
			if(virtblrowptr.previous())
			{
				FillTextBox();
			}else
			{
				virtblrowptr.next();
				JOptionPane.showMessageDialog(mainwindow, "You are at the first record");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private void rcrfirst() {
		// TODO Auto-generated method stub
		try {
			virtblrowptr.first();
			FillTextBox();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class PMS_Win_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PMSGUIApp appbegin = new PMSGUIApp();

		appbegin.CreateGUI();
		
		appbegin.DatabaseOps();

	}

}
