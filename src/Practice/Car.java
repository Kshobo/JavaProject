package Practice;

/**
 * 
 */

public class Car extends Vehicle{
	
	
	private int doors;
	
	
	public Car(String brand, int speed, int year, int doors)
	{
		super(brand, speed, year);
		setdoors(doors);
	}
	
	
	//setter for doors variable
	void setdoors(int doors)
	{
		this.doors = doors;
	}
	

	public String tostring()
	{
		return super.tostring() + " This car has " + this.doors + " doors";
	}
	
	public void honk()
	{
		System.out.println("beep beep");
	}
	
	
/*
 * 
 	//private String brand;
	//private int speed;
	//private int year;
	private int doors;
	
	public Car(String brand, int speed, int year, int doors)
	{
		this.brand = brand;
		this.speed = speed;
		this.year = year;
		this.door = doors;
	}
	
	public String tostring()
	{
		return "The vehicle's brand is " + this.brand +" The vehicle's top speed is "+ this.speed +" and the vehicle's year is " + this.year + " This car has" + this.doors + "doors";
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
