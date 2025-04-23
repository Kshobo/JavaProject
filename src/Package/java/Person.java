package Package.java;

public class Person {
	
	private String firstname;
	private String surname;
	private String city;
	
	
	public Person(String firstname, String surname, String city)
	{
		setFirstname(firstname);
		setSurname(surname);
		setCity(city);
	}
	

	
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	
	public String toSring()
	{
		return "This person is called " + firstname + " " + surname + " and lives in "+ city;
	}
	
}
