package Package.java;

import java.util.ArrayList;

public class Datacontrol {
	public static void main(String [] args)
	{
		Ds db = new Ds();
		
		ArrayList<String> fileData = db.printrows();
		for(String line: fileData)
		{
			System.out.println(line);
		}
		
		db.addData();
	}
}
