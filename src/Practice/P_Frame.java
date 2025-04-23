package Practice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame; 
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;

public class P_Frame extends JFrame implements ActionListener, Mouselistener{
	
	JButton button = new JButton();
	public int i = 0;
	
	public P_Frame()
	{
		
		//ImageIcon icon = new ImageIcon("face.mp4");

		button.setBounds(200, 100, 100, 50);	
		button.addActionListener(this);
		button.setText("Hello");
		button.setFocusable(false);// gets rid of outline of button text
		button.setForeground(Color.MAGENTA);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setIcon(icon);
		
		this.setTitle("Title");// sets title of frame
		this.setLayout(null);
		this.setSize(500, 500);// sets the size of the frame
		this.setVisible(true); // allows he frame to be visible 
		this.add(button);
	
		
		//Labels
		/*
		JLabel label = new JLabel();
		label.setText("Hello everyone");// Set text of label
		label.setHorizontalTextPosition(JLabel.RIGHT);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		this.add(label);
		*/
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(i <5)
		{
			if (e.getSource()== button)
			{
				System.out.println("Chicken");
				i +=1;
			}
		}
		else{

			if (e.getSource()== button)
			{
				System.out.println("CP");
			}
		}
		
	}
}
