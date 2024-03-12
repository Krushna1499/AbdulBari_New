package Inheritance;

class circle

{
	public double radius;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
	}
}

class cylinder extends circle
{
	public double height;
	
	public double volume()
	{
		return area()*height;
	}
}
public class P1 {

	public static void main(String[] args) {
		cylinder c= new cylinder();
		c.radius=7;
		c.height=10;
		System.out.println(c.area());
		System.out.println(c.volume());
	}

}
