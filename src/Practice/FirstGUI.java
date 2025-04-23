package Practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FirstGUI extends JFrame implements ActionListener, MouseListener{

	JButton button1;
	JButton button2;
	JPanel panel;
	
	//constructor
	FirstGUI (String title)
	{
		super(title); // calls the constructor of JFrame 
		setSize(300,300);
		// set the layout for the screen to flowlayout i need FLOWLayout object to do so
		//FlowLayout f1 = new FlowLayout();
		//setLayout(f1);
		setLayout(new FlowLayout());
		
		button1 = new JButton("Cancel");
		button2 = new JButton("Save");
		button1.setToolTipText("this is highlighting button1");
		
		panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.blue);
		
		panel.add(button1);
		panel.add(button2);
		
		add(panel); // add panel to the screen
		setVisible(true);// if you dont put this in the screen wont appear

	}
	

	@Override

	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this, "Button Clicked");
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Button Clicked");
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Button Clicked");

	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

