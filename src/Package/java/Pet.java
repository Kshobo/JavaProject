package Package.java;

// Author Kieron Soshobo
// Description: Using encapsulation with a pet example
// Date: 06/02/2025

public class Pet
{
	
	private String name;
	private String type;
	private boolean trained;
	
	Pet (String name, String type, boolean trained)
	{
		this.setname(name);
		this.settype(type);
		this.settrained(trained);
		
	}
	
	public String toString()
	{
		return "The name of the pet is: " + this.name +"\nThe pet is a " + this.type +"\nIs the pet trained: " +this.trained;
	}
	
	public String getname() 
	{
		return name;
	}
	
	public String gettype()
	{
		return type;
	}
	
	public boolean gettrained()
	{
		return trained;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}

	public void settype(String type)
	{
		this.type = type;
	}

	public void settrained(boolean trained)
	{
		this.trained = trained;
	}
	
	
	public void  makenoise() // A method to print the noise a pet makes on what the type is 
	{
		if (type.equals("Dog"))
		{
			System.out.println("*Bark*");
		}
		if (type.equals("Cat"))
		{
			System.out.println("*Meow*");
		}
	}

}
