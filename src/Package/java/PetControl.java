package Package.java;

public class PetControl
{
	public static void main (String[]args)
	{
		Pet pet1 = new Pet ("Inferno", "Cat", true);
		System.out.println(pet1.toString());
		
		pet1.setname("Rocky");
		pet1.settrained(false);
		System.out.println(pet1.getname()); // using the getter method to print the name
		System.out.println(pet1.gettype()); // using the getter method to print the type of pet
		System.out.println(pet1.gettrained()); // using the getter method to print the 
		pet1.makenoise();
		

		// Jtextfield allows the editing of a single line of text
		// Jtextfield has 5 constructors
		
		// Jtextfield text1 = new Jtextfield("This is some sample text");
		// text1.setHorizontalAlignment(3);
		
		// String firstString = "thid is the first string";
		// String secondString = "thid is the first String1";
		// firstString.compareTo(secondString);
	}
}
