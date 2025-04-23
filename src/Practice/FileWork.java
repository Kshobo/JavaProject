package Practice;

import java.util.Scanner;
import java.io.File;

public class FileWork {
	File fileHandle;
	String fileName;

	public FileWork (String filename)
	{
		setfilename(filename);
	}
	
	
	public void openFile()//Good
	{
		filehandle = new File(fileName);
	}
	
	public String readfile() // Good
	{
		Scanner myscanner = new Scanner(fileHandle);
		String line = myscanner.nextLine();
		return line;
	}
	
	public String setfile ()
	{
		Scanner scan1 = new scanner;
		fileHandle.nextline(filename);
	}
	
	public void writefile(String Write)
	{
		this.openfile();
		printWriter myOutfile = new Printwriter(someFile);
		myOutFile.println.()
	}
	
}

FileWork fw = new FileWork("Application.txt");
fw.openFile("Application.txt");
fw.writeToFile("I have experience coding in Java");
fw.