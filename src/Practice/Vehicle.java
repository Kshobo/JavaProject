package Practice;

public class Vehicle {
	
	private String brand;
	private int speed;
	private int year;
	
	public Vehicle(String brand, int speed, int year)
	{
		this.brand = brand;
		this.speed = speed; 
		this.year = year;
	}
	
	public String tostring()
	{
		return "The vehicle's brand is " + this.brand +" The vehicle's top speed is "+ this.speed +" and the vehicle's year is " + this.year;
	}
	
	//Method to increase the speed of the Vehicle
	public void accelerate (int increase)
	{
		this.speed += increase;
		System.out.println("The speed is now " +this.speed);
	}
	
	//Method to decrease the speed of the Vehicle
	public void brake (int decrease)
	{
		this.speed -= decrease;
		System.out.println("The speed is now " +this.speed);
	}
	
	// 
	public void honk()
	{
		System.out.println("honk honk");
	}
	

}
