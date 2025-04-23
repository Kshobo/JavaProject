package Practice;

public class vehiclemain {
	public static void main(String[]args)
	{
		Car car1 = new Car ("BMW", 100, 2023, 4);
		Motorcycle m1 = new Motorcycle ("Yamaha", 140, 2018, true);
		electricCar ec1 = new electricCar ("BMW", 110, 2023, 4, 10000);
		
		m1.accelerate(10); // motorcycle accelerate method 
		car1.accelerate(10); // Car accelerate method 
		ec1.accelerate(10); // Car accelerate method 

		
		m1.brake(20); // Motorcycle brake method
		car1.brake(20); //Car brake method
		ec1.brake(20); //Car brake method

		
		System.out.println(m1.tostring());
		System.out.println(ec1.tostring());
		System.out.println(car1.tostring());


	}

}
