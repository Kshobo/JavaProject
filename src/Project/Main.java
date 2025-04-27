package Project;

/*
 Author: Kieron Ayoshobo (C23436012)
 Description: Reading from a file (data set) to determine the likelihood
 of someone being approved for a loan
 Date: 28/04/2025
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener{
	
	JFrame frame;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JButton button;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel loanresult;
	
	public Main()
	{
		// Creating the GUI 
		frame = new JFrame();
		this.setTitle("Predictive Model");
		this.setSize(450,450);
		this.setLayout(new FlowLayout());
		
		text1 = new JTextField();
		text1.setPreferredSize(new Dimension(250, 40));
		
		text2 = new JTextField();
		text2.setPreferredSize(new Dimension(250, 40));
		
		text3 = new JTextField();
		text3.setPreferredSize(new Dimension(250, 40));
		
		text4 = new JTextField();
		text4.setPreferredSize(new Dimension(250, 40));

		button = new JButton("Submit");
		button.addActionListener(this);
		
		// Questions and Text fields in GUI
		label1 = new JLabel("If you are older than 45 enter 'Older' otherwise 'Younger'?");
		this.add(label1);
		this.add(text1);
		label2 = new JLabel("Is your annual household income over $120,000 ('Yes' or 'No')?");
		this.add(label2);
		this.add(text2);
		label3 = new JLabel("Is your credit score over 650 ('Yes' or 'No')?");
		this.add(label3);
		this.add(text3);
		label4 = new JLabel("Do you have a stable job ('Yes' or 'No')?");
		this.add(label4);
		this.add(text4);
		
		this.add(button);
		this.setVisible(true);
	}// end of main
	
	
	int approve = 0;
	int total = 0;
	int result;

	@Override
	public void actionPerformed(ActionEvent e) //
	{
		if(e.getSource() == button)
		{
			String age = text1.getText();
			String income = text2.getText();
			String credit = text3.getText();
			String job = text4.getText();
			String filename = "loan_approved_data.csv";
			String Yes = "Yes";
			
		
			BufferedReader reader = null;
			String line = "";
			
			try 
			{
				reader = new BufferedReader(new FileReader(filename));
				while ((line = reader.readLine()) != null)
				{
					String[] row = line.split(",");// Breaks down each line into segments based on commas and stores them in the array
					
					if(row[0].equals(age) && row[1].equals(income) && row[2].equals(credit) && row[3].equals(job))// If the values entered match those of a row on the file 
					{
						total = total + 1; 
						if(row[4].equals(Yes)) // if the loan was approved then 1 is added to approved 
						{
							approve = approve +1;
					    }
					}
					
					if (total > 0) // Calculating the likelihood of the loan being approved in %
					{
					    result = (approve * 100) / total;
					    System.out.println("Chance of Approval: " + result + "%");
					} 
					
				}// end of while loop
				
				
				
			} // end of try block
			
			catch(Exception e1)
			{
						
			}
			
		} 
	
	}// end of action performed
	
}
