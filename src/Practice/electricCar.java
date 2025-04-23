package Practice;


public class electricCar extends Car{

	private int range;
	
	public electricCar(String brand, int speed, int year, int doors, int range)
	{
		super(brand, speed, year,doors);
		setrange(range);
	}
	
	void setrange(int range)
	{
		this.range = range;
	}
	
	public String tostring()
	
	{
		return super.tostring() + " The electric car has a range of: " + this.range;
	}
}
