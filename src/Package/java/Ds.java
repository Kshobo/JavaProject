package Package.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ds {
		
	public ArrayList<String> printrows()
	{
		ArrayList<String> row = new ArrayList<>();
		
		try {
			File file = new File("employee_data.csv");
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine())
			{
				row.add(scanner.nextLine());
			}
			scanner.close();
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	public void addData()
	{

		try 
		(
			FileWriter writer = new FileWriter("employee_data.csv", true);
			PrintWriter pw = new PrintWriter(writer);
		)
		{
			pw.println("Hello Kieron *NEW DATA*");
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
