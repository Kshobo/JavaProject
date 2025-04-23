package Package.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

	
	
	
	Person[] name = new Person [2];
	
	
	
	
	
	
	
	File fileHandle;
	private String filename;
	String [] values;
	int i = 0;
	
	public FileProcessor(String filename)
	{
		setFilename(filename);
	}
	
	public void openFile()
	{
		fileHandle = new File(filename);
	}
	
	// Reading a file and putting the contents of a line into an array
	public String[] readFile()
	{
		Scanner scan;
		try {
			scan = new Scanner(fileHandle);
			while (scan.hasNextLine())
			{
				String line = scan.nextLine();
				values[i] = line;
				i+=1;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return values;
	}
	
	

	//Getter for filename
	public String getFilename() {
		return filename;
	}
	//Setter for filename
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
