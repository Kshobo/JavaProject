package Package.java;

public class HashSetControl {
	public static void main(String[]args)
	{
		LabHashSet hs = new LabHashSet();
		
		hs.addEntry("Hibernia");
		hs.printSet();
		hs.matchEntry("Louth");
		//hs.HashSet();
		//hs.printSet();
		hs.sortSet();
		hs.reverse();
		hs.shuffleSet();

	}

}
