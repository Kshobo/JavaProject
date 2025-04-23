package Package.java;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class PersonGui extends JFrame implements ActionListener, MouseListener{

	private JTextField firstnamefield;
	private JTextField surnamefield;
	private JTextField cityfield;
	private JButton saveButton;
	private ArrayList<Person> persons;


	Screen()
	{
		super("Simple Screen"); // calls the constructor of JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		persons = new ArerayList<>();
		
		add(new JLabel("nName"));
		firstnamefield = new JTextField(20);
		
		JLabel label = new JLabel();
		label.setText("Have a nice day");
		
		JCheckBox check = new JCheckBox("Check if youb like Dried Mangos");
		
		JTextField text = new JTextField(25);
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setPreferredSize(new Dimension(100, 100));
		panel.addMouseListener(this);
		label = new JLabel("Click or hover over");
		panel.add(label);
		
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);// setting the screen to be visible 

		add(label);
		add(check);
		add(text);
		add(label);
		add(panel);
		

	
		}// End of Screen instantiation
	////////////////////////////////////////////////////////////////////////////////////////////////////
		

}
