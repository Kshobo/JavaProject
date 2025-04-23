package Practice;

import java.util.Date;

public class Staff extends Person{
	
	private String name;
	private Date DOB;
	private int startyear;
	private String address;
	private String role;
	private String schoolname;
	
	public Staff (String name, String DOB, int startyear, String address, String, role, String schoolname)
	{
		this.name = name;
	}
	 
	//getters and setters 
	public String getname()
	{
		return name;
	}
	
	public void setname (String name)
	{
		this.name = name;
	}
	
}

