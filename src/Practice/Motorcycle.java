package Practice;

public class Motorcycle extends Vehicle{
	

	private boolean twoSeat;
	
	
	public Motorcycle(String brand, int speed, int year, boolean twoSeat)
	{	
		super(brand, speed, year);
	
		settwoSeat(twoSeat);
	}
	
	void settwoSeat(boolean twoSeat)
	{
		this.twoSeat = twoSeat;
	}

	public String tostring()
	{
		return super.tostring() + " The motorcycle is twoseater: " + this.twoSeat;
	}
	
	public void honk()
	{
		System.out.println("Vrooooom");
	}
	
	
/*

	//private String brand;
	//private int speed;
	//private int year;
	//private boolean twoSeat;
	
	public Car(String brand, int speed, int year, int doors)
	{
		this.brand = brand;
		this.speed = speed;
		this.year = year;
		this.boolean = boolean;
	}
	
	public String tostring()
	{
		return "The vehicle's brand is " + this.brand +" The vehicle's top speed is "+ this.speed +" and the vehicle's year is " + this.year  The motorcycle is twoseater: " + this.twoSeat;
	}
	
	 
	//Method to increase the speed of the motorcycle
	public void accelerate (int increase)
	{
		this.speed += increase;
		System.out.println("The speed is now " +this.speed);
	}
	
	//Method to decrease the speed of the motorcycle
	public void brake (int decrease)
	{
		this.speed -= decrease;
		System.out.println("The speed is now " +this.speed);
	}
	
*/

}
