package Practice;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Screen extends JFrame implements ActionListener, MouseListener
{
	
	JButton button1;
	JButton button2;
	JPanel panel;
	JLabel label;


	Screen()
	{
		super("text"); // calls the constructor of JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		
		button1 = new JButton("Button 1");
		button1.setBounds(200, 100, 100, 50);
		button1.setToolTipText("This the first button I have crated");
		button1.addActionListener(this);

		button2 = new JButton("Button 2");
		button2.setBounds(200, 150, 100, 50);
		button2.setToolTipText("This the second button I have crated");
		button2.addActionListener(this);
		
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
		
		add(button1); //Adding button 1 
		add(button2); //Adding button2
		add(label);
		add(check);
		add(text);
		add(label);
		add(panel);
		

	
		}// End of Screen instantiation
	////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == button1)
			{
				JOptionPane.showMessageDialog(this, "You clicked button1");
			}
			else if (e.getSource() == button2)
			{
				JOptionPane.showMessageDialog(this, "You clicked button2");
			}
			else
			{
				System.out.println("Error");
			}

		}
		
		public void Mousepanel(MouseEvent e)
		{
			JOptionPane.showMessageDialog(panel,  "You hovered");
			
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			JOptionPane.showMessageDialog(panel,  "You hovered");			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
	
		

	
}// End of Class screen



