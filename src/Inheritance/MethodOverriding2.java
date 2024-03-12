package Inheritance;

class Car
{
	public void start()
	{
		System.out.println("Car Start");
	}
	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	public void changeGear()
	{
		System.out.println("Car gear is changed");
	}
}

class LuxuryCar extends Car
{
	@Override
	public void changeGear()
	{
		System.out.println("Automatic gear");
	}
	public void openRoof()
	{
		System.out.println("Sunroof is opened");
	}
	
}

public class MethodOverriding2 {

	public static void main(String[] args) {
	Car c=new Car();
		c.accelerate();
		c.changeGear();
		
		c.start();
		// c.openRoof();
	}

}
