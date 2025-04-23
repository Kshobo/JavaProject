package Practice;

//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P_File {
	public static void main(String[]args)
	{
		
		try 
		{
			FileWriter writer = new FileWriter("Secret_codes.txt");
			writer.append("Hello\n");
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//File file = new File("Secret_codes.txt");
		
		try (FileReader reader = new FileReader("Secret_codes.txt")){
			int data = reader.read();
			while(data != -1)
			{
				System.out.print((char)data);
				data = reader.read();
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		
		
		
		
		/*
		if(file.exists())
		{
			System.out.println("The file exists");
			System.out.println(file.getAbsolutePath());
		}
		else
		{
			System.out.println("This file doesnt exist :(");
		}
		*/
	}

}
